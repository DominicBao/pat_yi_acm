package acm;

import java.util.Scanner;

public class Pat_1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n = 4 * n;
		String res = "";
		for(int i = 0;i < n;i++) {
			String a = sc.next();
			if(a.substring(2,3).equals("T")) {
				if(a.substring(0, 1).equals("A")) {
					res += "1";
					continue;
				}else if(a.substring(0, 1).equals("B")) {
					res += "2";
					continue;
				}else if(a.substring(0, 1).equals("C")) {
					res += "3";
					continue;
				}else if(a.substring(0, 1).equals("D")) {
					res += "4";
					continue;
				}
			}
		}
		System.out.println(res);
	}
}
