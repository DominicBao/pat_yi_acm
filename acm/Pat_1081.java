package acm;

import java.util.Scanner;

public class Pat_1081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String x = sc.nextLine();
		
		for(int i = 0;i < n;i++) {
			int panshu = 0;
			int panzi = 0;
			int panluan = 0;
			
			String a = sc.nextLine();
			if(a.length() < 6) {
				System.out.println("Your password is tai duan le.");
				continue;
			}
			for(int g = 0;g < a.length();g++) {
				//hava shuzi
				if((a.charAt(g) <=57 && a.charAt(g)>= 48)) {
					panshu = 1;
				}else if((a.charAt(g) <=90 && a.charAt(g) >= 65) ||(a.charAt(g) <=122 && a.charAt(g) >= 97)) {
					panzi = 1;
				}else if(a.charAt(g) == '.'){

				}else {
					panluan = 1;
					break;
				}
				
			}
			if(panluan == 1) {
				System.out.println("Your password is tai luan le.");
				continue;
			}
			if(panshu == 0){
				System.out.println("Your password needs shu zi.");
			}else if(panzi == 0) {
				System.out.println("Your password needs zi mu.");
			}else {
				System.out.println("Your password is wan mei.");
			}
		}
	}
}
