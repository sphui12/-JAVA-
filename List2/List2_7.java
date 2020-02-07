package List2;

public class List2_7 {
	public static void main(String[] args) {
		long totalMillseconds=System.currentTimeMillis();
		
		long totalSeconds=totalMillseconds/1000;
		
		long currentSecond=totalSeconds%60;
		
		long totalMinute=totalSeconds/60;
		
		long currentMinute=totalMinute % 60;
		
		long totalHours=currentMinute /60;
		
		long currentHour = totalHours % 24;
		
		System.out.println("Current time is "+ currentHour+":"
				+ currentMinute+":"+currentSecond + " GMT");
		
		
	}

}
