package acm;

import java.math.BigDecimal;
import java.util.Scanner;

public class Pat_1026 {

	public static void main(String[] args) {
		String a =  "fe1a54504618c0203518971e5de1299c46ee1296c985e6ba61473aa1c9eddfcb";
		String b = "09x";
		int x = b.charAt(0);
		int xx = b.charAt(1);
		System.out.print(x);
		System.out.print(xx);
		
	}
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		double sum = b-a;
//		double h = sum/100/60/60;
//		int hh = (int)h;
//		double m = sum/100/60-hh*60;
//		int mm = (int)m;
//		double s = sum/100-mm*60-hh*60*60;
//		BigDecimal ss = new BigDecimal(s).setScale(0, BigDecimal.ROUND_HALF_UP);
//		int sss = ss.intValue();
//		if(sss == 60) {
//			mm++;
//			if(mm == 60) {
//				hh++;
//				if(hh < 10) {
//					System.out.println("0"+hh+":"+"00"+":00");
//				}else {
//					System.out.println(hh+":"+"00"+":00");
//				}
//				
//			}else {
//				if(hh < 10) {
//					System.out.print("0"+hh+":");
//				}else {
//					System.out.print(hh+":");
//				}
//				if(mm < 10) {
//					System.out.print("0"+mm+":00");
//				}else {
//					System.out.print(mm+":00");
//				}
////				System.out.println(hh+":"+mm+":00");
//			}
//		}else {
//			if(hh < 10) {
//				System.out.print("0"+hh+":");
//			}else {
//				System.out.print(hh+":");
//			}
//			if(mm < 10) {
//				System.out.print("0"+mm+":");
//			}else {
//				System.out.print(mm+":");
//			}
//			if(sss < 10) {
//				System.out.print("0"+sss);
//			}else {
//				System.out.print(sss);
//			}
////			System.out.println(hh+":"+mm+":"+sss);
//		}
//		
//		//System.out.println(new BigDecimal(s).setScale(0, BigDecimal.ROUND_HALF_UP));
//		
//		sc.close();
//	}
}
