package Day3Program;

import java.util.Scanner;

public class SecondLargestElementArray {

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
        int size = arr.length;
        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){

               if(arr[i]>arr[j]){
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
               }
            }
         }
         System.out.println("Third second largest number is:: "+arr[size-2]);
	}

}
