package List11;

public class RectangleFromSimpleGeometricObject 
    extends SimpleGrometricObject{
	private double width;
	private double height;
	
	public RectangleFromSimpleGeometricObject() {
	}
	
	public RectangleFromSimpleGeometricObject(double width,double height) {
		this.width=width;
		this.height=height;
	}
	
	public RectangleFromSimpleGeometricObject(
			double width,double height,String color,boolean filled) {
		this.width=width;
		this.height=height;
		setColor(color);
		setFilled(filled);
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width=width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double setHeight() {
		return this.height=height;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPertimeter() {
		return 2*(width+height);
	}	
}
