//변수 앞에 final 예약어가 지정되면 상수가 된다.
public class FinalVarTest {

	final int x;
	//상수는 프로그램 상에서 가독성을 높이기 위해서 특정 값을 특정 이름으로 정의해 놓고 사용하는 것이므로
	//값을 초기화 하지 않으면 의미가 없다.
	//인스턴스 상수 = static 이 없는 상수
	//생성되는 객체마다 주어지는 상수이므로 주로 생성자에서 값을 초기화 함.

	static final int y = 200;
	//static 상수(클래스 상수)
	//해당 클래스를 사용하는 모든 객체에서 공유
	//카드의 넓이나 높이는 모든 카드에서 동일해야 하기 때문에 static상수로 지정하는 것이 맞다.
	//초기화: 상수 선언과 동시에 처리하거나 static 초기화 블록에서 처리한다.
	
	//프로그램에서 상수를 사용하는 이유
	//가독성을 향상
	//야구 게임
	//직구, 커브
	//if(ball ==1)
	//static final DIRECT =1
	//if(ball == DIRECT)
	
	static {
		
	}
	
	
	public FinalVarTest(int x) {
		// TODO Auto-generated constructor stub
		this.x = x;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVarTest fv1 = new FinalVarTest(10);
		FinalVarTest fv2 = new FinalVarTest(100);

		//인스턴스 상수도 상수이므로 객체를 생성할때 한번 정해지면 변경할 수 없다.
		//		fv1.x = 100;
		//		fv2.x = 200;
		
		System.out.println("FinalVarTest.y= " + FinalVarTest.y);
		System.out.println("fv1.y= " + fv1.y);
		System.out.println("fv2.y= " + fv2.y);
		
		//클래스 상수도 상수이기 떄문에 값을 변경할 수 없다.
		FinalVarTest.y = 1000;

	}

}
