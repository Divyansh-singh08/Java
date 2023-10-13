import java.util.*;
import java.io.*;

public class SwapRecPallindrom{

	static boolean Palli(String str,int i){
		//base case
		if(i > str.length()/2){
			return true;
		}


		if(str.charAt(i) != str.charAt(str.length() - i - 1)){
			return false;
		}

		return Palli(str,i+1);
		

	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		// int n = s.nextInt();
		// System.out.println(n);
		String str = s.next();

		boolean ans = Palli(str,0);
		System.out.print(ans);
	}
}