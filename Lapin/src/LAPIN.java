import java.util.Scanner;

public class LAPIN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		t = in.nextInt();
		while(t>0) {
			boolean flg = false;
			String s = in.next();
			int len = s.length();
			if(len%2==0) {
				if(s.substring(0, len/2).equals(s.substring(len/2)))flg = true;
			}else {
				if(s.substring(0, len/2).equals(s.substring(len/2+1)))flg = true;
			}
			
			if(flg)System.out.println("YES");
			else
				System.out.println("NO");
			t--;
		}
		

	}

}
