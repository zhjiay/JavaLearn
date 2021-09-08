package Chapter3;

/**
 * @author zhujiayuan
 * @version 2021-08-21-21:02
 */
public class ArrayStack {
    private int[] value=new int[100];
    int top;
    int base;

    public ArrayStack(){
        this.top=-1;
        this.base=-1;
    }
    public void destory(){
        this.top=-1;
        this.base=-1;
    }
    public void clean(){
        this.top=this.base;
    }
    public boolean isEmpty(){
        return this.base==this.top;
    }
    public int length(){
        return this.top-this.base;
    }
    public int getTop(){
        if(!isEmpty()){
            return this.value[top];
        }else {
            return -1;
        }
    }
    public void push(int elem){
        if(this.top==99){
            System.out.println("栈最大");
        }else {
            this.top++;
            this.value[top]=elem;
        }
    }
    public int pop(){
        if(this.isEmpty()){
            System.out.println("栈空");
            return -1;
        }else {
            top--;
            return this.value[top+1];

        }
    }
    public void toPrint(){
        if(!this.isEmpty()) {
            for (int i = top; i >base; i--) {
                System.out.print(value[i]+" ");
            }
        }
        System.out.println();
    }

}
