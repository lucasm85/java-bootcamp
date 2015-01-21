
public class House {
	private Room [] rooms = new Room[20];
	private int numRooms = 0;
	private String owner;
	
	//Getters and setters
	public String getOwner() {	return owner;}
	public void setOwner(String owner) { this.owner = owner; }
	
	public Room [] getRooms() {	return rooms; }
	public void setRooms(Room [] rooms) {this.rooms = rooms;	}
	
//	public String toString() 
	public String toString() {
		   return "This house have rooms and the owner is " + owner;
		   //+ rooms.length
	}
	
	public void printRooms() { 
    	int i;
    	for (i=0; i < rooms.length; i++)
    		System.out.println(rooms[i].toString());
      }
	
	//constructors
	public House() {}
	
	public House (String owner) {
				//this.numRooms = numRooms;
				//this.rooms = rooms;
				this.owner = owner;
			}
	
	//addRoom
    public void addRooms(Room room) {
    	rooms[numRooms] = room;
        ++numRooms;
     }
	
}
