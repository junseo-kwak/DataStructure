package easyPractice;
import java.util.Scanner;

public class CalculateMiddleValue {

    public static void main(String[] args) {
        // 목적 : 중앙값 구하기
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 정수 : "); int value1 = scanner.nextInt();
        System.out.println("두 번째 정수 : "); int value2 = scanner.nextInt();
        System.out.println("세 번째 정수 : "); int value3 = scanner.nextInt();

        int minValue = calculateMinValue(value1,value2,value3);

        System.out.println("중앙값 : " + minValue);

    }

    public static int calculateMinValue(int value1, int value2, int value3){

        if(value1 >= value2){
            if(value2 > value3){
                return value2;
            }else if(value1 < value3){
                return value1;
            }else{
                return value3;
            }
        }else if(value1 > value3){
            return value1;
        }else if(value2 > value3){
            return value3;
        }else{
            return value2;
        }
    }

}
