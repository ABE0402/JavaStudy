class Parent{
	int parentVar;
	
	void parentMethod() {
		System.out.println("parent method");
	}
}
class Child extends Parent{
	int childVar;
	
	void childMethod() {
		System.out.println("child method");
	}
}
public class ExtendsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.parentMethod();
		child.childMethod();
		
		System.out.println("child.parentVar =" + child.parentVar);
		System.out.println("child.childVar =" + child.childVar);

	}

}
