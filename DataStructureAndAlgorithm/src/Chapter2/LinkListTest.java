package Chapter2;

/**
 * @author zhujiayuan
 * @version 2021-08-21-18:43
 */
public class LinkListTest {
    public static void main(String[] args) {
        LinkList la=new LinkList();
        LinkList lb=new LinkList();
        LinkList lc=new LinkList();
        for(int i=0;i<13;i++){
            if(i%2==0){ //la中添加偶数
                la.append(new LinkList(i));
            }else{
                lb.append(new LinkList(i));
            }
        }
        la.toPrint();
        lb.toPrint();

        //将两个有序链表整合为一个有序链表
        LinkList laCon=la.next;
        LinkList lbCon=lb.next;
        while (laCon!=null &lbCon!=null){
            if(la.getCurElem(laCon)<=lb.getCurElem(lbCon)){
                lc.append(new LinkList(la.getCurElem(laCon)));
                laCon=laCon.next;
            }else {
                lc.append(new LinkList(lb.getCurElem(lbCon)));
                lbCon=lbCon.next;
            }
        }
        if(laCon==null){
            la.append(lbCon);
        }else {
            lc.append(laCon);
        }
        lc.toPrint();


    }
}
