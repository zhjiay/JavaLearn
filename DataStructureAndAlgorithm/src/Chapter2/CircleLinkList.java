package Chapter2;

/**
 * @author zhujiayuan
 * @version 2021-08-21-18:38
 */
public class CircleLinkList{
    int value;
    CircleLinkList next;
    public CircleLinkList(){
        this.next=null;
    }
    public CircleLinkList(int value){
        this.value=value;
        this.next=this;
    }

    public void append(CircleLinkList cnode){   //循环列表末尾加
        cnode.next=this;
        CircleLinkList cle=new CircleLinkList();
        cle.next=this;
        while (cle.next.next != this){
            cle.next=cle.next.next;
        }
        cle.next.next=cnode;
    }
    public void toPrint(){                  //打印无头结点的循环列表
        CircleLinkList temp=new CircleLinkList();
        temp.next=this;
        while (temp.next.next!=this){
            System.out.print(temp.next.value+" ");
            temp.next=temp.next.next;
        }
        System.out.println(temp.next.value);
    }
}
