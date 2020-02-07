package List9;

public class TestCircleWithPrivateDataFields {
	public static void main(String[] args) {
		CircleWithPrivateDataFields myCircle=
				new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());

	    myCircle.setRedius(myCircle.getRadius()*1.1);
	    System.out.println("The area of th circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
	
	    System.out.print("The number of objects created is "+CircleWithPrivateDataFields.getNumberOfObjects());
	}
}
