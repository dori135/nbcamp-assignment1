package calculator;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String ch = ""; // 초기화

        ArrayList<Integer> arr = new ArrayList<>();

        do { // 무조건 1번은 실행 되도록 do while 문 사용
            // 양의 정수 0포함 2개 전달 받기, 음의 정수, 실수 등 입력하지 않도록 print에 추가 설명
            System.out.print("첫 번째 숫자(0 이상의 정수)를 입력하세요:  ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자(0 이상의 정수)를 입력하세요:  ");
            int b = sc.nextInt();

            // 내가 가정한 사칙연산 기호와 사용자가 실제 입력하는 사칙연산 기호가 다르지 않도록 print에 추가 설명
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            char c = sc.next().charAt(0);

            // 생각해 보니 문제 조건 자체가 입력 받은 '양의 정수'여서 사실 아래 if문 구절은 필요 없을 듯,,,
            if (a<0 || b<0) {
                System.out.println("숫자는 0 이상의 정수만 입력할 수 있습니다.");
                continue; // 계산이 애초에 진행되지 않았으므로 '더' 계신하시겠습니까 대신 continue로 while문 처음으로 돌아가게 함
            }
            int result = 0;
            if (c == '+') result = calculator.sum(a, b);
            else if (c == '-') result = calculator.sub(a, b);
            else if (c == '*') result = calculator.multi(a, b);
            else if (c == '/') {
                if (b == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    continue;
                } else result = calculator.div(a, b);
            } else {
                System.out.println("올바르지 않은 연산 기호가 들어 왔습니다. (+, -, *, /)");
                continue;
            }
            arr.add(result);
            System.out.println("결과: " + result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String rem = sc.next();
            if (rem.equals("remove")) arr.remove(0); // 가장 오래된 결과 삭제

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inq = sc.next();
            if (inq.equals("inquiry")) {
                System.out.print("저장된 연산결과 조회:  ");
                for (Integer num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            ch = sc.next();

        }while(!(ch.equals("exit"))); // ch가 exit가 아니라면 반복
    }
}
