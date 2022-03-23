package Day3Program;

import java.util.Scanner;

public class ReverseOrderArray {

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
        System.out.println("Array in reverse order: ");    
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
	}


}
