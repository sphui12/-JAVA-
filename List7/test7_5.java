package List7;
import java.util.Scanner;

public class test7_5 {
	public static void main(String[] args) {
		/*
		 * data�����ڴ�����������
		 * temp����ʱ�����������֣������жϺ�����Ƿ����
		 * count�������±������
		 */
		Scanner input=new Scanner(System.in);
		int[] data=new int[10];		
		int temp;
		int count=1;
	    
		/* 
		 * for1��ѭ���������������
		 * for2������������ֺ�֮ǰ�����������бȽ�
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
