package orz.liketream.chestnut.demo;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

import junit.framework.Assert;

public class UseShiroDemo {

	@Test
	public void loginAndLogout() {
		
		 IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		 SecurityManager securityManager = factory.getInstance();
		 SecurityUtils.setSecurityManager(securityManager);
		 Subject subject = SecurityUtils.getSubject();
		 UsernamePasswordToken token = new UsernamePasswordToken("zhang","123");
		 subject.login(token);
		 
		 Assert.assertEquals(true, subject.isAuthenticated());
		 
		 subject.logout();
		 
		 Assert.assertEquals(false, subject.isAuthenticated());
	}

}
