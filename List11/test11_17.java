package List11;
import java.util.Scanner;
import java.util.ArrayList;

public class test11_17 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> blacklist=new ArrayList<Integer>();
		int n=0;
		int flag=1;
		int sum=1;
		
		
		
		int m=input.nextInt();
		for (int i = 2; i <= m;) {		
			if (m%i==0) {
				
				m=m/i;
				list.add(i);
			}else {
				i++;
			}	
		}
		
		for (int i = 0; i < list.size(); ) {		
			for (int j = i; j < list.size(); j++) {
				if (list.get(i)!=list.get(j))break;
				 else n=n+1;	
			}	
			if (n%2!=0)sum=sum*list.get(i);
			i=i+n;
			n=0;
		}	
		System.out.println(sum);
	}
}
