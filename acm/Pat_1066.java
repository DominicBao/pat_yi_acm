package acm;

import java.util.Scanner;

public class Pat_1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ban[][] = new int[a][b];
		int xiao = sc.nextInt();
		int da = sc.nextInt();
		int ti = sc.nextInt();
		for(int i = 0;i < a;i++) {
			for(int j = 0;j < b;j++) {
				ban[i][j] = sc.nextInt();
				if(ban[i][j] <= da&&ban[i][j] >= xiao) {
					ban[i][j] = ti;
				}
				if(j == 0) {
					if(ban[i][j] < 10) {
						System.out.print("00"+ban[i][j]);
					}else if(ban[i][j] < 100) {
						System.out.print("0"+ban[i][j]);
					}else {
						System.out.print(ban[i][j]);
					}
				}else {
					if(ban[i][j] < 10) {
						System.out.print(" 00"+ban[i][j]);
					}else if(ban[i][j] < 100) {
						System.out.print(" 0"+ban[i][j]);
					}else {
						System.out.print(" "+ban[i][j]);
					}
				}
				
			}
			System.out.println();
		}
//		for(int i = 0;i < a;i++) {
//			for(int j = 0;j < b;j++) {
//				if(ban[i][j] <= da&&ban[i][j] >= xiao) {
//					ban[i][j] = ti;
//				}
//			}
//		}
//		for(int i = 0;i < a;i++) {
//			for(int j = 0;j < b;j++) {
//				if(j == 0) {
//					if(ban[i][j] < 10) {
//						System.out.print("00"+ban[i][j]);
//					}else if(ban[i][j] < 100) {
//						System.out.print("0"+ban[i][j]);
//					}else {
//						System.out.print(ban[i][j]);
//					}
//				}else {
//					if(ban[i][j] < 10) {
//						System.out.print(" 00"+ban[i][j]);
//					}else if(ban[i][j] < 100) {
//						System.out.print(" 0"+ban[i][j]);
//					}else {
//						System.out.print(" "+ban[i][j]);
//					}
//				}
//			}
//			System.out.println();
//		}
		sc.close();
	}
}
