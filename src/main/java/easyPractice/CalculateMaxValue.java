package easyPractice;
import java.util.Scanner;
public class CalculateMaxValue {

    public static void main(String[] args) {
        // 목표 : 입력 값 중 최대값 구하기
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("첫 번째 정수 : "); int value1 = scanner.nextInt();
        System.out.print("두 번째 정수 : "); int value2 = scanner.nextInt();
        System.out.print("세 번째 정수 : "); int value3 = scanner.nextInt();
        System.out.print("네 번째 정수 : "); int value4 = scanner.nextInt();

        // 1. 단순한 방법
        /*
            int maxValue = value1;

            if(value2 > maxValue) maxValue = value2;
            if(value3 > maxValue) maxValue = value3;
            if(value4 > maxValue) maxValue = value4;

            System.out.println("최대값 : " + maxValue);
        */

        // 2. Math 내장 라이브러리 및 배열 사용
        int intArr[] = {value1,value2,value3,value4};
        int maxValue = 0;
        for(int value : intArr){
            maxValue = Math.max(maxValue,value);
        }

        System.out.println("최대값 : " + maxValue);
    }
}
