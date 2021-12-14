package search;
import java.util.Scanner;
public class BinarySearch {

    public static void main(String[] args) {
        // 목표 : int형 배열에서 원하는 값이 어느 Index에 있는지 리턴
        Scanner scanner = new Scanner(System.in);
        int[] targetArr = {1,2,4,7,11,17,22,24,27,30};
        System.out.print("찾고자하는 값 입력 : ");
        int targetNum = scanner.nextInt();

        System.out.println(binarySearchProc(targetArr,targetNum));








    }


  public static String binarySearchProc(int[] arrays, int targetNum){
      int pl = 0;
      int pr = arrays.length -1;
      int pc = 0;
        while(true){
            pc = (pl + pr) / 2;
            if(arrays[pc] == targetNum) return "찾는 값은 " + pc + "인덱스에 있습니다.";
            else if(arrays[pc] < targetNum){
                pl = pc + 1;
            }else{
                pr = pc -1;
            }

            if(pr < pl) return "해당 값은 없습니다.";

        }

  }



}
