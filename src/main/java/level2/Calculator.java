package level2;
import java.util.ArrayList;

public class Calculator {
    final static double PI = 3.14159; // 변하지 않는 값, 상수 => 따라서 final static 사용

    // 연산 결과 저장하는 컬렉션 타입 필드, 직접 접근 못하도록 막기(private)
    private ArrayList<Integer> arr1; // 사칙연산
    private ArrayList<Double> arr2; // 원의 넓이
    // 생성자
    public Calculator() {
        this.arr1 = new ArrayList<>();
        this.arr2 = new ArrayList<>();
    }

    // 사칙연산
    // 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산 기능 수행 후 결과 값 반환
    public int calculate(int a, int b, char c) throws DivideZeroException, IllegalOperatorException { //예외 처리
        int result = 0;

        if (c == '+') result = a+b;
        else if (c == '-') result = a-b;
        else if (c == '*') result = a*b;
        else if (c == '/') {
            if (b == 0) {
                throw new DivideZeroException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else result = a/b;
        } else {
            throw new IllegalOperatorException("올바르지 않은 연산 기호가 들어 왔습니다. (+, -, *, /)");
        }
        this.arr1.add(result);
        return result;
    }

    public void inquiryResults() {
        System.out.print("저장된 연산결과 조회:  ");
        for (Integer num : this.arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void removeResult() {
        this.arr1.remove(0); // 외부에서 접근하는 게 아닌, 내부에서 접근
    }

    // getter
    public ArrayList<Integer> getArr() {
        return new ArrayList<>(this.arr1); // ArrayList는 참조 타입으로, 바로 반환하면 주소를 공유하는 것이기에 외부에서도 값이 수정 가능(직접 접근), 따라서 새로 만들어 내보내기
    }
    // setter
    public void setArr(ArrayList<Integer> arr) {
        this.arr1 = new ArrayList<>(arr); // 주소가 공유되면 외부 arr가 변경될 때 내부 arr까지 같이 변경되어 버림, 즉 캡슐화 위반. 따라서 새로 만들어서 arr에 넣어 줌
    }

    // 원의 넓이
    public double calculateCircleArea(int r) {
        double area = PI * r * r;
        this.arr2.add(area); // 계산된 원의 넓이 저장
        return area;
    }

    public void inquiryAreas() {
        System.out.print("저장된 원의 넓이 조회:  ");
        for (Double num : this.arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void removeAreas() {
        this.arr2.remove(0); // 외부에서 접근하는 게 아닌, 내부에서 접근
    }

    // getter
    public ArrayList<Double> getArr2() {
        return new ArrayList<>(this.arr2); // ArrayList는 참조 타입으로, 바로 반환하면 주소를 공유하는 것이기에 외부에서도 값이 수정 가능(직접 접근), 따라서 새로 만들어 내보내기
    }
    // setter
    public void  setArr2(ArrayList<Double> arr) {
        this.arr2 = new ArrayList<>(arr); // 주소가 공유되면 외부 arr가 변경될 때 내부 arr까지 같이 변경되어 버림, 즉 캡슐화 위반. 따라서 새로 만들어서 arr에 넣어 줌
    }

}

