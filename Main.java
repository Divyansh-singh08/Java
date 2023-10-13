
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// System.out.println(n);
		mas(n);
	}

	static void mas(int n){
		// System.out.println("Hello world");
		// if(i < 1) return;

		// mas(n,i-1);
		// System.out.println(i + " "); 

		// 3 2 1 print it backtracking

		//base case
		if(n < 1) return;

		
		System.out.println(n);
		mas(n-1); 
	}
}

