
public class PracticeAllPrograms {

	public static void main(String[] args) {
		
		Junk();
		reverseString();
	}
	public static void Junk()
	{
		String S1="C*&^%^&&he$@#ta&%$na";
		String S2= S1.replaceAll("[^0-9A-Za-z]","");
		System.out.println(S2);
	}
	
	public static void reverseString()
	{
		String S3="Chetana";
		StringBuffer sf=new StringBuffer(S3);
		System.out.println(sf.reverse());
		int len=S3.length();
		String rev="";
		for (int m=(len-1);m>=0;m--)
		{
			 rev=rev+S3.charAt(m);
			//System.out.println(rev);
		}

	}
	
	
	

}
