package List9;

public class TestPassObject {
	public static void main(String[] args) {
		CircleWithPrivateDataFields myCircle=
				new CircleWithPrivateDataFields();
		int n=5;
		printArea(myCircle,n);
		
		System.out.println("\n"+"Radius is "+myCircle.getRadius());
		System.out.println("n is "+n);
	}
	public static void printArea(
		CircleWithPrivateDataFields c,int times){
			System.out.println("Radius\t\tArea");
			while(times>=1) {
				System.out.println(c.getRadius()+"\t\t"+c.getArea());
				c.setRedius(c.getRadius()+1);
				times--;
			}
	}
}