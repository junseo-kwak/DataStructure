package easyPractice;
import java.util.Scanner;
public class CalculateSumValueByGauss {

    public static void main(String[] args) {
        // 목적 : 가우스의 덧셈을 이용하여 1부터 n까지의 합 구하기
        Scanner scanner = new Scanner(System.in);

        System.out.println("n 입력 : "); int value = scanner.nextInt();

        int sumValue = calculateSumValue(value);

        System.out.println("1부터 " + value + "까지의 합 : " + sumValue);

    }

    public static int calculateSumValue(int value){
        // Case1. 값이 짝수일 경우
        if(value % 2 == 0){
            return (1+value) * (value / 2);
        }else{ // Case2. 값이 홀수일 경우
            return (1+value) * ((value / 2)) + ((1+value) / 2);
        }
    }
}
