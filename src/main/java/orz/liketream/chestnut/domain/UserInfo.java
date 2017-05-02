package orz.liketream.chestnut.domain;

public class UserInfo extends BaseEntity{

	private String userNum;
	private String userName;
	private UserAuth userAuth;
	
	@Override
	public String toString() {
		return "UserInfo [userNum=" + userNum + ", userName=" + userName + ", userAuth=" + userAuth + ", uid=" + uid
				+ ", createDateTime=" + createDateTime + ", createUserId=" + createUserId + ", lastUpdateDateTime="
				+ lastUpdateDateTime + ", lastUpdateUserId=" + lastUpdateUserId + "]";
	}
	
	public String getUserNum() {
		return userNum;
	}
	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) { 
		this.userName = userName;
	}
	public UserAuth getUserAuth() {
		return userAuth;
	}
	public void setUserAuth(UserAuth userAuth) {
		this.userAuth = userAuth;
	}
	
}
