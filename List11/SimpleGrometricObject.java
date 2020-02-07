package List11;

public class SimpleGrometricObject {
	private String color="white";
	private boolean filled;
	private java.util.Date dataCreated;
	
	public SimpleGrometricObject() {
		dataCreated=new java.util.Date();
	}
	
	public SimpleGrometricObject(String color,boolean filled) {
		dataCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public boolean isFilled(boolean filled) {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	
	public java.util.Date getDateCreated(){
		return dataCreated;
	}
	
	public String toString() {
		return "created on "+dataCreated+"\ncolor: "+color+" and filled: "+filled;
	}
}
