package Chapter2;

/**
 * @author zhujiayuan
 * @version 2021-08-22-19:37
 */
public class PolynomoalCircle {
    int coef;
    int power;
    PolynomoalCircle next;

    public PolynomoalCircle(){
        this.next=null;
    }
    public PolynomoalCircle(int coef,int power){
        this.coef=coef;
        this.power=power;
        this.next=this;
    }

    public void append(PolynomoalCircle p){
        p.next=this;
        PolynomoalCircle pol=new PolynomoalCircle();
        pol.next=this;
        while ((pol.next.next!=this)){
            pol.next=pol.next.next;
        }
        pol.next.next=p;
    }
    public void toPrint(){
        PolynomoalCircle temp=new PolynomoalCircle();
        temp.next=this;
        while (temp.next.next!=this){
            System.out.print(temp.next.coef+"x^"+temp.next.power+" + ");
            temp.next=temp.next.next;
        }
        System.out.println(temp.next.coef+"x^"+temp.next.power);
    }

}
