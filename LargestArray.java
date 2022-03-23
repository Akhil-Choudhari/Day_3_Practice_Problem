package Day3Program;

import java.util.Scanner;

public class LargestArray {

	public static void main(String[] args) {
		 int n, Largest;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of elements in the array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter elements of array:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        Largest = a[0];
	        for(int i = 0; i < n; i++)
	        {
	            if(Largest < a[i])
	            {
	                Largest = a[i];
	            }
	        }
	        System.out.println("Smallest value:"+Largest);

	}

}
