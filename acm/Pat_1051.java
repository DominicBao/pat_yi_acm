package acm;

import java.util.Scanner;

public class Pat_1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R1 = sc.nextDouble();
		double P1 = sc.nextDouble();
		double R2 = sc.nextDouble();
		double P2 = sc.nextDouble();
		double s = R1 * Math.cos(P1) * R2 * Math.cos(P2)-R1 * Math.sin(P1) * R2 * Math.sin(P2);
		double x = R1 * Math.cos(P1) * R2 * Math.sin(P2)+R2 * Math.cos(P2) * R1 * Math.sin(P1);
		if(Math.abs(s)<0.005) {
			if(Math.abs(x)<0.005) {
				System.out.print("0.00");
			}else {
				if(x>0) {
					System.out.print("+"+String.format("%.2f", x)+"i");
				}else if(x<0){
					System.out.print(String.format("%.2f", x)+"i");
				}
			}
		}else {
			System.out.print(String.format("%.2f", s));
			if(x>0&&Math.abs(x)>=0.005) {
				System.out.print("+"+String.format("%.2f", x)+"i");
			}else if(x<0&&Math.abs(x)>=0.005){
				System.out.print(String.format("%.2f", x)+"i");
			}else {
				System.out.print("+0.00i");
			}
		}
		
		
//		System.out.println("");
//		System.out.println(x);
		sc.close();

	}
//2.3 3.5 5.2 0.4
}
