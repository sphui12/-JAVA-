package List7;
import java.util.Scanner;

public class test7_18 {
	
	//����(:
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);	
		int[] data= new int[10];
		
		//����10�����ֽ�������data
		System.out.print("Enter 10 number: ");
		for(int i=0;i<10;i++) {
			data[i]=input.nextInt();
		};
		
		//���ú�������
		getArrayByBubleSort(data,10);
	}
	
	//����:ð������
	public static void getArrayByBubleSort(int[] data,int size) {
		int temp;//��ʱ���������ڽ���
		
		//�����㷨:ð������
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(data[j]>data[j+1]) {
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}			
		}
		//���
		for(int x=0;x<size;x++)
			System.out.print(data[x]+" ");	
	}

}
