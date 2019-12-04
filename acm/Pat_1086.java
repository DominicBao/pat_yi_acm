package acm;

import java.util.Scanner;

public class Pat_1086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		String cc = c+"";
		String res = "";
		//System.out.print(cc.substring(cc.length()-1, cc.length()));
		String aa  ="0";
		for(int i = 0;i < cc.length();i++) {
			if(cc.substring(cc.length()-i-1,cc.length()-i).equals("0") && aa.equals("0")) {
				continue;
			}else {
				res += cc.substring(cc.length()-i-1,cc.length()-i);
				aa = "1";
			}
			
		}
		System.out.println(res);
	}
}
