package List9;
import java.util.Scanner;

public class TextLocation {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the row and column of array:");
		int r=input.nextInt();
		int c=input.nextInt();
		double[][] a=new double[r][c];
		System.out.print("Enter the data of array:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j]=input.nextDouble();
			}
		}
		Location L1=new Location();
		L1.LocationLargest(a);
		System.out.print("The largest array is a["+L1.getRowLargest()+"]["+L1.getColumnLargest()+"]:"+
		L1.getMacValue());
		
	}
}
