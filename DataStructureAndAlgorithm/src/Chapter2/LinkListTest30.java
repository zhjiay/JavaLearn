package Chapter2;

/**
 * @author zhujiayuan
 * @version 2021-08-22-12:28
 */
public class LinkListTest30 {
    public static void main(String[] args) {
        LinkList la=new LinkList();
        LinkList lb=new LinkList();
        LinkList lc=new LinkList();
        int[] arr1=new int[]{1,2,3,4,5,6,7,8,9};
        int[] arr2=new int[]{1,3,5,7,9};
        int[] arr3=new int[]{3,4,5,6,7,8,10};
        for(int i:arr1){
            la.append(new LinkList(i));
        }
        for (int i:arr2){
            lb.append(new LinkList(i));
        }
        for (int i:arr3){
            lc.append(new LinkList(i));
        }
        LinkList ld=new LinkList();
        ld=la;
        while (ld.next!=null){
            if(lb.isElemIN(ld.next.value)&&lc.isElemIN(ld.next.value)){
                ld.next=ld.next.next;
            }else {
                ld=ld.next;
            }
        }

        la.toPrint();
        lb.toPrint();
        lc.toPrint();
    }
}
