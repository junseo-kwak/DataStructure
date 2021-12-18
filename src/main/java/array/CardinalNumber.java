package array;
import java.util.*;

public class CardinalNumber {
    // 목표 : 10진수 정수를 입력한 기수로 변환하는 함수
    // 기수는 36진수까지 표기가능( 0 ~ Z 까지 사용)

    public static void main(String[] args) {
        int digits = 0;
        String test;
        ArrayList list = new ArrayList();


        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int cardinal = 0;
        char[] changedNumber = new char[32]; // int가 아니라 char형으로 선언
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int number = scanner.nextInt();

        do {
            System.out.print("변환할 기수 입력 : ");
            cardinal = scanner.nextInt();
        }while(cardinal < 2 && cardinal > 36);

        while(number != 0){
            changedNumber[digits++] = dChar.charAt(number % cardinal);
            number /= cardinal;
        }



        System.out.println("== 결과 확인 ==");
        
        for(int i = digits-1; i >=0; i--){
            System.out.print( changedNumber[i]);
        }

    }
}
