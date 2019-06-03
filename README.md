# where-is-waldo-LL
Linked list approach (with a nested node class) to hold the information of tourists; The tester (or driver) class will return Waldo's destination

The linked list class will have a nested node class that holds the following information about tourists. For example:

Name:  Waldo
Passport Number: 12345
Destination: Prague
*Node code from the modules modified to hold the above instance variables for each node.  

The linked list class has these methods:

public void addFirst(String touristName, int passportNumber, String destinationCity) 
//adds a new tourist to the beginning of the list

public int size() 
//returns the number of tourists in the list

public String findNode(String touristName) 
//finds the tourist's name in the list and returns the destination

Testing class, will add 3 tourists with the addFirst method. Next, the findNode class will find each tourist by name and then return the destination.

I will also use findNode to try and find a tourist that does not exist in the list.

This program will run without errors or any unhandled exceptions.
