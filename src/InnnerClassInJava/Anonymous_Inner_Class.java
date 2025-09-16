package InnnerClassInJava;

public class Anonymous_Inner_Class {

	public static  void main(String[] args) {
		
		A obj1 = new A() {
			public void display()
			{
				System.out.println("Anonymous Implementation");
			}
		};
		obj1.display();
	}
	
}
