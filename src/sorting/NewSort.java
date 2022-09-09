package sorting;

import java.util.*;

public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
		  int n=s.nextInt();
		  int i, j, x;
	      int[] array = new int[n];
	      
	      System.out.print("Enter Elements in Random Order: ");
	      for(i=0; i<n; i++)
	      {
	         array[i] = s.nextInt();
	      }
	      
	      for(i=0; i<(n-1); i++)
	      {
	         for(j=0; j<(n-i-1); j++)
	         {
	            if(array[j]>array[j+1])
	            {
	               x = array[j];
	               array[j] = array[j+1];
	               array[j+1] = x;
	            }
	         }
	      }
	      
	      System.out.println("\nThe new sorted array is:");
	      for(i=0; i<n; i++)
	         System.out.print(array[i]+ " ");
	}

}
