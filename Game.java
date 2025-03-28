import java.util.Scanner;
import java.util.Random;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int wincount = 0, losscount = 0;
        while (true) {
            System.out.println("가위 바위 보를 선택하세요");
            System.out.print("가위 1번 바위 2번 보 3번 : ");
            int chose = scanner.nextInt();
            int ranNum = random.nextInt(3) + 1;  		
                
            if (chose == ranNum) {
                System.out.println("비겼습니다.");
            } else if ((chose == 1 && ranNum == 3) || (chose == 2 && ranNum == 1) || (chose == 3 && ranNum == 2)) {
                System.out.println("이겼습니다.");
                wincount++;
            } else {
                System.out.println("졌습니다.");
                losscount++;
            }

          
            System.out.println("현재 승리 횟수: " + wincount + ", 패배 횟수: " + losscount);
            
            System.out.print("한 게임 더 할래? 재시작 1, 종료 2: ");
            int chose2 = scanner.nextInt();	
            if (chose2 == 2) {
                break;  
            }
        }

        scanner.close();
        System.out.println("게임 종료. 최종 승리 횟수: " + wincount + ", 최종 패배 횟수: " + losscount);
    }
}
