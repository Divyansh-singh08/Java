import java.util.*;
import java.io.*;

public class CyclicSort{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr =  new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = s.nextInt();
		}
		// System.out.println(n);
		CyclicSorts(arr);
		for(int i = 0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
	}

	static void CyclicSorts(int[] arr){

		int i = 0;
		while(i < (arr.length-1)){

			//check 
			int correctInd = arr[i] - 1;
			//checking with index value
			if(arr[i] != arr[correctInd]){
				//swap it
				int temp = arr[i];
				arr[i] = arr[correctInd];
				arr[correctInd] = temp;
			}else{
				i++;
			}


		}
	}
}