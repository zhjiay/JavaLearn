package Chapter2;

/** 习题第二章第40题
 * @author zhujiayuan
 * @version 2021-08-22-19:42
 */
public class PolynomoalCircleTest {
    public static void main(String[] args) {
        PolynomoalCircle p = new PolynomoalCircle(14, 0);
        p.append(new PolynomoalCircle(4, 2));
        p.append((new PolynomoalCircle(1, 5)));
        p.append((new PolynomoalCircle(2, 6)));
        p.toPrint();
        PolynomoalCircle temp=new PolynomoalCircle();
        temp.next=p;
        while (temp.next.next!=p){
            temp.next.coef=temp.next.coef*temp.next.power;
            temp.next.power--;
            temp.next=temp.next.next;
        }
        temp.next.coef=temp.next.coef*temp.next.power;
        temp.next.power--;
        if(temp.next.next.coef==0){
            temp.next.next=p.next;
        }
        p=temp.next.next;
        System.out.println();
        p.toPrint();
    }
}
