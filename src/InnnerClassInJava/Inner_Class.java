package InnnerClassInJava;

public class Inner_Class {
	
	private int a = 89;
	
	class Test
	{
		void display()
		{
			System.out.println("The First Value of a is :"+a);
		}
		void display(int a)
		{
			System.out.println("The second value of a is :"+a);
		}
	}
	public static void main(String[] args) {
		Inner_Class obj1 = new Inner_Class();
		Inner_Class.Test obj2 = obj1.new Test();
		
		obj2.display();
		obj2.display(9);
	}
}
