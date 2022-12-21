package com.Set;

public class LinkedListKiteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListTest list = new LinkedListTest();
		 Kite  k1 =new Kite("red","nitesh",10,true);
		 Kite  k2 =new Kite("yellow","xxxx",20,false);
		 Kite  k3 =new Kite("black","nitzz",30,true);
		 Kite  k4 =new Kite("green","yyyy",50,true);
		 Kite  k5 =new Kite("blue","zzzz",60,false);
		 
		 
		 list.addFirst(k2);
		 list.addFirst(k1);
		 list.addLast(k3);
		 list.addLast(k4);
		 list.addLast(k5);
		 
		 list.display();
		 System.out.println("___________");
		 list.deleteFirst();
		 
		 list.display();
		 
		 System.out.println(list.size );
		 

	}

}
