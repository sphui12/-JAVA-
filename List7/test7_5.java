package List7;
import java.util.Scanner;

public class test7_5 {
	public static void main(String[] args) {
		/*
		 * data：用于储存数组数据
		 * temp：临时储存读入的数字，经过判断后决定是否输出
		 * count：数组下标递增器
		 */
		Scanner input=new Scanner(System.in);
		int[] data=new int[10];		
		int temp;
		int count=1;
	    
		/* 
		 * for1：循环读入输入的数字
		 * for2：将读入的数字和之前储存的数组进行比较
		 */	
		System.out.println("Enter ten numbers: ");
		
		data[0]=input.nextInt();
		for(int i=0;i<9;i++) {
			temp=input.nextInt();
			for(int j=0;j<count;j++) {
				if(data[j]==temp)
					break;
				if(j==count-1) {
					data[count]=temp;
					count++;
				}
			}	
		} 
		
		System.out.println("The number of distinct number is "+count);
		System.out.print("The distinct numbers are: ");
		for(int i=0;i<count;i++) {
			System.out.print(data[i]+" ");
		}	
	}
}
