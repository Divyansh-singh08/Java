import java.util.*;
import java.io.*;

public class ReverseanArrayREC{

	// static void swap(int i, int j,int[] arr){

	
	// }

	static void reverArr(int l,int r,int[] arr){

		//base case
		if(l <= r){
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			reverArr(l+1,r-1,arr);
		} 


		// swap(arr[l],arr[r],arr);
		
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// System.out.println(n);
		int[] arr = new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = s.nextInt();
		}
		reverArr(0,n-1,arr);
		for(int i = 0; i<n; i++){
			System.out.println(arr[i]);
		}

	}
}