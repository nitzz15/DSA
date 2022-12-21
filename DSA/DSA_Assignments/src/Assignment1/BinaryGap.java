package Assignment1;

import java.util.ArrayList;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =1123;
		String binary = Integer.toBinaryString(a);
	System.out.println(binary);	
	
	System.out.println("hello Nitesh KFC la party kdhi denar ahes");
	
		ArrayList<Integer> Binarylist = new ArrayList<Integer>();
		for(int i=0;i<binary.length();i++) {
			if(binary.charAt(i)==0) 
						continue;
						Binarylist.add(i);
				
				
			}
		
		int longestGap = 0;
		for(int j=0;j<Binarylist.size()-1;j++) {
			int diff = Binarylist.get(j+1)-Binarylist.get(j)-1;
			longestGap = Math.max(longestGap, diff);
		}
		System.out.println("longest gap :"+longestGap);
		
		

	}

}

