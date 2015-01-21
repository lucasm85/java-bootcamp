
public class Square extends Rectangle {
	
	//1st constructor
	public Square() {
		   super();  
		}
	
	//2nd constructor
	public Square(double side) {
		   super(side, side);  
		}
	
	//3rd constructor
	public Square(double side, String color, boolean filled) {
		   super(side, side, color, filled);  // Call superclass Rectangle(double, double)
		}
	
	public double getSide() {
		return super.getWidth();
	}
	public void setSide(double side) {
		super.setLength(side);
	}
	
	@Override
	   public String toString() {      // in Square class
		   return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
	   }
		
		public void setWidth(double side) {
			setWidth(side);
		}
	
		public void setLength(double side) {
			setLength(side);
		}
		
	//No need to override the getArea() and getPerimeter()
		   
}
