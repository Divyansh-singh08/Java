import java.io.*;
import java.util.*;


public class Solution(){
	// int [] arr;
	// int n;

	// LongestSubK(int[] arr,int n){
	// 	this.arr = arr;
	// 	this.n = n;
	// }

	public void longestK(int[] arr,int n){

		//sliding window approch
		
	}

	
}

public class B {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// System.out.println(n);

		int[] arr =  new int[n];
		//array that take value in it
		for(int i = 0; i<n; i++){
			arr[i]=sc.nextInt();
		}

		Solution obj = new Solution();
		obj.longestK(arr,n);
	}
}






