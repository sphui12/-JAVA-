package List7;
import java.util.Scanner;
public class test7_34 {
	
	//案例:
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String in=input.next();
		System.out.print(sort(in));			
	}
	
	/*函数sort（字符串排序）:
	 *用 .toCharArray() 的方法将字符串赋值给一个字符数组
	 *将字符数组排序后再用new String(s)赋值创建一个字符串
	 */
	public static String sort(String in) {
		char temp;
		char [] s=in.toCharArray();
		for (int i = 0; i < s.length-1; i++) {
			for (int j = i+1; j < s.length; j++) {
				if (s[i]>s[j]) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		String out=new String(s);
		return out;
	}
}
