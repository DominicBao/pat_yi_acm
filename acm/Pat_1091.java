package acm;

import java.util.Scanner;

public class Pat_1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a();
		int n = sc.nextInt();
		for(int i = 0;i < n;i++) {
			int k = sc.nextInt();
			String kk = k+"";
			for(int g = 1;g < 10;g++) {
				int res = k*k*g;
				String res1 = res+"";
				if(res1.substring((res1.length()-kk.length()),res1.length()).equals(kk)) {
					System.out.println(g+" "+res1);
					break;
				}else if(g == 9){
					System.out.println("No");
					
				}
			}
		}
		
	}
	
	public static void a() {
		int a = 0;
		int sum  = 0;
		for(int i = 0; i< 99;i++) {
			sum += i;
		}
		System.out.print(sum);
	}

}


