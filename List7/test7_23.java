package List7;

public class test7_23 {
	public static void main(String[] args) {
		//box�����ӵ�״̬��0Ϊ�رգ�1Ϊ����
		int[] box=new int[101];

		//S1�Ķ���
		for(int i=1;i<101;i++) {
			box[i]=1;
		}
		
		//S2�Ķ���
		for(int i=2;i<101;i=i+2) {
			box[i]=0;
		}
		
		//S3��֮��ͬѧ�Ķ���
		for(int i=3;i<101;i++) {
			for(int j=i;j<101;j=j+j) {
				if(box[j]==0)
					box[j]=1;
				else
					box[j]=0;
			}
		}
		
		//�������飬������ŵ�����
		System.out.println("This box is opened: ");
		for(int i=1;i<101;i++) {
			if(box[i]==1)
				System.out.print(i+" ");
		}
		
	}

}
