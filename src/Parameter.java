
public class Parameter {
private float Radius;
private double Area;
     public Parameter(float radius) {
    	 Radius = radius;
    	  }
     public float getRadius() {
    	 return Radius;
     }
     public void setRadius(float radius) {
    	 Radius = radius;
     }
     public void calc_area() {
    	 Area = 3.14 * Radius * Radius;
    	 System.out.println("Area" +Area);
     }
     public float diameter() {
    	 float Diameter = 2 * Radius;
    	 return Diameter;
     }
     public double circumference() {
    	 double Circumference = 2 * Radius;
    	 return Circumference;
     }
     }

