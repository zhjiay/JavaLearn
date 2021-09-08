package Chapter6Interface;

/**interface:   静态常量：public static final ; 这些总是省略的，
 *              抽象方法：public abstract ; 这些也是省略的，后面写一个方法名就好了，void method();实现的时候也要是public
 *              具体方法，也是public，就和abstract class一样；
 *
 *      接口之间也可以继承，和类一样，
 *
 * 接口这里的知识点也就这些，主要是会使用接口，其实主要是在实践中学。
 * 内部类和lambda表达式，之后遇到再学吧。
 * @author zhujiayuan
 * @version 2021-08-12-10:25
 */
public class InterfaceTest {
    public static void main(String[] args) {
        num n=new num(12,13);
        System.out.println(n.addNum());
    }
}

interface Add {
    int baseNum = 10;

    int addNum();

}

class num implements Add{
    int a;
    int b;
    public num(){

    }
    public num(int a ,int b){
        this.a=a;
        this.b=b;
    }
    public int addNum(){
        return baseNum+a+b;
    }
}

