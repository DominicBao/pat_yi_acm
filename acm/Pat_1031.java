package acm;

//{7，9，10，5，8，4，2，1，6，3，7，9，10，5，8，4，2}
import java.util.Scanner;

public class Pat_1031 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int pan = 0;
		 int n = sc.nextInt();
		 String a[] = new String[n];
		 for(int i = 0;i < n;i++) {
			 a[i] = sc.next();
		 }
		 int b[] = new int[n];
		 int quan[] = new int[] {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		 String he[] = new String[] {"1","0","X","9","8","7","6","5","4","3","2"};
		 for(int i=0;i < n;i++) {
			 b[i] = 0;
		 }
		 
		 for(int i = 0;i < n;i++) {
			 int sum = 0;
			 for(int j = 0;j < 17;j++) {
				 if(a[i].charAt(j)>=48&&a[i].charAt(j)<=57) {
					 sum+=Integer.valueOf(a[i].substring(j,j+1))*quan[j];
				 }else {
					 System.out.println(a[i]);
					 pan = 1;
					 break;
				 }
				 if(j == 16) { 
					 int c = sum%11;
					 //System.out.println(c);
					 //System.out.println(a[i].substring(17,18));
					 if(a[i].substring(17,18).equals(he[c])) {
						 break;
					 }else{
						 System.out.println(a[i]);
						 pan = 1;
					 }
				 }
			 }
		 }
		 if(pan == 0) {
			 System.out.println("All passed");
		 }
		 
		 sc.close();

	}

}
