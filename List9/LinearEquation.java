package List9;

public class LinearEquation {
	private double a,b,c,d,e,f;
	public void LinearEquation(double a,double b,double c,double d,double e,double f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;	
		this.e=e;
		this.f=f;
	}
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	
	public boolean isSolvable() {
		if(a*d-b*c!=0)
			return true;
		else 
			return false;
	}
	
	public double getX() {
		return(e*d-b*f)/(a*d-b*c);
	}
	
	public double getY() {
		return(a*f-e*c)/(a*d*1.0-b*c);
	}
	
	public void setABCbyTwoPoint(double x1,double y1,double x2,double y2) {
		a=y1-y2;
		b=x2-x1;
		e=y1*(x2-x1)-x1*(y2-y1);
	}
	
	public void setDEFbyTwoPoint(double x1,double y1,double x2,double y2) {
		c=y1-y2;
		d=x2-x1;
		f=y1*(x2-x1)-x1*(y2-y1);
	}
}
