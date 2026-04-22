
public class A {
	public void show() {
		System.out.println("Inside Class A show method.");
	}
}
public class B extends A{
	public void show() {
		super.show();
		System.out.println("Inside Class B show method.");
	}
}

public class OverridingMain {
	public static void main(String[] args) {
		B b1=new B();
		b1.show();
	}
}


