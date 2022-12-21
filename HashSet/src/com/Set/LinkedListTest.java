package com.Set;

import java.util.List;

public class LinkedListTest {
Node head;
 int size;
 

	public LinkedListTest() {
	
	this.size = 0;
}


	class Node{
		Kite data;
		Node next;
		
		public Node(Kite data) {

			this.data = data;
			this.next = null;
			size++;
		}
	}
	 
	public void addFirst(Kite data) {
		Node newNode = new Node(data);

		if(head == null) {
			head = newNode;
			System.out.println(("added first"));
			return;
			
		}
		
		newNode.next=head;
		head = newNode;
		System.out.println("added");
		
		
	}
	
	public void addLast( Kite data) {
		Node newNode = new Node(data);

		if(head == null) {
			head = newNode;
			System.out.println(("added last1"));
			return;
			
		}
		Node temp = head;
		while(temp.next != null) {
		temp = temp.next;
		}
		temp.next =newNode;
		System.out.println("last");
	}
	
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("list is empty");
		}
		
		size--;
		System.out.println("head before delete is "+head.data);
		head=head.next;
		System.out.println("first deleted now head is : "+head.data);
		
	}
	
	public void deleteLast() {
		if(head ==null) {
			System.out.println("list is empty");
		}
		size--;
		if(head.next==null) {
			head = null;
			return;
			
		}
		Node secondlasttemp = head;
		Node lasttemp = head.next;
		while(lasttemp.next != null) {
		lasttemp = lasttemp.next;
		secondlasttemp = secondlasttemp.next;
		}
		secondlasttemp.next=null;
		System.out.println("last deleted");
		
	}
	
	
	public void display(){
		
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
		
	}
	
	public int getSize() {
		return size;
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		LinkedListTest list = new LinkedListTest();
//		
//		list.addFirst("a");
//		list.addFirst("b");
//	
//		list.addLast("yes");
//		list.addLast("xx");
//		
//		list.display();
//	
//		System.out.println(list.getSize());
//		System.out.println("--------------added");
//		
//		list.deleteFirst();
//		list.deleteLast();
//		
//		list.display();
//		System.out.println(list.getSize());
//	}
//	

}
