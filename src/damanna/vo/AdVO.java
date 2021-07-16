package damanna.vo;

public class AdVO {
	private String adGode;
	private String adImg;
	private String adSt;
	private String adEnd;

	public AdVO(String adGode, String adImg, String adSt, String adEnd) {
		super();
		this.adGode = adGode;
		this.adImg = adImg;
		this.adSt = adSt;
		this.adEnd = adEnd;
	}

	public String getAdGode() {
		return adGode;
	}

	public void setAdGode(String adGode) {
		this.adGode = adGode;
	}

	public String getAdImg() {
		return adImg;
	}

	public void setAdImg(String adImg) {
		this.adImg = adImg;
	}

	public String getAdSt() {
		return adSt;
	}

	public void setAdSt(String adSt) {
		this.adSt = adSt;
	}

	public String getAdEnd() {
		return adEnd;
	}

	public void setAdEnd(String adEnd) {
		this.adEnd = adEnd;
	}

}
