package List9;
import javafx.geometry.Point2D;

public class TextRegularPolygon {
	public static void main(String[] args) {
		RegularPolygon r1=new RegularPolygon();
		RegularPolygon r2=new RegularPolygon();		
		RegularPolygon r3=new RegularPolygon();
		r2.setRegularPolygonInZero(3,4);
		r3.setRegularPolygonInXY(10,4,5.6,7.8);
	    System.out.println("r1's zhouchang is "+r1.getPerimeter()+".Its Area is "+r1.getArea());
	    System.out.println("r2's zhouchang is "+r2.getPerimeter()+".Its Area is "+r2.getArea());
	    System.out.println("r3's zhouchang is "+r3.getPerimeter()+".Its Area is "+r3.getArea());
	}
}
