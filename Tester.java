/**
 * @author albertyen
 * Tester class for 'where-is-waldo'
 */
public class Tester {

	public static void main(String[] args) 
  {
  //This will create a new instance of the TouristList, with the first tourist going to Paris;
  //For easier readability reasons, the passport number will be a maximum of 3 digits in this hypothetical world;
		TouristList allTourist = new TouristList ("Jane", "Paris", 123);
		allTourist.addFirst("Joe", "London", 456);
		allTourist.addFirst("Waldo", "Oslo", 789);
	
  //This will return where each tourist is located, with the findNode method in the TouristList class;
		System.out.println (	"Joe is in: " + allTourist.findNode("Joe"));
		System.out.println (	"Waldo is in: "	+ allTourist.findNode("Waldo"));
		System.out.println (	"Jane is in: " + allTourist.findNode("Jane"));
    
	//An attempt to find a tourist who does not exist on the list;
  //No error messages, and this will return "Sorry, this tourist is not on the list."
		System.out.println (	allTourist.findNode("Rebecca"));
    
	//This will print out the total number of tourists on the list;
		System.out.println (	"There are a total of " + allTourist.size() + " people on the list.");
	}
	
}
