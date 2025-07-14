package level2;

public class DivideOperator implements Operator {
    public double operate(int a, int b) throws DivideZeroException{
        if (b==0){
            throw new DivideZeroException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
        return a/(double)b;
    }
}
