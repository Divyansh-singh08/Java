import java.util.*;
import java.io.*;

public class recursion2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// System.out.println(n);
		int ans = printR(n);
		System.out.println(ans + " this is sum");
	}

	public static int printR(int n){

		if(n == 100) {
			// System.out.println(n);
			return 1;
		} //base case

		// System.out.println(n);
		return n + printR(n-1);
		// System.out.println(n);
	}
}

