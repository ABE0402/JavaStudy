//final 이 method 앞에 지정되면
//오버라이딩 할 수 없다.

class MethodSuper{
	final void superMethod() {
		
	}
}

class MethodSub extends MethodSuper{
	@Override
	void superMethod() {
		// TODO Auto-generated method stub
		super.superMethod();
	}
}

public class FinalMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
