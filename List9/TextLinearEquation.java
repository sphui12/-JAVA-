package List9;
import java.util.Scanner;

public class TextLinearEquation {
	public static void main(String[] args) {
		int a,b,c,d,e,f;
		System.out.print("Import a,b,c,d,e,f:");
		Scanner imput=new Scanner(System.in);
		a=imput.nextInt();
		b=imput.nextInt();
		c=imput.nextInt();
		d=imput.nextInt();
		e=imput.nextInt();	
		f=imput.nextInt();
		
		LinearEquation l1=new LinearEquation();
		l1.LinearEquation(a, b, c, d, e, f);
		if(l1.isSolvable()) {
			System.out.print("l1: x="+l1.getX()+" y="+l1.getY());
		}else {
			System.out.print("No solution!"+l1.getY());
		}
	}
}
