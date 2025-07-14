package level2;

import java.util.HashMap;

public class CircleCalculator extends Calculator{

    // 필요 없는 add, sub, div까지 다 가져 와야 했음
    public CircleCalculator(HashMap<Character, Operator> opMap) {
        super(opMap);
    }

    public double calculate(int r) throws RadiusZeroException{
        if (r<=0)
            throw new RadiusZeroException("반지름은 0 또는 음수가 될 수 없습니다.");
        Operator op = opMap.get('*');
        double area = PI * op.operate(r, r);
        super.arr.add(area); // 계산된 원의 넓이 저장
        return area;
    }
}
