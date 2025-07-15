package level2;

import java.util.HashMap;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(HashMap<Character, Operator> opMap) {
        super(opMap);
    }

    /**
     *  사칙연산하는 메서드
     * @param a 첫 번째 정수, 0 이상의 정수 (int)
     * @param b 두 번째 정수, 0 이상의 정수,(int)
     * @param c 사칙연산 기호(char)
     * @return 연산 결과 (double)
     * @throws DivideZeroException 두 번째 정수 b에 0이 들어오면 발생
     * @throws IllegalOperatorException + - * / % 외의 연산 기호가 들어오면 발생
     */
    public double calculate(int a, int b, char c) throws DivideZeroException, IllegalOperatorException { //예외 처리
        Operator op = opMap.get(c);
        if (op==null)
            throw new IllegalOperatorException("올바르지 않은 연산 기호가 들어 왔습니다. (+, -, *, /)");
        double result = op.operate(a, b);

        super.arr.add(result);
        return result;
    }
}
