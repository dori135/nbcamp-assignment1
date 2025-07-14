package level2;

// operator들이 추가되어도 같은 구조로 추가할 수 있도록 interface 선언
public interface Operator {
    // boolean check(char op);
    // 위의 방식대로 하나 하나 체크하려고 하였으나 연산이 많아질수록 다 비교해야 해서 비효율적 -> hashmap으로 묶어서 관리
    double operate(int a, int b) throws DivideZeroException;
}
