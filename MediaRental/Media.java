package application;

public abstract class Media {
	private String title;
	private String code;
	private int numberOfCopies;
	public Media() {
		
	}
	public Media(String title, int numberOfCopies,String code) {
		this.title = title;
		this.numberOfCopies = numberOfCopies;
		this.setCode(code);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	public void deleteCopy() {
		this.numberOfCopies = this.numberOfCopies-1;
	}
	public void addCopy() {
		this.numberOfCopies=this.numberOfCopies+1;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
