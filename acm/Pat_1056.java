package acm;

import java.util.Scanner;

public class Pat_1056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String a[] = new String[num];
		for(int i = 0;i < num;i++) {
			a[i] = sc.next();
		}
		String b[] = new String[(num)*(num-1)];
		
		int sum = 0;
		for(int i = 0;i < num;i++) {
			for(int j = 0;j < num;j++) {
				if(i == j) {
					continue;
				}else {
					//System.out.println(Integer.valueOf(a[i]+a[j]));
					sum += Integer.valueOf(a[i]+a[j]);
				}
			}
		}
		System.out.print(sum);
		sc.close();

	}

}
