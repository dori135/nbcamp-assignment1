package level2;

public class MultiplyOperator implements Operator {
    /**
     *  두 정수의 곱을 계산하는 메서드
     * @param a 첫 번째 정수, 0 이상의 정수 (int)
     * @param b 두 번째 정수, 0 이상의 정수,(int)
     * @return a와 b의 곱 (double)
     */
    public double operate(int a, int b){
        return a*b;
    }
}
