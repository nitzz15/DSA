package com.Set;

public class LinearProbingHashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hash hs = new Hash(5);
	}

}
class Hash{
	
	int keys[];
	String vals[];
	int maxSize;
	
	
	public Hash(int maxSize) {
	
		this.maxSize = maxSize;
		keys = new int[maxSize];
		vals =new String[maxSize];
		
	}
	
	public void insert(int key ,String val) {
		int temp =key%maxSize;
		if(keys[temp]==0) {
			keys[temp]=key;
			vals[temp]=val;
			}
		if(keys[temp]==key) {
			vals[temp]=val;
			
		}
		
	}
}
