
public class A {
	public void showA() {
		System.out.println("Inside Class A show A method..");
	}
}

public class B extends A
{
	public void showB() {
		System.out.println("Inside Class B show B method..");
	}
}
public class C extends B
{
	public void showC() {
		System.out.println("Inside Class C show C method..");
	}
}

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1= new C();
		c1.showA();
		c1.showB();
		c1.showC();
		
	}

}
