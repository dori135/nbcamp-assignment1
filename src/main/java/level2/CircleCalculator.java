package level2;

public class CircleCalculator extends Calculator{

    public CircleCalculator(AddOperator add, SubtractOperator sub, MultiplyOperator mul, DivideOperator div) {
        super(add, sub, mul, div);
    }

    public double calculate(int r) {
        double area = PI * mul.operate(r, r);
        super.arr.add(area); // 계산된 원의 넓이 저장
        return area;
    }
}
