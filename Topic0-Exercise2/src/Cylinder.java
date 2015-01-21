
public class Cylinder extends Circle {  
   private double height;  // private variable
   
   // Constructor with default color, radius and height
   public Cylinder() {
      super();        // call superclass no-arg constructor Circle()
      height = 1.0; 
   }
   // Constructor with default radius, color but given height
   public Cylinder(double height) {
      super();        
      this.height = height;
   }
   // Constructor with default color, but given radius, height
   public Cylinder(double radius, double height) {
      super(radius);  // call superclass constructor Circle(r)
      this.height = height;
   }
   
   // A public method for retrieving the height
   public double getHeight() {
      return height; 
   }
   
   public double getVolume() {
	      return getArea()*height;
	   }
   @Override
   public String toString() {      // in Cylinder class
	   return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
	          + " height=" + height;
	}
 }

