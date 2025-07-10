package level2;

// 나눗셈에서 분모에 0이 들어온 경우의 Exception 클래스 생성
public class DivideZeroException extends Exception {
    public DivideZeroException(String message) {
        super(message);
    }
}
