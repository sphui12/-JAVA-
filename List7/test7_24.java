package List7;

public class test7_24 {
	public static void main(String[] args) {
		
		/*
		 * count:卡牌计数器
		 * random_suit:暂时储存随机花色
		 * random_rank：暂时储存随机数值
		 * history:记录输出卡牌的历史，避免重复
		 * suits&ranks：花色和数值
		 */
		int count=0;
		int random_suit;
		int random_rank;
		int[] history= {0,0,0,0};
		String[] suits= {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		boolean flag=true;
		
		while(flag){
			
		    //模拟随机抽牌过程
		    count++;
		    random_suit=(int)(Math.random()*4);
		    history[random_suit]++;
		    random_rank=(int)(Math.random()*13);
		    
		    //检索历史记录，判断是否输出。倘若历史为1则输出
		    for(int i=0;i<4;i++) {
			    if(history[i]==1) {
			 	   System.out.println(ranks[i]+" of "+suits[i]);
			 	   history[i]++;
			    }
		    }	
		    
		    //检索历史记录，若果全部输出过则跳出循环
		    for(int i=0;i<4;i++) {
		    	if(history[i]==0)break;
		    	if(i==3)flag=false;
		    }
		
		}
		//输出总牌数
		System.out.println("Number of picks: "+count);
	}	
}
