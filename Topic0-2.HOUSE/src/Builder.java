
public class Builder {
	private House house;
	private Room [] room;
	private int numRooms;
	
	
	//public Builder addRooms() {	    this.house = new House();	  }
	public Builder () {
		this.house = new House();
		numRooms = 0;
	}
	
	public Builder (House house) {
		this.house = house;
		numRooms = 1;
	}
	
	public Builder buildHouse(String name, int walls, int doors, int windows) {
        this.house.addRooms(new Room(name, walls, doors, windows)); //build the room and add it to the house
        return this;
	}
	
	//public String toString() {
			public String toString() {	
				house.printRooms();
				return house.toString();
				
		    	}

	  public House getHouse() {
	    return this.house;
	  }



	public Room [] getRoom() {
		return room;
	}



	public void setRoom(Room [] room) {
		this.room = room;
	}
	
	public void setHouse(House house) {
		this.house = house;
	}
	
	
}
/*
	
	}


	public House getHouse() {	return house; }
	public void setHouse(House house) {	this.house = house; }
	
	//con este construyo la habitacion
	public Room RoomBuilder(String name, int walls, int doors, int windows) {
	        new Room(name, walls, doors, windows);
	}
	
	public Room [] () {
    	rooms[numRooms] = room;
        ++numRooms;
     }
	//habitaciones contruids las agrego al array de rooms en house
	        
	public void HouseBuilder(Room [] room, String owner ) {
		new House();
		new House(room,owner);
		
	}
	
	addRooms(RoomBuilder(null, 0, 0, 0));
	
	public void addRooms(Room room) {
        this.house.addRooms() = room;
        ++numRooms;
     }
	
	*/
