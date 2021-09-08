package List;

/**
 * @author zhujiayuan
 * @version 2021-08-16-15:36
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayListRe l=ArrayListRe.InitList();

        System.out.println(l.ListIsEmpty());
        l.ListAdd(19);
//        l.ListTraverse();
//        System.out.println(l.ListIsEmpty());
        l.ListAdd(17);
        l.ListAdd(12);
        l.ListInsert(2,99);
        l.ListDelete(19);
        l.ListTraverse();
//        System.out.println(l.ListInsert(2,99));
        l.DestroyList();
        System.out.println(l.ListIsEmpty());
        int[] arr=new int[]{12,324,6543,56754,7654};

    }
}
//那么线性表应该算是达到要求了；
