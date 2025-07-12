package level2;

public class ArithmeticCalculator extends Calculator {


    public ArithmeticCalculator(AddOperator add, SubtractOperator sub, MultiplyOperator mul, DivideOperator div) {
        super(add, sub, mul, div);
    }

    public double calculate(int a, int b, char c) throws DivideZeroException, IllegalOperatorException { //예외 처리
        double result = 0;
        if (c == '+') result = add.operate(a, b);
        else if (c == '-') result = sub.operate(a, b);
        else if (c == '*') result = mul.operate(a, b);
        else if (c == '/') result = div.operate(a, b);
        else throw new IllegalOperatorException("올바르지 않은 연산 기호가 들어 왔습니다. (+, -, *, /)");
        super.arr.add(result);
        return result;
    }
}
