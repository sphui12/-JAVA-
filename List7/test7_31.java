package List7;
import java.util.Scanner;

public class test7_31 {
	public static void main(String[] args) {
		//提示分别输入num个数字进入list1和list2
		System.out.print("Enter list1: ");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int[] list1=new int[num];		
		for(int i=0;i<num;i++) {
			list1[i]=input.nextInt();
		}
		
		System.out.print("Enter list2: ");
		num=input.nextInt();
		int[] list2=new int[num];		
		for(int i=0;i<num;i++) {
			list2[i]=input.nextInt();
		}
			
		//调用归并函数
		merge(list1,list2);
		
	}
	
	public static void merge(int[] list1,int[] list2) {
		/*
		 * p1,p2作为最后归并数组时list1和list2的数组下标
		 * list3：归并结果新数组
		 * temp：临时存放，用于交换数组内容
		 */
		int p1=0;
		int p2=0;
		int[] list3=new int[list1.length+list2.length];
		int temp=0;
		
		//两次选择排序分别排序list1，2
		for(int i=0;i<list1.length-1;i++) {
			for(int j=i+1;j<list1.length;j++) {
				if(list1[i]>list1[j]) {
					temp=list1[i];
					list1[i]=list1[j];
					list1[j]=temp;
				}
			}
		}
		
		for(int i=0;i<list2.length-1;i++) {
			for(int j=i+1;j<list2.length;j++) {
				if(list2[i]>list2[j]) {
					temp=list2[i];
					list2[i]=list2[j];
					list2[j]=temp;
				}
			}
		}
		
		/*
		 * 归并有序表，取小进入新数组，坐标前进。
		 * 倘若数组之一取尽，剩下一组全部进入新数组
		 */
		for(int i=0;i<list3.length;i++) {
			if(list1[p1]<list2[p2]) {
				list3[i]=list1[p1];
				p1++;
				if(p1==list1.length) {
					while(p2<list2.length) {
						i++;
						list3[i]=list2[p2];
						p2++;
					}
					break;
				}
			}else {
				list3[i]=list2[p2];
				p2++;
				if(p2==list2.length) {
					while(p1<list1.length) {
						i++;
						list3[i]=list1[p1];
						p1++;
					}
					break;
				}
			}
		}
		
		//遍历数组并输出
		System.out.print("The merge list is ");
		for(int i=0;i<list3.length;i++) {
			System.out.print(list3[i]+" ");
		}
	}
}
