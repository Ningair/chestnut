package orz.liketream.chestnut.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/application-context.xml")
public class SecurityServiceTest {
	
	@Autowired
	private SecurityService securityService;
	
	@Test
	public void login() {
		
		boolean rt1 = securityService.login("201601120001", "asdfg");
		boolean rt2 = securityService.login("201601120001", "zxcvb");
		
		Assert.assertTrue(rt1);
		Assert.assertFalse(rt2);
	}

}
