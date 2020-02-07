package List7;
import java.util.Scanner;

public class test7_3 {
	public static void main(String[] args) {
		
		/*
		 *data[]:数组储存输入数列
		 *max:数组大小
		 *count:数组元素计数器
		 *temp:临时变量，用于交换
		 */
		Scanner input=new Scanner(System.in);
		int[] data=new int[100];
		int max=0;
		int count=0;
		int temp=0;
		
		//将数据存入数组
		System.out.println("Enter the integers between 1 and 100: ");
		data[max]=input.nextInt();
		while(true) {
			if(data[max]==0)
				break;
			max++;
			data[max]=input.nextInt();
		}
		
		//对数组进行降序排序
		for(int i=0;i<max-1;i++) {
			for(int j=i+1;j<max;j++) {
				if(data[i]>data[j]) {
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		
	    //对数据进行计数
		for(int i=0;i<max;i++) {
			count=1;
			for(int j=i+1;j<max;j++) {
				if(data[i]==data[j])
					count++;
			}
			    
			    if(count>1)
			    	System.out.println(data[i]+" occurs "+count+" times");
			    else
			    	System.out.println(data[i]+" occurs "+count+" time");	    		    
			    i=i+count-1;//移动至下一个不同的数据
		}
	
	}
}
