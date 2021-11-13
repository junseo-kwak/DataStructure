package array;
import java.util.Scanner;



public class ReverseArray {
    // 목표 : 생성된 배열을 역순으로 정렬 및 출력

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("생성할 배열 크기 입력 : ");
        int arrLength = scanner.nextInt();

        // 배열 인스턴스화
        int[] intArr = new int[arrLength];

        // 배열 값 입력
        for(int i = 0; i < intArr.length; i++){
            System.out.print(i + "번째 인덱스 값 입력 : ");
            intArr[i] = scanner.nextInt();
        }
        System.out.println("== 초기 배열 값 ==");
        // 생성된 배열 초기상태 확인

        for(int i = 0; i < intArr.length; i++){
            System.out.println("intArr[" + i + "] : " + intArr[i]);
        }


        // 역순으로 정렬
        reverseArr(intArr);

        System.out.println("== 역순 정렬 이후 값 ==");

        // 역순 확인
        for(int i = 0; i < intArr.length; i++){
            System.out.println("intArr[" + i + "] : " + intArr[i]);
        }

    }

    static void reverseArr(int[] targetArr){

        for(int i = 0; i < targetArr.length / 2; i++){
            int tempInt = 0;
            tempInt = targetArr[i];
            targetArr[i] = targetArr[targetArr.length - 1 - i];
            targetArr[targetArr.length - 1 - i] = tempInt;

        }

    }




}
