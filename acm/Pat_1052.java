package acm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Pat_1052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list3 = new ArrayList<String>();
		ArrayList[] list = new ArrayList[] {list1,list2,list3};
		
		for(int i = 0;i < 3;i++) {
			String line = sc.nextLine();
			Pattern p = Pattern.compile("(\\[[^\\]]*\\])");
			Matcher m = p.matcher(line);
			while(m.find()) {
				list[i].add(m.group().substring(1,m.group().length()-1));
			}
		}
		int n = sc.nextInt();
		for(int i = 0;i < n;i++) {
			try {
				String res = "";
				int[] sum_x = new int[5];
				for(int g = 0;g < 5;g++) {
					sum_x[g] = sc.nextInt();
				}
				for(int g = 0;g < 5;g++) {
					int x = sum_x[g];
					if(g == 0||g == 4) {
						String r = list1.get(x-1);
						res += r;
					}else if(g == 1||g == 3){
						String r = list2.get(x-1);
						res += r;
					}else {
						String r = list3.get(x-1);
						res += r;
					}
					if(g == 0) {
						res += "(";
					}else if(g == 3) {
						res += ")";
					}
				}
				System.out.println(res);
			}catch(Exception e) {
				System.out.println("Are you kidding me? @\\/@");
			}
		}
		sc.close();
	}
}
