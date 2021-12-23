package stack;
import java.util.logging.Logger;

public class IntStack {
     private int maxSize;
     private int pointer;
     private int[] stk;


     // 생성자
     public IntStack(int maxSize){
         pointer = 0;
         this.maxSize = maxSize;

         try{
             stk = new int[maxSize];
         }catch(OutOfMemoryError e){
             maxSize = 0;
         }
     }

     // 예외처리
     // 스택이 비었을 때
     public class EmptyIntStackException extends RuntimeException{
         public EmptyIntStackException(String message){
             System.out.println(message);
         }
     }

     // 스택 최대 인덱스 초과
    public class OverflowIntStackException extends RuntimeException{
         public OverflowIntStackException(String message){

         }
    }

    // 스택에 데이터 push
    public void push(int pushData){
         if(pointer >= maxSize) throw new OverflowIntStackException("스택이 가득찼습니다.");
         stk[pointer++] = pushData;
    }

    // 데이터 pop
    public int pop(){
       if(pointer == 0) throw new EmptyIntStackException("스택이 비었습니다.");

       return stk[--pointer];
    }

    // 데이터 peek
    public int peek(){
         if(pointer == 0) throw new EmptyIntStackException("스택이 비었습니다.");
         return stk[pointer -1];
    }

    // 스택에 입력값이 있는 인덱스 반환, 선형검색으로 top부터 bottom 방향으로 검색
    public int indextOf(int value){
         for(int i = pointer - 1; i >= 0; i--){
             if(stk[i] == value) return i;
         }
         return -1;
    }

    // 스택 값 초기화
    // 스택의 데이터 처리는 pointer 기반으로 이루어지므로 스택의 실체인 배열의 요소들을 건들일 필요는 없다.
    // pointer만 0 으로 초기화

    public void clear(){
         pointer = 0;
    }

    // 스택의 max값 확인
    public int capacity(){
         return maxSize;
    }

    // 스택에 쌓인 데이터 수 반환
    public int size(){
         return pointer;
    }

    // 스택이 비어있는지 확인
    public boolean isEmpty(){
         return pointer <= 0;
    }

    // 스택이 꽉찼는지 획인
    public boolean isFull(){
         return pointer >= maxSize;
    }

    // 스택에 들어간 모든 값들을 bottom부터 top 방향으로 출력
    public void dump(){

         if(pointer <= 0) System.out.println("스택이 비어있습니다.");
         else{
             for(int i = 0; i < pointer; i++){
                 System.out.println(stk[i]);
             }
         }
     }


}
