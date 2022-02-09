import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="123";
		StringBuffer sf = new StringBuffer(s1);
		System.out.println(sf);
		String s="1219";
		int len = s.length();
		String rev="";
		for (int m=(len-1);m>=0;m--)
		{
			rev=rev+s.charAt(m);
			//System.out.println(rev);
		}

		System.out.println(rev);


	}
}
