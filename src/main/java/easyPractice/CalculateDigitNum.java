package easyPractice;
import java.util.Scanner;
public class CalculateDigitNum {
    public static void main(String[] args) {
        // 목적 : 양수 입력 시 해당 수 자릿수 계산
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        do{
            System.out.print("양수를 입력하세요 : "); num = scanner.nextInt();
        }while(num <= 0);

       int digitNum = calculateDigitNum(num);

        System.out.println(num + "의 총 자릿수 : " + digitNum);

    }
    public static int calculateDigitNum(int num){
        int count = 0;

        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
