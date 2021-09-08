package Chapter3;

/**
 * @author zhujiayuan
 * @version 2021-08-21-22:05
 */
public class StackTest {
    public static void main(String[] args) {
        ArrayStack arr=new ArrayStack();    //转换为2进制;
        int num=123;
        int a;
        int b;
        do{
            b=num%2;
            arr.push(b);
            num=(int)num/2;
        }while (num!=1);
        arr.push(num);
        arr.toPrint();
    }
}
