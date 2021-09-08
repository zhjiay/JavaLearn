package Chapter2;

/**
 * @author zhujiayuan
 * @version 2021-08-21-16:37
 */
public class ArrayListTest {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] arr1=new int[]{1,3,5,7,9,11,13};
        int[] arr2=new int[]{1,2,3,4,5,11,13};
        ArrayList list=new ArrayList(arr);
        ArrayList list1=new ArrayList(arr1);
        ArrayList list2=new ArrayList(arr2);
        int i=0;
        while (i<list.length()){
            if(list1.locateElem(list.getElem(i))!=-1&&list2.locateElem(list.getElem(i))!=-1){
                System.out.println(list.delete(i));
            }else {
                i++;
            }

        }
        list.toPrint();


    }
}
