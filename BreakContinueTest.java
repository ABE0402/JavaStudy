
public class BreakContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer: for (int i =1; i <= 10; i ++) {
			for (int j =1; j <=10; j ++) {
				if (j == 5) 
//					break;
//					continue;
//					break outer;
					continue outer;
					
					
					System.out.println("i= "+ i + ", j=" + j);
				
			}
		}

	}

}
