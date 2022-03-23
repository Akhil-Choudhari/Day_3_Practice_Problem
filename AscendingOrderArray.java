package Day3Program;

import java.util.Scanner;

public class AscendingOrderArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
        int n; 
        int temp;
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();  
        
        int arr[]=new int[n]; 
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }        
            }
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
	}

}
