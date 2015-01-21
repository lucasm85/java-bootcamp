
public class Line {
   // A line composes of two points (as instance variables)
	
   private Point begin;    
   private Point end;      
   
   // Constructors
   public Line (Point begin, Point end) {  // caller to construct the Points
      this.begin = begin;
      this.end = end;
   }
   public Line (int beginX, int beginY, int endX, int endY) {
      begin = new Point(beginX, beginY);   // construct the Points here
      end = new Point(endX, endY);
   }
   
   // Public methods
   public String toString() {
	   return "Begin: " + begin + "End: " + end;
   }
   
   //Getters and setters   
   public Point getBegin() {
		return begin;
	}
	public void setBegin(Point begin) {
		this.begin = begin;
	}
	public Point getEnd() {
		return end;
	}
	public void setEnd(Point end) {
		this.end = end;
	}    
		
   public int getBeginX() { return begin.getX(); }
   public int getBeginY() { return begin.getY(); }
   public int getEndX() { return end.getX(); }
   public int getEndY() { return end.getY(); }
   
   public void setBeginX(int x) {  begin.setX(x);  }
   public void setBeginY(int y) {  begin.setY(y);  }
   public void setBeginXY(int x, int y) {
	      begin.setX(x);
	      begin.setY(y);
     }
   
   public void setEndX(int x) {  end.setX(x);  }
   public void setEndY(int y) {  end.setY(y);  }
   public void setEndXY(int x, int y) {
	      end.setX(x);
	      end.setY(y);
     }
   
   public double getLength() {
	      int xDiff = begin.getX() - end.getX();
	      int yDiff = begin.getY() - end.getY();
	      return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	   }
   
   
   public double getGradient() { 
	   int xDiff = begin.getX() - end.getX();
	   int yDiff = begin.getY() - end.getY();
	   return Math.atan2(yDiff, xDiff);
     }
}


