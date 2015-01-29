
public class MyTime {
	private int hour, minute, second;

	//Getters and seters
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (0 < hour && hour < 23) {  this.hour = hour;} 
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (0 < minute && minute < 23) {  this.minute = minute;} 
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		 if (0 < second && second < 23) {  this.second = second;}
	}
	
	// Constructors
	   public void setTime(int hour, int minute, int second){
		   if (0 < hour && hour < 23) {  this.hour = hour;} 
		   if (0 < minute && minute < 59) {  this.minute = minute;} 
		   if (0 < second && second < 59) {  this.second = second;} 
		   else System.out.println("Invalid hour, minute, or second!");
	   }
	   
	   public MyTime(int hour, int minute, int second){
		      setTime(hour,minute,second);
	     }
	   
	// toString() to describe itself
	   public String toString() { 
	      return hour + ":" + minute + ":"+ second; 
	   }
	   
	   //nextSecond()
	   public void nextSecond() { 
		   if (second == 59) { 
	    	  hour = hour + 1; 
	    	  minute = minute + 1;
	    	  second = 00;
	    	  }
		   else { second = second + 1;}
	
	   }
}