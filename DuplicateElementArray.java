package Day3Program;

import java.util.Scanner;

public class DuplicateElementArray {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	        
	        int n;  
	        System.out.println("Enter the size of the array: ");
	        n=sc.nextInt();  
	        
	        int arr[]=new int[n]; 
	        System.out.println("Enter the array elements: ");
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        System.out.println("Duplicate Elements in the array are:");
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  
	}

}
