package List9;

public class List9_4 {
	public static void main(String[] args) {
		List9_3 tv1=new List9_3();
		tv1=new List9_3();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolumeLevel(3);
		
		List9_3 tv2=new List9_3();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("tvl's channel is "+tv1.channel+" and volume level is "+tv1.volumeLevel);
		System.out.println("tv2's channel is "+tv2.channel+" and volume level is "+tv2.volumeLevel);
	}
}
