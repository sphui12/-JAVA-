package List7;

import List6.List6_10;

public class List7_4 {
	public static void main(String[] args) {
		char[] chars=creatArray();
		
		int[] counts=countLetters(chars);
		
		System.out.println();
		System.out.println("The occurrences of each letter are: ");
		displayCount(counts);		
	}
	
	public static char[] creatArray() {
		char[] chars=new char[100];
		
		for(int i=0;i<chars.length;i++)
			chars[i]=List6_10.getRandomLowerCaseLetter();	
		return chars;
	}
	
	public static int[] countLetters(char[] chars) {
		int[] counts=new int[26];
		
		for(int i=0;i<chars.length;i++)
			counts[chars[i]-'a']++;
		
		return counts;
	}
	
	public static void displayCount(int[] counts) {
		for(int i=0;i<counts.length;i++) {
			if((i+1)%10==0)
				System.out.println(counts[i]+" "+(char)(i+'a'));
			else
				System.out.println(counts[i]+" "+(char)(i+'a')+" ");
				
		}
		
	}
	
	
	

}


