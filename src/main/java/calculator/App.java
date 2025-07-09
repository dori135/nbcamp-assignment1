package calculator;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.print("첫 번째 숫자(0 이상의 정수)를 입력하세요:  ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자(0 이상의 정수)를 입력하세요:  ");
        int b = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
        // 내가 가정한 사칙연산 기호와 사용자가 실제 입력하는 사칙연산 기호가 다르지 않도록 print에 추가 설명
        char c = sc.next().charAt(0);

        boolean check = true;

        if (a<0 || b<0) System.out.println("숫자는 0 이상의 정수만 입력할 수 있습니다.");
        else {
            int result = 0;
            if (c == '+') result = calculator.sum(a, b);
            else if (c == '-') result = calculator.sub(a, b);
            else if (c == '*') result = calculator.multi(a, b);
            else if (c == '/') {
                if (b == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    check = false;
                } else result = calculator.div(a, b);
            } else {
                System.out.println("올바르지 않은 연산 기호가 들어 왔습니다. (+, -, *, /)");
                check = false;
            }
            if (check) System.out.println("결과: " + result);
        }
    }
}
