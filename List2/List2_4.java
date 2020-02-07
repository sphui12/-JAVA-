package List2;
import java.util.Scanner;

public class List2_4 {
	public static void main(String[] args) {
		final double PI=3.14159;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a nember for radius: ");
		
		double radius=input.nextDouble();
		double area=radius*radius*PI;
		System.out.println("The area for the circle of radius "+
				radius+" si "+area);
	    
	}
	
	
	

}
