package List7;
import java.util.Scanner;

public class test7_17 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int sum=0;	
		int temp1;
		String temp2;
		
		System.out.print("Enter thr number of students:  ");
		sum=input.nextInt();
		
		int[] grades=new int[sum];
		String[] students=new String[sum];
        
		System.out.println("Enter names and grades of some students. ");
		System.out.println("For example:");
		System.out.println("Toby 100");
		System.out.println("Jone 80");
		System.out.println("It's time for your students:");
		for(int i=0;i<sum;i++) {
			students[i]=input.next();
			grades[i]=input.nextInt();
		}
			
		for(int i=0;i<sum-1;i++) {
			for(int j=i+1;j<sum;j++) {
				if(grades[i]>grades[j]) {
					temp1=grades[i];
					grades[i]=grades[j];
					grades[j]=temp1;
					temp2=students[i];
					students[i]=students[j];
					students[j]=temp2;
				}
			}
		}
		
		System.out.print("Your students from small to big: ");
		for(int i=0;i<sum;i++) {
			System.out.print(students[i]+" ");
		}
		
		
	}

}
