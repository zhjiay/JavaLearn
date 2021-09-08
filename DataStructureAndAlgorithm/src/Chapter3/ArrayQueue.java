package Chapter3;

/**循环队列
 * @author zhujiayuan
 * @version 2021-08-21-21:36
 */
public class ArrayQueue {
    private int[] arr=new int[100];
    int front;  //队头指向前一个元素标，
    int rear;

    public ArrayQueue(){
        front=-1;
        rear=-1;
    }
    public void destory(){
        front=-1;
        rear=-1;
    }
    public void clean(){
        rear=front;
    }
    public boolean isEmpty(){
        return rear==front;
    }
    public boolean isFull(){
        return rear-front==100;
    }
    public int length(){
        return rear-front;
    }
    public int getHead(){
        int temp=front%100;
        return this.arr[temp+1];
    }
    public void enQueue(int num){
        if(!isFull()){
            rear++;
            int temp=rear%100;
            arr[temp]=num;
        }else {
            System.out.println("队列已满");
        }
    }
    public int deQueue(){
        if(!isEmpty()){
            front++;
            return arr[front%100];
        }else {
            return -1;
        }
    }
    public void toPrint(){
        int tempRear=rear%100;
        int tempFront=front%100;
        if(!isEmpty()){
            if(tempFront>=tempRear){
                for(int i=tempFront+1;i<100;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=tempRear;i++){
                    System.out.print(arr[i]+" ");
                }
            }else {
                for(int i=tempFront+1;i<=tempRear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
