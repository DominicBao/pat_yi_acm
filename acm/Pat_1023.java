package acm;

import java.util.Scanner;

public class Pat_1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		String res = "";
		int pan = 0;
		for(int i = 0;i < 10;i++) {
			a[i] = sc.nextInt();
			if(i > 0&&a[i] > 0&&pan == 0) {
				res += (i);
				for(int g = 0; g < a[0];g++) {
					res += "0";
				}
				a[i] = a[i]-1;
				pan = 1;
			}
			if(pan == 1) {
				for(int g = 0; g < a[i];g++) {
					res += (i);
				}
			}
		}
		System.out.println(res);
		sc.close();
	}
}
