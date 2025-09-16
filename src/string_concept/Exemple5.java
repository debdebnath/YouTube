package string_concept;

public class Exemple5 {

	public static void main(String[] args) {
		String s1 = "Debajyoti";
		String s2 = "Debajyoti";
		String s3 = new String("Debajyoti");
		
		System.out.println(s1==s2);
		
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s3));
	}

}
