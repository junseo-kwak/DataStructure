package stack;
import java.util.Scanner;
public class IntStackTester {

    public static void main(String[] args) {
        IntStack intStack = new IntStack(5);
        Scanner scanner = new Scanner(System.in);
        // 스택 최대 Capacity 확인
        System.out.println("스택 Capacity : " + intStack.capacity());

        // stack push
        intStack.push(1);
        intStack.push(3);
        intStack.push(5);
        intStack.push(7);
        intStack.push(9);
        intStack.push(11);
        // stack 요소값 확인
        intStack.dump();

        // 입력한 값 인덱스 확인
        System.out.print("인덱스를 찾을 값 입력 : ");
        int index = intStack.indextOf(scanner.nextInt());

        if(index == -1 ) System.out.println("해당 값을 찾을 수 없습니다.");
        else System.out.println("해당 값은 " + index + "에 있습니다.");

        // isFull 테스트
        System.out.println("해당 스택이 가득찼는지 확인 : " + intStack.isFull());

        // 스택 클리어
        System.out.println("=========== 스택 클리어 ===========");
        intStack.clear();

        // isEmpty 테스트
        System.out.println("해당 스택이 비었는지 확인 : " + intStack.isEmpty());

    }



}
