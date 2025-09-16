package string_concept;

public class Reverse_String_charAt_subString_toCharArray {

	public static void main(String[] args) {
		charAt();
		subString();
		toCharArray();
	}
	static void charAt()
    {
        String s1="programming";
		
		for (int j=s1.length()-1;j>=0;j--)
		{
			{
				System.out.println(s1.charAt(j));
			}
		}
		System.out.println("-----------------------------------");
    }
    static void subString()
    {
    	String s2="origin";
    	for(int i=s2.length();i>0;i--)
    	{
    		int j=i-1;
    		System.out.println(s2.substring(j,i));
    		
    	}
    	System.out.println("-----------------------------------");
    }
    static void toCharArray()
    {
        String s1="difference";
        char ch[]=s1.toCharArray();
        for(int i=s1.length()-1;i>=0;i--)
        {
        	System.out.println(ch[i]);
        }
        System.out.println("-----------------------------------");

    }
}
