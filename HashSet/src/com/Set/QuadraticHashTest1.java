package com.Set;

public class QuadraticHashTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Hash1{
	
	int keys[];
	String vals[];
	int maxSize;
	
	public Hash1(int maxSize){
		this.maxSize=maxSize;
		keys = new int[maxSize];
		vals=new String[maxSize];
		
		}
	private static void printValues(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr: "+arr[i]);
			
		}
}
	public int hash(int key){
		return key%maxSize;
		
	}

	public String get(int key) {
		int temp = hash(key);
	while(keys[temp]!=0) {
		if(keys[temp]==key) {
			return vals[temp];
		}
		temp =temp++;
		}
	return "notfound";
	
	}
		

	
public void Insert(int key,String val) {
	System.out.println("inserting");
	int temp = hash(key);
	int i = temp;
	


}

}
