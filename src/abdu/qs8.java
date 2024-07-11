package abdu;

public class qs8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int p=0, n=0, z=0;
			
	      int arr[] = {4, 8, -2, 3, -1, 0, 7, 0, -9};
	      int size=arr.length;
	        for(int i=0; i < arr.length; i++) {
	         if(arr[i] > 0)
	            p++;
	         else if(arr[i] < 0)
	           n++;
	         else
	            z++;
	        }
	}

}
