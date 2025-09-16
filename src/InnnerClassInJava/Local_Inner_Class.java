package InnnerClassInJava;

public class Local_Inner_Class {

	void display()
	{
		class Test
		{
			void sum()
			{
				System.out.println("The method will display sum of two number...");
			}
		}
		
		Test obj1 = new Test();
		obj1.sum();
	}
	
	public static void main(String[] args) {
		
		
		Local_Inner_Class obj2 = new Local_Inner_Class();
		obj2.display();
	}
}
