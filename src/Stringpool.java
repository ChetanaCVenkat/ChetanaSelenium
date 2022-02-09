
public class Stringpool {

	public static void main(String[] args) {
		
		String a = "abc";
		String b = "abc";
		
		
		String c = new String ("abc");
		if(a==b)
		{
			System.out.println("Equal");
			a="ghj";
			int k=8;
			int j=0;
			int l=k+j;
		}
		
		else
		{
			System.out.println("Not");
		}
		
		if(a.equals(c))
		{
			System.out.println("Equal");
			
		}
		
		
	}

}
