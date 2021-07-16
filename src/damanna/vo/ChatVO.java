package damanna.vo;

public class ChatVO {
	private String chatId;
	private int chatNo;
	private String memberId;
	private String memberPartner;
	private String chatContent;
	private String chatTime;
	private String chatState;
	private String chatDelny;
	private String chatFiletype;
	private String chatFileroute;

	public ChatVO(String chatId, int chatNo, String memberId, String memberPartner, String chatContent, String chatTime,
			String chatState, String chatDelny, String chatFiletype, String chatFileroute) {
		super();
		this.chatId = chatId;
		this.chatNo = chatNo;
		this.memberId = memberId;
		this.memberPartner = memberPartner;
		this.chatContent = chatContent;
		this.chatTime = chatTime;
		this.chatState = chatState;
		this.chatDelny = chatDelny;
		this.chatFiletype = chatFiletype;
		this.chatFileroute = chatFileroute;
	}

	public String getChatId() {
		return chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public int getChatNo() {
		return chatNo;
	}

	public void setChatNo(int chatNo) {
		this.chatNo = chatNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPartner() {
		return memberPartner;
	}

	public void setMemberPartner(String memberPartner) {
		this.memberPartner = memberPartner;
	}

	public String getChatContent() {
		return chatContent;
	}

	public void setChatContent(String chatContent) {
		this.chatContent = chatContent;
	}

	public String getChatTime() {
		return chatTime;
	}

	public void setChatTime(String chatTime) {
		this.chatTime = chatTime;
	}

	public String getChatState() {
		return chatState;
	}

	public void setChatState(String chatState) {
		this.chatState = chatState;
	}

	public String getChatDelny() {
		return chatDelny;
	}

	public void setChatDelny(String chatDelny) {
		this.chatDelny = chatDelny;
	}

	public String getChatFiletype() {
		return chatFiletype;
	}

	public void setChatFiletype(String chatFiletype) {
		this.chatFiletype = chatFiletype;
	}

	public String getChatFileroute() {
		return chatFileroute;
	}

	public void setChatFileroute(String chatFileroute) {
		this.chatFileroute = chatFileroute;
	}

}
