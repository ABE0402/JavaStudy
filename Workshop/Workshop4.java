import java.util.Scanner;

public class Workshop4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
                int balance = 0;
                boolean run = true;
        
        while (run) {
            System.out.println("--------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("--------------------------------");
            System.out.print("선택> ");
            
            int num = scanner.nextInt();
            
           
            scanner.nextLine(); 
            
           
            if (num == 1) {
                System.out.println("선택 > " + num);
                System.out.print("예금액 > ");
                int money1 = scanner.nextInt();
                balance += money1;  
            } 
            else if (num == 2) {
                System.out.println("선택 > " + num);
                System.out.print("출금액 > ");
                int money2 = scanner.nextInt();
                if (money2 > balance) {
                    System.out.println("잔고가 부족합니다.");
                } else {
                    balance -= money2;  
                }
            } 
            else if (num == 3) {
                System.out.println("선택 > " + num);
                System.out.println("잔고 > " + balance);  
            } 
            else if (num == 4) {
                System.out.println("선택 > " + num);
                run = false;  
            } 
            else {
                System.out.println("잘못된 선택입니다.");
            }
        }
        
        scanner.close();
        System.out.println("프로그램 종료");
    }
}
