package level2;

public class ArithmeticCalculator extends Calculator {

    public double calculate(int a, int b, char c) throws DivideZeroException, IllegalOperatorException { //예외 처리
        double result;
        if (c == '+') result = a+b;
        else if (c == '-') result = a-b;
        else if (c == '*') result = a*b;
        else if (c == '/') {
            if (b == 0) {
                throw new DivideZeroException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else result = a/(double)b;
        } else {
            throw new IllegalOperatorException("올바르지 않은 연산 기호가 들어 왔습니다. (+, -, *, /)");
        }
        super.arr.add(result);
        return result;
    }

}
