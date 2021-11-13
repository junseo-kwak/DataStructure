package array;
import java.util.Scanner;

public class CopyArray {
    // 목표 : 한 배열의 모든 요소를 다른 배열에 복사 / 역순복사

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 피복사 배열 초기화
        int[] arr1 = {1,2,3,4,5};

        // 복사할 배열 초기화
        System.out.print("복사할 배열의 크기 : ");
        int arrSize = scanner.nextInt();

        int[] arr2 = new int[arrSize];

        // 배열 요소 초기화

        for(int i = 0; i < arr2.length; i++){
            System.out.print("arr2[" + i + "]의 값 : ");
            arr2[i] = scanner.nextInt();
        }

        System.out.println("== 복사할 배열 ==");
        // 초기화 확인
        for(int i = 0; i < arr2.length; i++){
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }

        System.out.println("===============");
        // 순서대로 복사
        arr1 = copyArr(arr1,arr2);

        // 확인

        System.out.println("== 복사 후 arr1 == ");
        for(int i = 0; i < arr1.length; i++){
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }
        System.out.println("================= ");

        // 역순복사

        arr1 = copyArrAsReverse(arr1,arr2);
        
        System.out.println("== 역순복사 후 arr1 == ");
        for(int i = 0; i < arr1.length; i++){
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }
        System.out.println("================= ");

    }

    static int[] copyArr(int[] a, int[] b){
        a = new int[b.length];

        for(int i = 0; i < a.length; i++){
            a[i] = b[i];
        }
        return a;
    }

    static int[] copyArrAsReverse(int[] a, int[] b){
        a = new int[b.length];

        for(int i = 0; i < a.length; i++){
            a[i] = b[b.length -1 - i];
        }
        return a;
    }




}
