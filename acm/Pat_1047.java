package acm;

import java.util.Scanner;
import java.util.HashMap;

public class Pat_1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
		String keyWin = "";
		int maxScore = -1;
		
		for(int i = 0 ;i < n;i++) {
			String x = sc.next();
			int score = sc.nextInt();
			String key = x.split("-")[0];
			int old = hashmap.getOrDefault(key, -1);
			if(old != -1) {
				score += old;
			}
			if(maxScore < score) {
				keyWin = key;
				maxScore = score;
			}
			hashmap.put(key, score);
		}
		System.out.println(keyWin + " "+maxScore);
		sc.close();
	}
}
