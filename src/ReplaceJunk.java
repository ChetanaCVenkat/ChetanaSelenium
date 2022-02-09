
public class ReplaceJunk {

	public static void main(String[] args) {

		String abc = "How&&^%^&&&&&*^^^^ are(**((* you )(***today !";

		String def = abc.replaceAll("[^A-Za-z0-9]", " ");
		
		System.out.println(def);
	}

}
