package List11;

public class PolymorphismDemo {
	public static void main(String[] args) {
		displayObject(new CircleFromSimpleGeometricObject(1,"red",false));
		displayObject(new RectangleFromSimpleGeometricObject(1,1,"black",true));
	}
	
	public static void displayObject(SimpleGrometricObject object) {
		System.out.println("Creat on "+object.getDateCreated()+".color is "+object.getColor());
	}
}
