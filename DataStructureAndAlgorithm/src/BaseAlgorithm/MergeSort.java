package BaseAlgorithm;

/**归并排序
 * @author zhujiayuan
 * @version 2021-08-18-16:51
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,3,5,7,9};
        int[] arr2=new int[]{2,4,6,8,};

        int[] arr=MergeSort.arrSort(arr1,new int[0]);
        for (int i:arr
             ) {
            System.out.print(i+"\t");
        }
        System.out.println();
        int[] arrSort=new int[]{13,54,76,24,67,43,12,43,78,58,89};
        System.out.println(MergeSort.count2(arrSort.length));
        int[] arrSortNew=new int[(int) Math.pow(2,MergeSort.count2(arrSort.length))];

        for (int i=0;i<arrSortNew.length;i++){
            if(i<arrSort.length){
                arrSortNew[i]=arrSort[i];
            }else{
                arrSortNew[i]=99;
            }
        }
        int[] a;
        int[] b;
        int iPow=0;
        MergeSort.toPrint(arrSortNew);
        for(int i=1;i<MergeSort.count2(arrSort.length);i++){
            a=new int[i];
            b=new int[i];
            iPow=(int) Math.pow(2,i);
            for(int k=0;k*i<16;k+=iPow){
                for(int j=0;j<iPow;i++){
                    a[j]=arrSortNew[k+j];
                    b[j]=arrSortNew[k+iPow+j];
                }
                a=MergeSort.arrSort(a,b);
                for(int j=0;j<2*iPow;j++){
                    arrSortNew[k+j]=a[j];
                }
            }
        }
        MergeSort.toPrint(arrSortNew);
    }
    public static int[] arrCat(int[] a,int index,int count) throws ArrayIndexOutOfBoundsException{
        int[] tempArr=new int[count];
        for(int i=0;i<count;i++){
            tempArr[i]=a[index+i];
        }
        return tempArr;
    }
    public static int count2(int length){
        if(length==1){
            return 1;
        }else {
            return count2(length/2)+1;
        }
    }
    public static void toPrint(int[] a){
        for (int i:a){
            System.out.print(i+" ");
        }
    }
    public static int[] arrSort(int[] a,int[] b){   //将两个数组合并
        if(a.length==0) {
            return b;
        }
        if(b.length==0){
            return a;
        }
        int[] temp=new int[a.length+b.length];
        int aPoint=0;
        int bPoint=0;
         do {
            if (a[aPoint] <= b[bPoint]) {
                temp[aPoint + bPoint] = a[aPoint];
                aPoint++;
            } else {
                temp[aPoint + bPoint] = b[bPoint];
                bPoint++;
            }
        }while(aPoint<a.length&bPoint<b.length);//出循环时至少有一个数组达到尽头
        if(aPoint==a.length){
            while (bPoint<b.length){
                temp[aPoint+bPoint]=b[bPoint];
                bPoint++;
            }
        }else {
            while (aPoint<a.length){
                temp[aPoint+bPoint]=a[aPoint];
                aPoint++;
            }
        }

        return temp;
    }


}


