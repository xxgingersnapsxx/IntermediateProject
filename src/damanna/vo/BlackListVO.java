package damanna.vo;

public class BlackListVO {
	private String memberId;
	private int blackCount;
	private String blackReason;
	private String blackDate;
	private String memberReported;

	public BlackListVO(String memberId, int blackCount, String blackReason, String blackDate, String memberReported) {
		super();
		this.memberId = memberId;
		this.blackCount = blackCount;
		this.blackReason = blackReason;
		this.blackDate = blackDate;
		this.memberReported = memberReported;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getBlackCount() {
		return blackCount;
	}

	public void setBlackCount(int blackCount) {
		this.blackCount = blackCount;
	}

	public String getBlackReason() {
		return blackReason;
	}

	public void setBlackReason(String blackReason) {
		this.blackReason = blackReason;
	}

	public String getBlackDate() {
		return blackDate;
	}

	public void setBlackDate(String blackDate) {
		this.blackDate = blackDate;
	}

	public String getMemberReported() {
		return memberReported;
	}

	public void setMemberReported(String memberReported) {
		this.memberReported = memberReported;
	}

}
