package List7;

public class test7_24 {
	public static void main(String[] args) {
		
		/*
		 * count:���Ƽ�����
		 * random_suit:��ʱ���������ɫ
		 * random_rank����ʱ���������ֵ
		 * history:��¼������Ƶ���ʷ�������ظ�
		 * suits&ranks����ɫ����ֵ
		 */
		int count=0;
		int random_suit;
		int random_rank;
		int[] history= {0,0,0,0};
		String[] suits= {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		boolean flag=true;
		
		while(flag){
			
		    //ģ��������ƹ���
		    count++;
		    random_suit=(int)(Math.random()*4);
		    history[random_suit]++;
		    random_rank=(int)(Math.random()*13);
		    
		    //������ʷ��¼���ж��Ƿ������������ʷΪ1�����
		    for(int i=0;i<4;i++) {
			    if(history[i]==1) {
			 	   System.out.println(ranks[i]+" of "+suits[i]);
			 	   history[i]++;
			    }
		    }	
		    
		    //������ʷ��¼������ȫ�������������ѭ��
		    for(int i=0;i<4;i++) {
		    	if(history[i]==0)break;
		    	if(i==3)flag=false;
		    }
		
		}
		//���������
		System.out.println("Number of picks: "+count);
	}	
}
