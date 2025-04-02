//일상 생활에서 부모가 없는 자식이 있을 수 없다.
//자바도 부모 클래스객체가 생성안되었는데 자식 클래스 객체가 생성될 수 없다.
//따라서, 자식 클래스의 생성자가 호출되면 자동으로 부모클래스의 생성자가 먼저 호출되어 부모클래스 객체가 생성된 후
//자식클래스 객체가 생성됨.
//자식클래스의 생성자에서 자동으로 호출되는 부모클래스의 생성자는 빈생성자임.
//클래스에 생성자가 하나도 정의되어 있지 않으면 빈생성자가 자동으로 생성되지만
//인자있는 생성자가 하나라도 정의되어 있으면 빈생성자 만들어 지지 않는다.

//따라서, 부모 클래스에 인자 있는 생성자만 정의가 되어 있으면 자식 클래스에서
//super()를 사용해서 명시적으로 인자있는 생성자를 호출해야
class Base{
	int x;
	public Base(int x) {
		System.out.println("base constructor");
		this.x =x ;

	}
}

class Derived extends Base{
	public Derived() {
		super(10);
		System.out.println("derived constructor");
	}
}
public class SuperConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived derived = new Derived();

	}

}

