package List9;


	public class CircleWithStaticMembers {
	    double radius;
	    static int numberOfObject=0;
    
	    CircleWithStaticMembers(){
	    	radius=1;
	    	numberOfObject++;
	    }
	    
	    CircleWithStaticMembers(double newradius){
	    	radius=newradius;
	    }
	    
	    double getArea() {
	    	return radius *radius*Math.PI;
	    }
	}


