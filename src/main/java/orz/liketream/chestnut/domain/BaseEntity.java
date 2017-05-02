package orz.liketream.chestnut.domain;

import java.util.Date;

public class BaseEntity {
	
	private Date   createDateTime;
	private String createUserId;
	private Date   lastUpdateDateTime;
	private String lastUpdateUserId;
	
	@Override
	public String toString() {
		return "BaseEntity [createDateTime=" + createDateTime + ", createUserId="
				+ createUserId + ", lastUpdateDateTime=" + lastUpdateDateTime + ", lastUpdateUserId=" + lastUpdateUserId
				+ "]";
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	public String getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	public Date getLastUpdateDateTime() {
		return lastUpdateDateTime;
	}
	public void setLastUpdateDateTime(Date lastUpdateDateTime) {
		this.lastUpdateDateTime = lastUpdateDateTime;
	}
	public String getLastUpdateUserId() {
		return lastUpdateUserId;
	}
	public void setLastUpdateUserId(String lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}
}
