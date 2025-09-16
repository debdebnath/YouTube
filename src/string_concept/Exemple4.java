package string_concept;

public class Exemple4 {

	public static void main(String[] args) {
		String s1 = "Debajyoti";
		String s2 = "Debajyoti";
		String s3 = new String("Debajyoti");
		String s4 = "Tendulkar";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println("_______________");
		
		String s5 = "Debajyoti";
		String s6 = "DEBAJYOTI";
		
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
	}

}
