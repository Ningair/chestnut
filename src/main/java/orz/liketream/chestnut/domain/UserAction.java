package orz.liketream.chestnut.domain;

public class UserAction extends BaseEntity{

	private String actionId;
	private String actionCode ;
	private String userId;
	private String userIp;
	
	@Override
	public String toString() {
		return "UserAction [actionId=" + actionId + ", actionCode=" + actionCode + ", userId=" + userId + ", userIp="
				+ userIp + "]";
	}
	
	public String getActionId() {
		return actionId;
	}
	public void setActionId(String actionId) {
		this.actionId = actionId;
	}
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
}
