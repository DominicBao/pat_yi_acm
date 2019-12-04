package acm;

import java.math.BigInteger;
import java.util.Scanner;

public class Pat_1017 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		sc.close();
		BigInteger result[] = A.divideAndRemainder(B);
		System.out.println(result[0] +" "+result[1]);
	}
}
