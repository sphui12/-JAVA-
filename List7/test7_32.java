package List7;
import java.util.Scanner;
public class test7_32 {
	
	//案例：
	public static void main(String[] args) {
		
		/*
		 * mum:读入数据，第一次代表读入数据的个数
		 * list:存放数据的数组
		 */
		System.out.print("Enter list: ");
		Scanner input=new Scanner(System.in);
		int num	=input.nextInt();
		int[] list=new int[num];

		//读入数组
		for (int i = 0; i <num; i++) {
			list[i]=input.nextInt();
		}
		
		//调用函数
		partition(list);
		
		//输出
		System.out.print("After the partition the list ");
    	for (int x = 0; x < list.length; x++) {
			System.out.print(list[x]+" ");
		}
		
	}
	
	//划分列表
    public static void partition(int[] list) {
    	/*
    	 * index:存放支点元素
    	 * temp:临时变量，用于交换
    	 * tail:用于倒序存放的数组尾指针
    	 */
		int index=0;
		int temp=0;
		int tail=list.length-1;
		

		//遍历一次数组并与支点元素比较，若小于则互换则与支点互换，若大于则与数组尾指针交换，指针前移；
    	for (int i = 1; i < list.length; i++) {
			if(list[i]<list[index]) {
				temp=list[i];
				list[i]=list[index];
				list[index]=temp;
				index=i;
			}else {
				temp=list[i];
				list[i]=list[tail];
				list[tail]=temp;
				tail--;
				i--;
			}
			if(tail==i-1)break;	
		}	
    }
}
