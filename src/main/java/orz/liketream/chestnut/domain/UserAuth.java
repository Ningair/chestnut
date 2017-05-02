package orz.liketream.chestnut.domain;

public class UserAuth extends BaseEntity {

	private String password;
	private String userId;
	
	@Override
	public String toString() {
		return "UserAuth [password=" + password + ", userId=" + userId + ", uid=" + uid + ", createDateTime="
				+ createDateTime + ", createUserId=" + createUserId + ", lastUpdateDateTime=" + lastUpdateDateTime
				+ ", lastUpdateUserId=" + lastUpdateUserId + "]";
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
