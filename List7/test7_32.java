package List7;
import java.util.Scanner;
public class test7_32 {
	
	//������
	public static void main(String[] args) {
		
		/*
		 * mum:�������ݣ���һ�δ���������ݵĸ���
		 * list:������ݵ�����
		 */
		System.out.print("Enter list: ");
		Scanner input=new Scanner(System.in);
		int num	=input.nextInt();
		int[] list=new int[num];

		//��������
		for (int i = 0; i <num; i++) {
			list[i]=input.nextInt();
		}
		
		//���ú���
		partition(list);
		
		//���
		System.out.print("After the partition the list ");
    	for (int x = 0; x < list.length; x++) {
			System.out.print(list[x]+" ");
		}
		
	}
	
	//�����б�
    public static void partition(int[] list) {
    	/*
    	 * index:���֧��Ԫ��
    	 * temp:��ʱ���������ڽ���
    	 * tail:���ڵ����ŵ�����βָ��
    	 */
		int index=0;
		int temp=0;
		int tail=list.length-1;
		

		//����һ�����鲢��֧��Ԫ�رȽϣ���С���򻥻�����֧�㻥������������������βָ�뽻����ָ��ǰ�ƣ�
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
