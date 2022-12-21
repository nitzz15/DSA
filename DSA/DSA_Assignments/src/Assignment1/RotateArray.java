package Assignment1;

import java.lang.reflect.Array;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Arr[] = {10,98,67,29,65,76};
		
		for (int  i : Arr) {
			System.out.print(i);
			System.out.print(" ");
		}
		for(int i = 0;i<(Arr.length/2);i++) {
			System.out.println("in for");
			int temp = Arr[i];
			Arr[i]=Arr[Arr.length-1-i];
			Arr[Arr.length-1-i]=temp;
			System.out.println("done");
			
		}
		for (int  i : Arr) {
			System.out.print(i);
			System.out.print(" ");
		}
		
	}
}

