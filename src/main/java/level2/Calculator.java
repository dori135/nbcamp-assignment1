package level2;
import java.util.ArrayList;

public class Calculator {

    // 연산 결과 저장하는 컬렉션 타입 필드
    ArrayList<Integer> arr = new ArrayList<>();

    // 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산 기능 수행 후 결과 값 반환
    public int calculate(int a, int b, char c) throws DivideZeroException, IllegalOperatorException { //예외 처리
        int result = 0;

        if (c == '+') result = a+b;
        else if (c == '-') result = a-b;
        else if (c == '*') result = a*b;
        else if (c == '/') {
            if (b == 0) {
                throw new DivideZeroException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else result = a/b;
        } else {
            throw new IllegalOperatorException("올바르지 않은 연산 기호가 들어 왔습니다. (+, -, *, /)");
        }
        this.arr.add(result);
        return result;
    }

    public void inquiry() {
        System.out.print("저장된 연산결과 조회:  ");
        for (Integer num : this.arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public void removeArr() {
        this.arr.remove(0);
    }
}

