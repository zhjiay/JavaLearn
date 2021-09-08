package BaseAlgorithm;

/**
 * @author zhujiayuan
 * @version 2021-08-18-19:52
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr=new int[]{12,43,32,76,97,45,13,54,9,54,32};
        int temp;
        int num;
        for(int i=1;i<arr.length;i++){
            temp=i;
            for(int k=i-1;k>=0;k--){
                if(arr[k]>arr[temp]){
                    num=arr[k];
                    arr[k]=arr[temp];
                    arr[temp]=num;
                    temp--;
                }
            }
        }
        InsertSort.toPrint(arr);

    }
    public static void toPrint(int[] a){
        for(int i:a){
            System.out.println(i);
        }
    }
}
