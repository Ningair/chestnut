package orz.liketream.chestnut.domain;

public class UserInfo extends BaseEntity{

	private String userId;
	private String userNum;
	private String userName;
	private UserAuth userAuth;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userNum == null) ? 0 : userNum.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		if (userNum == null) {
			if (other.userNum != null)
				return false;
		} else if (!userNum.equals(other.userNum))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userNum=" + userNum + ", userName=" + userName + ", userAuth=" + userAuth + "]";
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
