package LeetCode;

/**
 * @author zhujiayuan
 * @version 2021-09-04-16:58
 */
public class SortTest {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0) {
            for (int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
        }else if(n==0){

        }
        else {
            int temp;
            for (int i = 0; i < n; i++) {
                temp = nums2[i];
                int k = m + i;
                while (k > 0&&temp < nums1[k - 1] ) {
                    nums1[k] = nums1[k - 1];
                    k--;
                }
                nums1[k] = temp;
            }
        }
    }
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[m+n];
        int i=0;
        int j=0;
        while (i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr[i+j]=nums1[i];
                i++;
            }else {
                arr[i+j]=nums2[j];
                j++;
            }
        }
        if(i==m){
            for(int k=j;k<n;k++){
                arr[m+k]=nums2[k];
            }
        }else {
            for(int k=i;k<m;k++){
                arr[n+k]=nums1[k];
            }
        }
        for(int k=0;k<n+m;k++){
            nums1[k]=arr[k];
        }
    }
}
