import java.util.*;
import java.io.*;

public class factorialREC{

	static int fact(int n){
		//base case
		if(n==1){
			return n;
		}

		//backtracting
		return n * fact(n-1);
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// System.out.println(n);
		int ans = fact(n);
		System.out.println(ans);
	}
}