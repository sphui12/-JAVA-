package List9;

import java.util.Scanner;

public class TextmoreLinearEquation {
	public static void main(String[] args) {
		int x1,y1,x2,y2,x3,y3,x4,y4;
		System.out.print("Import (x1,y1) (x2,y2) (x3,y3) (x4,y4):");
		Scanner imput=new Scanner(System.in);
		x1=imput.nextInt();
		y1=imput.nextInt();
		x2=imput.nextInt();
		y2=imput.nextInt();		
		x3=imput.nextInt();
		y3=imput.nextInt();		
		x4=imput.nextInt();
		y4=imput.nextInt();
		
		LinearEquation l1=new LinearEquation();
		l1.setABCbyTwoPoint(x1, y1, x2, y2);
		l1.setDEFbyTwoPoint(x3, y3, x4, y4);
		if(l1.isSolvable()) {
			System.out.print("l1: x="+l1.getX()+" y="+l1.getY());
		}else {
			System.out.print("No solution!"+l1.getY());
		}
	}
}
