import java.util.*;
import java.io.*;

public class PartionArrayElement{
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// System.out.println(n);
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++){
			arr[i] = s.nextInt();
		}
		partition(arr,5);

		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}

	}


	public static void partition(int[] arr,int pivot){
		
		//3 region important
		// (0 to j-1) --> smaller area(<= pivot)
		// (i to end) --> unknow area
		// (j to i-1) --> bigger area(> pivot)
		int i = 0;
		int j = 0;

		//till any one unknow
		while(i < arr.length){

			//check it
			if(arr[i] > pivot){
				i++;
			}else{
				swap(arr,i,j);
				i++;
				j++;
			}
		}


	}

	static void swap(int[] arr,int i,int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}