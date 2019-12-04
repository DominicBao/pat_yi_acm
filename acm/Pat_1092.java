package acm;

import java.util.Scanner;

public class Pat_1092 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max_xiao = 0;
		int max_num = 0;
		int a[] = new int[n];
//		String res1 = "";
//		int pan1 = 0;
		
		
		for(int i = 0;i < m;i++) {
			for(int g = 0;g < n;g++) {
				if(m == 0) {
					a[g] = 0;
				}
				int aa = sc.nextInt();
				if(max_xiao < aa) {
					max_xiao = aa;
				}
				a[g] += aa;
				if(a[g] > max_num) {
					max_num = a[g];
//					pan1 = 0;
//					res1 = "";
				}
//				if(i == m-1) {
//					if(a[g] == max_num) {
//						if(pan1 == 0) {
//							res1+= (g+1)+"";
//							pan1 = 1;
//						}else {
//							res1 += " "+(g+1);
//						}
//					}
//				}
			}
		}
		System.out.println(max_xiao);
		String res = "";
		int pan = 0;
		for(int i = 0;i < n;i++) {
			if(a[i] == max_num) {
				if(pan == 0) {
					res+= (i+1)+"";
					pan = 1;
				}else {
					res += " "+(i+1);
				}
			}
		}
		System.out.println(res);
		sc.close();
	}
	
	int new_start() {
		Scanner sc= new Scanner(System.in);
		String x = "";
		int b = sc.nextInt();
		for(int i = 0;i < 10;i++){
			x += b;
			b++;
		}
		System.out.println(x);
		sc.close();
		int a = 9;
		return a;
	}
}
