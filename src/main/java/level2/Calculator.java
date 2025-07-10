package level2;
import java.util.ArrayList;

public class Calculator {
    final static double PI = 3.14159; // 변하지 않는 값, 상수 => 따라서 final static 사용

    // 연산 결과 저장하는 컬렉션 타입 필드, 직접 접근 못하도록 막기(private)
    // 현재 구현은 사칙연산과 원의 넓이를 따로 저장 (static 안 썼기 때문에)
    protected ArrayList<Double> arr; // 접근제어자 변경: 상속한 클래스도 공유 받으려면 public 또는 protected인데 캡슐화를 위해 전체가 접근할 수는 없는 protected 선택

    // 생성자
    public Calculator() {
        this.arr = new ArrayList<>();
    }

    public void inquiryResults() {
        System.out.print("저장된 결과 조회:  ");
        for (Double num : this.arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void removeResult() {
        this.arr.remove(0); // 외부에서 접근하는 게 아닌, 내부에서 접근
    }

    // getter
    public ArrayList<Double> getArr() {
        return new ArrayList<>(this.arr); // ArrayList는 참조 타입으로, 바로 반환하면 주소를 공유하는 것이기에 외부에서도 값이 수정 가능(직접 접근), 따라서 새로 만들어 내보내기
    }
    // setter
    public void setArr(ArrayList<Double> arr) {
        this.arr = new ArrayList<>(arr); // 주소가 공유되면 외부 arr가 변경될 때 내부 arr까지 같이 변경되어 버림, 즉 캡슐화 위반. 따라서 새로 만들어서 arr에 넣어 줌
    }

}

