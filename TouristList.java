/**
 * @author albertyen
 */
 
public class TouristList {

//nested class below for node;
//parameters a, b, c, and d represent the tourist's id (or name), destination, passport, and the next node, respectively;
	class IntNode 
	{
		public String id;
		public String destination;
		public int passport;
		public IntNode next;
		private IntNode(String a, String b, int c, IntNode d) 
		{
		id = a;
		destination = b;
		passport = c;
		next = d;
		}
	}
	
	private IntNode first;	
	
//size method to find out how many tourists are on the list;
	public int size () 
 	{
		IntNode t = first;
		int touristSize = 0;
		
		while (t != null) 
    		{
			touristSize++;
			t = t.next;
		}
		
		return touristSize;
	}
	
//constructor for the TouristList class;
	public TouristList(String a, String b, int c) 
	{
		first = new IntNode(a, b, c, null);
	}

//method to add tourists to the linked list;
	public void addFirst(String a, String b, int c) 
  	{
		first = new IntNode(a, b, c, first);
	}

//method to find the tourist by passing it a string parameter, the tourist's name;
	public String findNode (String touristName) 
  	{
		IntNode f = first;
    
		while (f != null) 
        	{
			if (f.id == touristName) 
         		{
			return f.destination;
			}
		f = f.next;
		}

		return "Sorry, this tourist is not on the list.";
	}
}
