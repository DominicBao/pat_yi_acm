package acm;

import java.util.ArrayList;

public class Rule {

	public static void main(String[] args) {
		//Arraylist
		ArrayList<String> arraylist = new ArrayList<String>();
		
		arraylist.add("0");
		arraylist.add("1");
		arraylist.add(0, "1111");//在0位置插入1111，后面元素后移
		arraylist.get(0);//"1111"
		arraylist.set(0, "00");//"1111",将0变成00
		arraylist.remove(0);//删除0位置，后面元素前移
		System.out.println(arraylist.size());
		ArrayList<String> arraylist1 = new ArrayList<String>();
		

	}

}
