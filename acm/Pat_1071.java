package acm;

import java.util.Scanner;

public class Pat_1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int k = sc.nextInt();
		for(int i = 0;i < k;i++) {
			int n1 = sc.nextInt();
			int b = sc.nextInt();
			int t = sc.nextInt();
			int n2 = sc.nextInt();
			if(t > T) {
				System.out.println("Not enough tokens.  Total = "+T+".");
				continue;
			}
			if(b == 0) {
				if(n2 < n1) {
					T += t;
					System.out.println("Win "+t+"!  Total = "+T+".");
				}else {
					T -= t;
					System.out.println("Lose "+t+".  Total = "+T+".");
					if(T == 0) {
						System.out.println("Game Over.");
						return;
					}
				}
			}else {
				if(n2 > n1) {
					T += t;
					System.out.println("Win "+t+"!  Total = "+T+".");
				}else {
					T -= t;
					System.out.println("Lose "+t+".  Total = "+T+".");
					if(T == 0) {
						System.out.println("Game Over.");
						return;
					}
				}
			}
		}
		sc.close();

	}

}
