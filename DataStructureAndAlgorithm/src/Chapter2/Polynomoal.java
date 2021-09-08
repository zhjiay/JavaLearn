package Chapter2;

/**
 * @author zhujiayuan
 * @version 2021-08-21-19:22
 */
public class Polynomoal {
    int coefficient;    //系数，不能=0
    int power;          //幂
    Polynomoal next;

    public Polynomoal(){
        this.next=null;
    }
    public Polynomoal(int coefficient,int power){
        this.coefficient=coefficient;
        this.power=power;
        this.next=null;
    }
    //添加方法不用写，因为没有必要，可以看出两个一元多项式之和

    public void add(Polynomoal pol){  //两个一元多项式相加，
        if(this.next==null){
            this.next=pol.next;
        }else {
            if (pol.next != null) {
                Polynomoal temp;
                if (pol.next.power < this.next.power) {
                    temp = new Polynomoal(pol.next.coefficient, pol.next.power);
                    temp.next = this.next;
                    this.next = temp;
                    pol.next = pol.next.next;
                } else if (pol.next.power == this.next.power) {
                    this.next.coefficient += pol.next.coefficient;
                    if (this.next.coefficient == 0) {
                        this.next = this.next.next;
                    }
                    pol.next = pol.next.next;
                }
                this.next.add(pol);
            }
        }
    }
    public void delete(Polynomoal pol){ //两个一元多项式相减
        this.negative(pol);
        this.add(pol);
    }
    public void multiply(Polynomoal pol){
        Polynomoal temp=new Polynomoal();   //pol分解项
        Polynomoal tempThis=new Polynomoal();   //临时和
        Polynomoal copyThis=new Polynomoal();
        while(pol.next!=null){
            copyThis =this.copy();
            temp.next=new Polynomoal(pol.next.coefficient,pol.next.power);
            copyThis.multiply1(temp);
            tempThis.add(copyThis);
        }
        this.next=tempThis.next;
    }
    private void multiply1(Polynomoal pol){     //只乘一项
        if(this.next!=null){
            this.next.coefficient*=pol.next.coefficient;
            this.next.power+=pol.next.power;
            this.next.multiply1(pol);
        }
    }
    private void negative(Polynomoal pol){
        if(pol.next!=null){
            pol.next.coefficient=-pol.next.coefficient;
            this.negative(pol.next);
        }
    }
    private Polynomoal copy(){
        Polynomoal tempThis=this;
        Polynomoal temp=new Polynomoal();
        Polynomoal tempTemp=temp;
        while(tempThis.next!=null){
            tempTemp.next=new Polynomoal(tempThis.next.coefficient,tempThis.next.power);
            tempTemp=tempTemp.next;
            tempThis=tempThis.next;
        }
        return temp;
    }
    public int length(){
        if(this.next==null){
            return 0;
        }else {
            return this.next.length()+1;
        }
    }
    public void toPrint(){
        if(this.next!=null){
            System.out.print(this.next.coefficient+"x^"+this.next.power+" + ");
            this.next.toPrint();
        }
    }
    public void addOne(int coefficient,int power){
        if(this.next==null){
            this.next=new Polynomoal(coefficient,power);
        }else {
            this.next.addOne(coefficient,power);
        }
    }

}
