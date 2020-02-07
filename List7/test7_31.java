package List7;
import java.util.Scanner;

public class test7_31 {
	public static void main(String[] args) {
		//��ʾ�ֱ�����num�����ֽ���list1��list2
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
			
		//���ù鲢����
		merge(list1,list2);
		
	}
	
	public static void merge(int[] list1,int[] list2) {
		/*
		 * p1,p2��Ϊ���鲢����ʱlist1��list2�������±�
		 * list3���鲢���������
		 * temp����ʱ��ţ����ڽ�����������
		 */
		int p1=0;
		int p2=0;
		int[] list3=new int[list1.length+list2.length];
		int temp=0;
		
		//����ѡ������ֱ�����list1��2
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
		 * �鲢�����ȡС���������飬����ǰ����
		 * ��������֮һȡ����ʣ��һ��ȫ������������
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
		
		//�������鲢���
		System.out.print("The merge list is ");
		for(int i=0;i<list3.length;i++) {
			System.out.print(list3[i]+" ");
		}
	}
}
