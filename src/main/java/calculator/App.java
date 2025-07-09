package calculator;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String ch = ""; // 초기화

        int [] arr = new int [10];
        int count = 0;

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

            if (count == arr.length) { // 배열이 가득 차면,
                for (int i = 0; i < arr.length-1; i++) arr[i] = arr[i+1]; // 결과 값을 한 칸씩 앞으로 이동(가장 오래된 값 제거)
                arr[count-1]  = result; // 새로운 결과 값을 마지막 index에 저장
            }
            else arr[count++] = result; // 배열이 가득 차지 않았다면, result를 count 위치에 저장한 뒤, count 1 증가

            System.out.print("저장된 결과 출력: ");
            for (int i=0; i<count; i++) System.out.print(arr[i] + " ");
            System.out.println("\n결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            ch = sc.next();

        }while(!(ch.equals("exit"))); // ch가 exit가 아니라면 반복
    }
}
