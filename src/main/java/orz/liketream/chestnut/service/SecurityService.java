package orz.liketream.chestnut.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import orz.liketream.chestnut.dao.UserInfoDao;

@Service
public class SecurityService {

	@Autowired
	private UserInfoDao userInfoDao;
	
	public boolean login(String userNum, String password){
		boolean flag = true;
		if(1 != userInfoDao.countUserInfoByUserNumAndPassword(userNum, password)){
			flag = false;
		}
		return flag;
	}
}
