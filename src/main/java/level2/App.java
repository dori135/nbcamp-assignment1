package level2;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String ch = ""; // 초기화

        do { // 무조건 1번은 실행 되도록 do while 문 사용
            System.out.println("어떤 기능을 사용하고 싶은지 입력하세요 (사칙연산(1), 원의 넓이(2)): ");
            int choice = sc.nextInt();
            if (choice == 1) {
                // 양의 정수 0포함 2개 전달 받기, 음의 정수, 실수 등 입력하지 않도록 print에 추가 설명
                System.out.print("첫 번째 숫자(0 이상의 정수)를 입력하세요:  ");
                int a = sc.nextInt();
                System.out.print("두 번째 숫자(0 이상의 정수)를 입력하세요:  ");
                int b = sc.nextInt();

                // 내가 가정한 사칙연산 기호와 사용자가 실제 입력하는 사칙연산 기호가 다르지 않도록 print에 추가 설명
                System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
                char c = sc.next().charAt(0);

                try {
                    int result = calculator.calculate(a, b, c);
                    System.out.println("결과: " + result);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String rem = sc.next();
                if (rem.equals("remove")) calculator.removeResult(); // 삭제 메서드

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inq = sc.next();
                if (inq.equals("inquiry")) calculator.inquiryResults(); // 조회 메서드
            }
            else if (choice == 2) {
                // 양의 정수 0포함 2개 전달 받기, 음의 정수, 실수 등 입력하지 않도록 print에 추가 설명
                System.out.print("원의 반지름(0 이상의 정수)을 입력하세요:  ");
                int r = sc.nextInt();

                double result = calculator.calculateCircleArea(r);
                System.out.println("결과: " + result);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String rem = sc.next();
                if (rem.equals("remove")) calculator.removeAreas(); // 삭제 메서드

                System.out.println("저장된 원의 넓이를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inq = sc.next();
                if (inq.equals("inquiry")) calculator.inquiryAreas(); // 조회 메서드
            }
            else{
                System.out.println("올바르지 않은 선택입니다. 1, 2 중 골라주세요.");
                continue;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            ch = sc.next();

        }while(!(ch.equals("exit"))); // ch가 exit가 아니라면 반복
    }
}
