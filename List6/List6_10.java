package List6;
public class List6_10 {
	public static char getRandomCharacter(char ch1, char ch2) {
		return(char)(ch1+Math.random()*(ch2-ch1+1));
	}
	
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a','z');
	}
}