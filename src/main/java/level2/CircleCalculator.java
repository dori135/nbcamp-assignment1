package level2;

public class CircleCalculator extends Calculator{
    public double calculate(int r) {
        double area = PI * r * r;
        super.arr.add(area); // 계산된 원의 넓이 저장
        return area;
    }
}
