package List7;
import java.util.Scanner;
	
public class List7_1 {
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
    	System.out.print("Enter the number of item: ");
    	int n =input.nextInt();
    	double [] numbers=new double[n];
    	double sum =0;
    	
    	System.out.print("Enter the number: ");
    	for(int i=0;i<n;i++) {
    		numbers[i]=input.nextDouble();
    		
    		sum+=numbers[i];
    	}
    	
    	double average=sum/n;
    	int count = 0;
    	for(int i=0;i<n;i++)
    		if(numbers[i]>average)
    			count+=1;
    	
    	System.out.println("average is "+average);
    	System.out.println("Number of elements above the average is "+count);
    }
}
