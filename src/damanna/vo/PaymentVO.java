package damanna.vo;

public class PaymentVO {
	private String paymentCode;
	private String memberId;
	private String paymentType;
	private String paymentAmount;
	private String eventCode;
	private String paymentDate;
	private String membershipSt;
	private String membershipEnd;

	public PaymentVO(String paymentCode, String memberId, String paymentType, String paymentAmount, String eventCode,
			String paymentDate, String membershipSt, String membershipEnd) {
		super();
		this.paymentCode = paymentCode;
		this.memberId = memberId;
		this.paymentType = paymentType;
		this.paymentAmount = paymentAmount;
		this.eventCode = eventCode;
		this.paymentDate = paymentDate;
		this.membershipSt = membershipSt;
		this.membershipEnd = membershipEnd;
	}

	public String getPaymentCode() {
		return paymentCode;
	}

	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getMembershipSt() {
		return membershipSt;
	}

	public void setMembershipSt(String membershipSt) {
		this.membershipSt = membershipSt;
	}

	public String getMembershipEnd() {
		return membershipEnd;
	}

	public void setMembershipEnd(String membershipEnd) {
		this.membershipEnd = membershipEnd;
	}

}
