package List7;
import java.util.Scanner;

public class test7_19 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//��ʾ����num�����ݴ�������list
		System.out.print("Enter the number of list: ");
		int num=input.nextInt();
		int[] list=new int[num];
		for(int i=0;i<num;i++) {
			list[i]=input.nextInt();
		};
		
		//���ú����ж�
		if(isSorted(list))
			System.out.print("The list is already sorted");
		else
			System.out.print("The list is not sorted");	
	}
	
	public static boolean isSorted(int[] list) {
		//�������鲢�Ƚ��������飬���������򷵻�false�������������������������򷵻�true
		for(int i=0;i<list.length-1;i++) {
			if(list[i]>list[i+1])break;
			if(i==list.length-2) return true;
		}
		return false;
	}

}
