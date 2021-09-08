package Chapter123;

import java.util.Arrays;

/**
 * 数组的声明和初始化：=左边：   Class[] object ; Class object[];两种
 *                  =右边:    new Class[number] ; new Class[] 之后再初始化，此时是null  ;   new Class[]{} 这样就已经确定了;
 *
 *多维数组，可以看出一维数组的合成:声明   Class[][] object    ;   Class[] object[]; Class object[][];
 *                           右边于此类似;
 *       int[][] arr=new int[4][3];可以看成右边是左边的元素，即这是一个四个元素的数组，其中每个元素是有三个元素的数组
 *
 *       int[][] arr=new int[num][];先确定行数，每一行的列数稍后自行确定
 *
 * 数组的初始化默认值，基本数据类型有初始化 0;false  引用数据类型没有
 *
 * 数组方法:
 *      static String toString(xxx[] a):输出xxx类型数组的元素字符串
 *      static xxx[] copyOf(xxx[] a,int start,int end);
 *      static void sort(xxx[] a);
 *      static int binarySearch(xxx[] a,xxx v);二分查找
 *      static int binarySearch(xxx[] a,int start,int end,xxx v);
 *      static void fill(xxx[] a, xxx v);
 *      static boolean equals(xxx[]a,xxx[]b);
 *
 * @author zhujiayuan
 * @version 2021-08-10-19:57
 */
public class Array {
    public static void main(String[] args) {
        int[][] arr=new int[4][3];
        System.out.println(Arrays.toString(arr));//静态方法可以通过类名直接调用
        for(int[] i:arr){
            for (int j:i
                 ) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }

}
