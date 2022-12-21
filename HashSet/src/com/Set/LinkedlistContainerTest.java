package com.Set;

import java.util.Iterator;
import java.util.LinkedList;
//MAINTAIN THE SIZE OF THE LINKED LIST , SIZE++ WHEREVER APPLICABLE
//SIZE-- TOO
//AND SHOW THE COUNT OF KITES VIA THE showList()
//insertAfter("ownernametofind",k6);

public class LinkedlistContainerTest {
	public static void main(String[] args) {
		Kite k1 = new Kite("Red","Jack",50,true);
		Kite k2 = new Kite("Green","Jane",60,true);
		Kite k3 = new Kite("Blue","John",80,true);
		Kite k4 = new Kite("Yellow","Julie",90,true);
		Kite k5 = new Kite("Black","Jim",75,true);
		Kite k6 = new Kite("MAGENTA","STOKES",138,true);
		
		MyLinkedList myList = new MyLinkedList();
		
		
	
		myList.showList();
		
		myList.add(k1);
		myList.showList();
		
		myList.insertKite("Julie",k6);
		/*myList.add(k2);
		myList.add(k3);
		myList.add(k4);
		myList.add(k5);*/
		
		
		System.out.println("==================");
		
		
		
		
		myList.showList();
	
	}
}
class MyLinkedList
{
	Kite start,ptr,prev;

	void showList() {
		if(start==null) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("List is not empty");
			ptr = start;
			while(ptr!=null) {
				System.out.println("DATA :"+ptr);
				ptr=ptr.next;
			}
		}
	}
	
	void insertKite(String ownerToFind, Kite newKite) { //julie, k6
		
		boolean found=false;
		
		if(start == null) {
			System.out.println("List is empty...cannot add this object...");
		}
		else if(start.owner.equals(ownerToFind)){
			addAtBegining(newKite);
		}
		else {
			ptr = start; //100
			while(ptr!=null) {
				if(ptr.owner.equals(ownerToFind)) {
					found = true;
					
					break;
				}
				prev = ptr;
				ptr=ptr.next;
			}
			if(found==true) {
				prev.next = newKite;
				newKite.next = ptr;
				System.out.println("Object INSERTED before....."+ownerToFind);
			}
			else {
				System.out.println("Object not found ...."+ownerToFind);
			}
		}
				
		
	}
	
	
	
	
	
	
	void searchKiteByLength(int lengthToSearch) {
		
		boolean found=false;
		
		if(start==null) {
			System.out.println("List is empty..nothing to search");
		}
		else {
			System.out.println("List is not empty...searching...");
			ptr = start;
			while(ptr!=null) {
				if(ptr.length == lengthToSearch) {
					System.out.println("Kite Found :"+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) {
				System.out.println("Kite not found... of this length : "+lengthToSearch);
			}
		}
	}
	
	void addAtBegining(Kite newKite) {
		if(start!=null) {
			System.out.println("This kite is added at the beginning of the existing list of kites...");
			newKite.next = start;
			start = newKite;
		}
		else {
			System.out.println("You are the first kite..");
			start = newKite;
		}
	}
	
	void deleteNodeByOwner(String ownerName) {
		boolean found=false;

		
		if(start==null) {
			System.out.println("List is empty..nothing to delete");
		}
		else if(start.owner.equals(ownerName)) {
			prev = start;
			start = start.next;
			prev.next = null;
			System.out.println("Deleted owner from the begining...");
		}
		else {
			ptr=start;//100
			while(ptr!=null)
			{
				if(ptr.owner.equals(ownerName)) {
					found=true;
					break;
				}
				prev = ptr; //100
				ptr = ptr.next;
			}
			if(found==true) {
				prev.next = ptr.next;
				System.out.println("Internal Object deleted...by owner name.");
				ptr.next = null;
				ptr =null;
			}
			else {
				System.out.println("Owner name  NOT found....");
			}
		}
	}
	
	
	void deleteKite(Kite theKite) {
		boolean found=false;
	
		if(start==null) {
			System.out.println("List is empty..nothing to delete");
		}
		else if(start == theKite) {
			prev = start;
			start = start.next;
			prev.next = null;
			System.out.println("Deleted Kite from the begining...");
		}
		else {
			ptr=start;//100
			while(ptr!=null)
			{
				if(ptr == theKite) {
					found=true;
					break;
				}
				prev = ptr; //100
				ptr = ptr.next;
			}
			if(found==true) {
				prev.next = ptr.next;
				System.out.println("Internal Object deleted...by Kite reference.");
				ptr.next = null;
				ptr =null;
			}
			else {
				System.out.println("Kite NOT found....");
			}
		}
	}
	
	
	void add(Kite newKite) { // addAtEnd
		if(start==null) {
			System.out.println("Adding first node...");
			start = newKite;
			//start.next = null;
		}
		else {		
			System.out.println("Adding internal node...");
			ptr=start;
			while(ptr!=null) {
				System.out.println("Searching....");
				prev = ptr;
				ptr=ptr.next;
			}
			prev.next = newKite;
			newKite.next = null;
		}
	}
	
}

/*LinkedList myList1 = new LinkedList();

myList1.add(k1);
myList1.add(k2);
myList1.add(k3);
myList1.add(k4);
myList1.add(k5);

Iterator iter = myList1.iterator();
while(iter.hasNext()) {
	Kite k = (Kite) iter.next();
	System.out.println("k "+k);
}

The height of your success
cannot exceed the height of
your personal development

 you cannot decide your future
 but you can decide your habits
 and your habits will decide your future
 
 
 
 
 habit = neural network
 
 
 
 
 
 
*/