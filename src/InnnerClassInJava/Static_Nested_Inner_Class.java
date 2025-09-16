package InnnerClassInJava;

public class Static_Nested_Inner_Class {
	
	private static int a = 89;
	
	static class InnerClass
	{
		void display()
		{
			System.out.println("The value of a is :"+a);
		}
	}
	public static void main(String[] args) {
		
		Static_Nested_Inner_Class.InnerClass obj1 = new Static_Nested_Inner_Class.InnerClass();
		obj1.display();
	}

}
