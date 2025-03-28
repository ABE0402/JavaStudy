import java.util.Scanner;

public class CorrectWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int grade=0;
		while(true) {
			System.out.println("점수를 입력해주세요 :");
			grade = scanner.nextInt();
			if (grade > 100 || grade < 50) {
				System.out.println("잘못 입력하셨습니다.");
			}
			else if (grade >= 90 && grade <=100) {
				System.out.println("A");
				break;
			}
			else if (grade >= 80 && grade <=89) {
				System.out.println("B");
				break;
			}
			else if (grade >= 70 && grade <=79) {
				System.out.println("C");
				break;
			}
			else if (grade >= 60 && grade <=69) {
				System.out.println("D");
				break;
			}
			else if (grade >= 50 && grade <=59) {
				System.out.println("F");
				break;
			}

			scanner.close();
		}
	}
}


