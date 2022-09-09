package sorting;
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m;
	    int[] arr = new int[n];
	    for(int i = 0;i<n;i++){
	        arr[i]=s.nextInt();
	    }
	    for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
			    if(arr[i]>arr[j]){
						m=arr[i];
						arr[i]=arr[j];
						arr[j]=m;
				}
			}
	    }
	    for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");
	    }
	}

}

