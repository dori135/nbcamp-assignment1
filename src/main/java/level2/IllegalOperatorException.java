package level2;

// 연산 기호가 올바르지 않은 경우의 Exception 클래스 생성
public class IllegalOperatorException extends Exception {
    public IllegalOperatorException(String message) {
        super(message);
    }
}
