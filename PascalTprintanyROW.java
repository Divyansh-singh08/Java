import java.util.*;
import java.io.*;

public class PascalTprintanyROW{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// System.out.println(n);
		printAnyRow(n);
	}
	static int funNCR(int n,int row){

		//base on formula
		int res = 1;
		//iterate
		for(int i = 0; i<row; i++){
			
			res = res * (n-i);
			res = res/(i+1);
		}

		return res;
	}

	static void printAnyRow(int n){

		//iterate throught the code
		for(int col = 1; col<=n; col++){

			System.out.print(funNCR(n-1,col-1) + " ");
		}
	}
}