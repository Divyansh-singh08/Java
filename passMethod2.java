import java.util.*;
import java.io.*;

public class passMethod2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// System.out.println(n);
		passFnc(n);
	}

	static void passFnc(int n){

		int ans = 1;
		System.out.print(ans +" ");

		for(int i = 1; i<n; i++){
			ans = ans + (n-i);
			ans = ans / i;
			System.out.print(ans + " ");
		}
	}
}