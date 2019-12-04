package acm;
import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Pat_1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		x = x.replaceAll("[^a-z^A-Z]", "");
		x = x.replaceAll("\\^", "");
		x = x.toLowerCase();
		
		List<String> arrlist = new ArrayList<String>();
		HashSet<String> hashset = new HashSet<String>();
		for(int i = 0;i < x.length();i++) {
			arrlist.add(x.charAt(i)+"");
			hashset.add(x.charAt(i)+"");
		}
		Collections.sort(arrlist);
		
		StringBuilder xx = new StringBuilder();
		for(String a:arrlist) {
			xx.append(a);
		}
		x = xx.toString();
		
		Iterator<String> iterator = hashset.iterator();
		
		int max = 0;
		String res = "";
		while(iterator.hasNext()) {
			String i = iterator.next();
			int start = x.indexOf(i);
			int end = x.lastIndexOf(i);
			if(max < end-start+1) {
				max = end-start+1;
				res = i;
			}
		}
		System.out.println(res + " "+max);
		sc.close();
		// TODO Auto-generated method stub

	}
}
