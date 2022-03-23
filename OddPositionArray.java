package Day3Program;

import java.util.Scanner;

public class OddPositionArray {

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
        System.out.println("The array elements at odd positions: ");
        for(int i = 0; i < arr.length ; i=i+2)
            System.out.print(arr[i]+" ");
        System.out.println();

	}

}
