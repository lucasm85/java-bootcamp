
public class TestBuilder {
	public static void main(String[] args) {
		//Test program
				
		House h1 = new House("Romina");
		System.out.println(h1);  // toString()
		System.out.print("The rooms are: ");
		
		
		h1.addRooms(new Room("Bedroom", 4, 1, 1));
		h1.addRooms(new Room("Bathroom", 4, 1, 0));
		System.out.println(h1);  // toString()
		System.out.print("The rooms are: ");
		h1.printRooms();
		
		Builder b1 = new Builder(h1);
		b1.buildHouse("Mica", 4, 2, 1);
		System.out.println(b1.toString());
		
		}

}