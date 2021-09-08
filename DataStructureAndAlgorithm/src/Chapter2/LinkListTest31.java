package Chapter2;

/**
 * @author zhujiayuan
 * @version 2021-08-22-13:06
 */
public class LinkListTest31 {
    public static void main(String[] args) {
        CircleLinkList cl=new CircleLinkList(1);

        for(int i=1;i<4;i++){
            cl.append(new CircleLinkList(2*i+1));
        }
        var clt=new CircleLinkList(8);
        cl.append(clt);
        for (int i=4;i<8;i++){
            cl.append(new CircleLinkList(2*i+1));
        }
        CircleLinkList temp=new CircleLinkList();
        temp.next=cl;
        while (temp.next.next!=clt){
            temp.next=temp.next.next;
        }
        temp.next.next=clt.next;
        cl.toPrint();
    }
}
