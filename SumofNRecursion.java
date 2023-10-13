import java.util.*;
import java.io.*;

public class SumofNRecursion{

	static int sumNRec(int n){

		//base case
		if(n < 0) return 0;

		int samllop = sumNRec(n-1);
		return n + samllop;
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// System.out.println(n);
		int  ans = sumNRec(n);
		System.out.println(ans);
	}
}