package Assignment1;


 class Car{
	int  count;
	int getCount(int [] a) {
		 for (int i = 0;i<a.length;i++) {
			 if(a[i] == 0) {
				 for(int j = i+1;j<a.length;j++) {
					 if(a[j]==1)
						 count++;
				 }
			 }
			 
		 }
		 return count;
	}
}
public class CarsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cars = {1,0,0,1,0,0,1,1,1,1,1,0,0};
		
		Car carCount = new Car();
		System.out.println(carCount.getCount(cars));
	}

}
