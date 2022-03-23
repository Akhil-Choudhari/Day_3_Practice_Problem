package Day3Program;

import java.util.Scanner;

public class SmallestArray {

	public static void main(String[] args) {
		 int n, smallest;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of elements in the array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter elements of array:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        smallest = a[0];
	        for(int i = 0; i < n; i++)
	        {
	            if(smallest > a[i])
	            {
	                smallest = a[i];
	            }
	        }
	        System.out.println("Smallest value:"+smallest);


	}

}
