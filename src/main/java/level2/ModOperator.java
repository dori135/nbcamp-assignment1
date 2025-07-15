package level2;

public class ModOperator  implements  Operator {
    /**
     *  두 정수의 나머지를 계산하는 메서드
     * @param a 첫 번째 정수, 0 이상의 정수 (int)
     * @param b 두 번째 정수, 양의 정수,(int)
     * @return a를 b로 나눈 나머지 (double)
     * @throws DivideZeroException 두 번째 정수 b에 0이 들어오면 발생
     */

    public double operate(int a, int b) {
        if (b==0){
            throw new DivideZeroException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
        return a%b;
    }
}