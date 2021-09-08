package Chapter3;

/**
 * @author zhujiayuan
 * @version 2021-08-21-21:27
 */
public class LinkStack {
    private int value;
    public LinkStack next;

    public LinkStack(int value){
        this.value=value;
        this.next=null;
    }
    public boolean isEmpty(){
        return this.next==null;
    }
    public int getTop(){
        if(this.next==null){
            return -1;
        }else if(this.next.next==null){
            return this.next.value;
        }else {
            return this.next.getTop();
        }
    }
    public void push(int value){
        if(this.next==null){
            this.next=new LinkStack(value);
        }else {
            this.next.push(value);
        }
    }
    public int pop(){
        if(this.next.next==null){
            int temp=this.next.value;
            this.next=null;
            return temp;
        }else {
            return this.next.pop();
        }
    }
    public void toPrint(){
        if(this.next.next==null){
            this.next.toPrint();
            System.out.print("  "+this.next.value);
        }
    }
}
