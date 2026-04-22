
public class ArithematicOperations {
	private int a;
	private int b;
	private int c;
	public void addition(int v1,int v2) {
		a=v1;
		b=v2;
		c=a+b;
		System.out.println("Addition is : "+c);
	}
	public void subtraction(int v1,int v2) {
		a=v1;
		b=v2;
		c=a-b;
		System.out.println("Subtration is : "+c);
	}
	public void multiplication(int v1,int v2) {
		a=v1;
		b=v2;
		c=a*b;
		System.out.println("Multiplication is : "+c);
	}
	public void divison(int v1,int v2) {
		a=v1;
		b=v2;
		c=a/b;
		System.out.println("Division is : "+c);
	}
}

public class ArithematicOperationsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithematicOperations obj1=new ArithematicOperations();
		obj1.addition(10, 20);
		ArithematicOperations obj2=new ArithematicOperations();
		obj2.subtraction(10, 20);
		ArithematicOperations obj3=new ArithematicOperations();
		obj3.multiplication(10, 20);
		ArithematicOperations obj4=new ArithematicOperations();
		obj4.divison(10, 20);
	}

}
 
