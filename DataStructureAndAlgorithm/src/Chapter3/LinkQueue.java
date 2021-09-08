package Chapter3;

/**
 * @author zhujiayuan
 * @version 2021-08-21-21:57
 */
public class LinkQueue {
    private int value;
    LinkQueue next;

    public LinkQueue(){
        next=null;
    }
    public LinkQueue(int num){
        value=num;
        next=null;
    }
    public void destory(){
        this.next=null;
    }
    public void clean(){
        destory();
    }
    public boolean isEmpty(){
        return this.next==null;
    }
    public int length(){
        if(this.next==null){
            return 0;
        }else {
            return this.next.length()+1;
        }
    }
    public int getHead(){
        if(!isEmpty()){
            return this.next.value;
        }else {
            return -1;
        }
    }
    public void enQueue(int num){
        if(this.next==null){
            this.next=new LinkQueue(num);
        }else {
            this.next.enQueue(num);
        }
    }
    public int deQueue(){
        if(!isEmpty()){
            int temp=this.next.value;
            this.next=this.next.next;
            return temp;
        }else {
            return -1;
        }
    }
}
