package Chapter3;

/**
 * @author zhujiayuan
 * @version 2021-08-22-20:03
 */
public class Sqrt {
    public static void main(String[] args) {
        double a=12.32;
        double e=0.01;
        double p=1;
        while ((a-p*p)>=e | (a-p*p)<-e){
            p=(p+a/p)/2;
        }
        System.out.println(p);
    }
}
