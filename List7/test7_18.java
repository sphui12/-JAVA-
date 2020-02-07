package List7;
import java.util.Scanner;

public class test7_18 {
	
	//案例(:
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);	
		int[] data= new int[10];
		
		//输入10个数字进入数组data
		System.out.print("Enter 10 number: ");
		for(int i=0;i<10;i++) {
			data[i]=input.nextInt();
		};
		
		//调用函数排序
		getArrayByBubleSort(data,10);
	}
	
	//方法:冒泡排序
	public static void getArrayByBubleSort(int[] data,int size) {
		int temp;//临时变量，用于交换
		
		//经典算法:冒泡排序
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(data[j]>data[j+1]) {
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}			
		}
		//输出
		for(int x=0;x<size;x++)
			System.out.print(data[x]+" ");	
	}

}
