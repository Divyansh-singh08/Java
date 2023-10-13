import java.util.*;
import java.io.*;

public class QuickSort{

	//swaping function
	static void swap(int[] arr,int i,int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	//partition function
	public static int partition(int[] arr,int pivot,int lo,int hi){
		
		//3 region important
		// (0 to j-1) --> smaller area ( <= pivot)
		// (i to end) --> unknow area
		// (j to i-1) --> bigger area ( > pivot)

		int i = lo;
		int j = lo;

		//till any one unknow
		while(i <= hi){

			//check it
			if(arr[i] > pivot){	
				i++;
				// j++
			}else{
				swap(arr,i,j);
				i++;
				j++;
			}
		}
		return (j-1);
	}

	static void QuickSortN(int[] arr,int lo, int hi){

		//basse case
		// if you don't have any element or only one case
		if(lo > hi){
			return;
		}


		//
		int pivot = arr[hi];
		//we get pivoteIndex from here 
		int pivotIndex = partition(arr,pivot,lo,hi);
		System.out.println(pivotIndex + " this is the pivotedIndex");
		//here we not taking pivoted bcz it is already sorted...
		//smaller value on it call -> left part
		QuickSortN(arr,lo,pivotIndex-1);
		//Bigger element call it -> right part 
		//Faith that this will come after sorting
		QuickSortN(arr,pivotIndex+1,hi);
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// System.out.println(n);
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++){
			arr[i] = s.nextInt();
		}
		// partition(arr,5);


		QuickSortN(arr,0,(arr.length - 1));



		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}

	}

}