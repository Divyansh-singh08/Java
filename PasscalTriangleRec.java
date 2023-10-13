//this the Question for the printing paticular index or position
import java.util.*;
import java.io.*;

public class PasscalTriangleRec{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = s.nextInt();
		int ans = funtNCR(n,row);
		System.out.println(ans);
	}

	static int funtNCR(int n,int row){

		int res = 1;
		for(int i = 0; i<row; i++){
			res = res * (n-i);
			res = res/(i+1);
		}

		return res;
	}
}

