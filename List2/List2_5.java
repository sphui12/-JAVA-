package List2;
import java.util.Scanner;

public class List2_5 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter a nember for seconds: ");
		
		int seconds=input.nextInt();
		int minutes=seconds / 60;
		int remainingSeconds=seconds % 60;
		System.out.println(seconds+"  seconds is  "+minutes +
				" mintues and " +remainingSeconds + " seconds");
		
	}

}
