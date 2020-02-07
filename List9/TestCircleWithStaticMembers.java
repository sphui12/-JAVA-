package List9;

public class TestCircleWithStaticMembers {
	public static void main(String[] args) {
		System.out.println("Brfore creating object");
		System.out.println("The number of circle objects is "+
		CircleWithStaticMembers.numberOfObject);
		
		CircleWithStaticMembers c1=new CircleWithStaticMembers();
		
		System.out.println("After creating c1");
		System.out.println("c1 radius ("+c1.radius+") and numger of Circle objects ("+
		c1.numberOfObject+")");
		
		CircleWithStaticMembers c2 =new CircleWithStaticMembers(5);
		
		c1.radius=9;
		System.out.println("After creating c2 and modifying c1");
		System.out.println("c1 radius ("+c1.radius+") and numger of Circle objects ("+
		c1.numberOfObject+")");
		System.out.println("c2 radius ("+c2.radius+") and numger of Circle objects ("+ 
		c2.numberOfObject+")");
	}
}
