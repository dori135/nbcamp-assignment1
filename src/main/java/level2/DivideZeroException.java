package level2;

// 나눗셈에서 분모에 0이 들어온 경우의 Exception 클래스 생성
// CircleCalculator에선 나눗셈이 쓰이지 않으므로 RuntimeException을 상속 받아서 굳이 thorw DicideZeroException을 하지 않아도 작동되도록 함
public class DivideZeroException extends RuntimeException {
    public DivideZeroException(String message) {
        super(message);
    }
}
