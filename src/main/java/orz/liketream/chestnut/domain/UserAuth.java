package orz.liketream.chestnut.domain;

public class UserAuth extends BaseEntity {

	private String authId;
	private String password;
	private String userId;
	
	@Override
	public String toString() {
		return "UserAuth [authId=" + authId + ", password=********, userId=" + userId + "]";
	}
	
	public String getAuthId() {
		return authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
