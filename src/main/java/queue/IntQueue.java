package queue;

public class IntQueue {
    private int maxSize;
    private int num;
    private int[] queue;


    public IntQueue(int maxSize){
        try{
            this.maxSize = maxSize;
            num = 0;
            queue = new int[maxSize];
        }catch(OutOfMemoryError e){
            System.out.println("큐를 생성할 수 없습니다.");
        }
    }

    public class QueueOverflowException extends RuntimeException{
        public QueueOverflowException(){}
    }

    public class EmptyQueueException extends RuntimeException{
        public EmptyQueueException(){}
    }

    public void enQueue(int inputData){
        if(num >= maxSize) throw new QueueOverflowException();
        else{
            queue[num++] = inputData;
        }

    }

    public int deQueue(){
        int dequeueValue;
        if(num <= 0) throw new EmptyQueueException();
        else{
            dequeueValue = queue[0];
            num--;
            // 재정렬
            for(int i = 0; i < num; i++){
                queue[i] = queue[i+1];
            }
        }

        return dequeueValue;
    }

    public void dump(){
        for(int i = 0; i < num; i++){
            System.out.println(queue[i]);
        }
    }

}
