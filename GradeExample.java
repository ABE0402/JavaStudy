import java.util.Scanner;

public class GradeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int grade,han, math, eng, num, avg, result=0;
		while(true) {
			System.out.println("학생 번호 입력 :");
			num = scanner.nextInt();
			if(num > 10 && num <= 0) {
				System.out.println("잘못입력했습니다.");
			}
			System.out.println("학생 이름 :");
			String name = scanner.next();
			System.out.println("국어 :");
			han = scanner.nextInt();
			if(han > 100 && num < 0) {
				System.out.println("잘못입력했습니다.");
			}
			System.out.println("수학 :");
			math = scanner.nextInt();
			if(math > 100 && num < 0) {
				System.out.println("잘못입력했습니다.");
			}
			System.out.println("영어 :");
			eng = scanner.nextInt();
			if(num > 100 && num < 0) {
				System.out.println("잘못입력했습니다.");
			}
			
			result = han+math+eng;
			avg= result/3 ;

			
			System.out.print("번호 : " + num+" ");
			System.out.println("이름 : " + name);
			System.out.print("국어 : " + han +"점 ");
			System.out.print("영어 : " + eng+"점 ");
			System.out.println("수학 : " + math+"점");
			System.out.print("총점 : " + result + "점 ");
			System.out.print("평균 : " + avg + "점");
			
			break;
			
			
			
		}
		scanner.close();
	}


}
