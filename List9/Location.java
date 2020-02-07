package List9;

public class Location {
	public static int row,column;
	public static double macValue;
	
	public int getRowLargest() {
		return row;
	}
	
	public int getColumnLargest() {
		return column;
	}
	
	public double getMacValue() {
		return macValue;
	}
		
	public static void LocationLargest(double[][] a) {
		macValue=a[0][0];
		row=0;
		column=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]>macValue)macValue=a[i][j];
				row=i;
				column=j;
			}
		}
	}
}
