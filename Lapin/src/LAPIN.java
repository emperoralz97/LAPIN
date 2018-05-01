import java.util.Scanner;

public class LAPIN {
	public static int NCharAt(String s, char ch) {
		int count = 0;
		for(char c : s.toCharArray()) {
			if(ch == c)count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		t = in.nextInt();
		while(t>0) {
			boolean flg = true;
			String s = in.next();
			int len = s.length();
			String s1 = s.substring(0,len/2);
			if(len%2==0) {
				String s2 = s.substring(len/2);
				for(int i = 97;i<=122;i++) {
					if(NCharAt(s1,(char)i)!=NCharAt(s2,(char)i)) {
						flg = false;
						break;
					}
				}
			}else {
				String s2 = s.substring(len/2+1);
				for(int i = 97;i<=122;i++) {
					if(NCharAt(s1,(char)i)!=NCharAt(s2,(char)i)) {
						flg = false;
						break;
					}
				}
			}
			
			if(flg)System.out.println("YES");
			else
				System.out.println("NO");
			t--;
		}
		

	}

}
