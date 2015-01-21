
public class Room {
	private String name;
	private int walls;
	private int doors;
	private int windows;
	
	//getters & setters
	public int getWalls() {	return walls;}
	public void setWalls(int walls) {this.walls = walls;}
	public int getDoors() {	return doors;}
	public void setDoors(int doors) {	this.doors = doors;	}
	public int getWindows() {	return windows;}
	public void setWindows(int windows) {	this.windows = windows;}
	
//	public String toString() 
	public String toString() {
		   return "Room: " + name + " ( walls: " + walls + ", doors: " + doors +", windows: " + windows + ")";
	}
	
	public Room (String name, int walls, int doors, int windows) {
		this.name = name;
		this.walls = walls;
		this.doors = doors;
		this.windows = windows;
	}
}
