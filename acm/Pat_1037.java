package acm;

import java.util.Arrays;
import java.util.Scanner;

public class Pat_1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String get = sc.next();
		String post = sc.next();
		int[] get_i = Arrays.stream(get.split("\\.")).mapToInt(Integer::valueOf).toArray();
		int[] post_i = Arrays.stream(post.split("\\.")).mapToInt(Integer::valueOf).toArray();
		
		int pan = 0;

		for(int i = 0;i < 3;i++) {
			if(post_i[i]>get_i[i]) {
				break;
			}else if(post_i[i]<get_i[i]) {
				int[] x = new int[3];
				x = get_i;
				get_i = post_i;
				post_i = x;
				pan = 1;
				break;
			}
		}
		
		String res = "";
		int cha2 = post_i[2]-get_i[2];
		if(cha2 >= 0) {
			res = "."+cha2;
		}else {
			post_i[1] = post_i[1] - 1;
		}
		
		int cha1 = post_i[1]-get_i[1];
		if(cha1 >= 0) {
			if(cha2 < 0) {
				res = "."+(29+cha2) + res;
			}
			res = "."+cha1+res;
			
		}else {
			post_i[0] = post_i[0] - 1;
		}
		
		int cha0 = post_i[0]-get_i[0];
		if(cha0 >= 0) {
			if(cha2 < 0&&cha1 < 0) {
				res = "."+(29+cha2)+res;
			}
			if(cha1 < 0) {
				res = "."+(17+cha1)+res;
			}
			res = cha0+res;
			
			
		}
		if(pan == 1) {
			res = "-"+res;
		}
		System.out.println(res);
		
		sc.close();

	}
}
