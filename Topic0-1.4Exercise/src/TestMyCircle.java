
public class TestMyCircle {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 0);
		MyCircle c1 = new MyCircle(p1, 4);
	    System.out.println(c1.toString());   // explicit call MyPoint
	    
		MyCircle c2 = new MyCircle(2, 5, 4);
	    System.out.println(c2.toString());
}
}
