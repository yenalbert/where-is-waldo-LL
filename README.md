# where-is-waldo-LL
Linked list approach (with a nested node class) to hold the information of tourists; The tester (or driver) class will return Waldo's destination

The linked list class will have a nested node class that holds the following information about tourists. There will be 3 parameters: name, destination, and passport number.
*Node code from the modules modified to hold the above instance variables for each node.  


The linked list class has these methods:

//adds a new tourist to the beginning of the list
public void addFirst(String touristName, int passportNumber, String destinationCity) 

//returns the number of tourists in the list
public int size() 

//finds the tourist's name in the list and returns the destination
public String findNode(String touristName) 



Testing class, will add 3 tourists with the addFirst method. Next, the findNode class will find each tourist by name and then return the destination. I will also use findNode to try and find a tourist that does not exist in the list. This program will run without errors or any unhandled exceptions.
