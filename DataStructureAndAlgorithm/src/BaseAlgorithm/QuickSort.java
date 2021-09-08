package BaseAlgorithm;

import java.util.ArrayList;

/**快速排序
 * @author zhujiayuan
 * @version 2021-08-18-19:48
 */
public class QuickSort {
    public static void main(String[] args) {
        QuickSort q=new QuickSort();
        int[] arr=new int[]{13,11,24,23,32,12,54,23,9,1};
        q.QSort(arr,0,arr.length-1);
        q.toPrint(arr);




    }
    public void QSort(int[] arr,int low,int high){
            int t=this.sort(arr,low,high);
            if(t>low){
                this.QSort(arr, low, t-1);
            }
            if(t<high){
                this.QSort(arr,t+1,high);
            }


    }
    private int sort(int[] arr,int low,int high){
        int temp=arr[(int) (low+high)/2];
        int t;
        int l=low;
        int h=high;
        while(l<h){
            while (arr[h]>=temp){
                h--;
            }
            while (arr[l]<=temp) {
                l++;
            }
            t=arr[h];
            arr[h]=arr[l];
            arr[l]=t;
        }
        arr[l]=temp;
        return l;
    }
    public void toPrint(int[] ar){
        for (int i:ar){
            System.out.print(i+" ");
        }

    }
}
