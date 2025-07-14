package level2;

import java.util.HashMap;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(HashMap<Character, Operator> opMap) {
        super(opMap);
    }

    public double calculate(int a, int b, char c) throws DivideZeroException, IllegalOperatorException { //예외 처리
        Operator op = opMap.get(c);
        if (op==null)
            throw new IllegalOperatorException("올바르지 않은 연산 기호가 들어 왔습니다. (+, -, *, /)");
        double result = op.operate(a, b);

        super.arr.add(result);
        return result;
    }
}
