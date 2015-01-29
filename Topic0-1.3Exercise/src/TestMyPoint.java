
public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 0);
		MyPoint p2 = new MyPoint(0, 4);

	    System.out.println(p1.toString());   // explicit call MyPoint
	    System.out.println(p2.toString());
	    
	 // Testing the overloaded method distance()
	    MyPoint p3 = new MyPoint(0, 4);
	    System.out.println(p3.distance(p2));    
	    System.out.println(p3.distance(5, 6));  
	    	    
	  //program that allocates 10 points in an array of MyPoint
	    MyPoint[] points = new MyPoint[10]; // Declare and allocate an array of MyPoint
	    for (int i=1; i <= 10; ++i) {
	       points[i] = new MyPoint(i,i);    // Allocate each of MyPoint instances
	       System.out.println(points[i].toString());
	    }
	}
}
