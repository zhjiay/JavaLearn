package LeetCode;

import java.util.*;

/**
 * @author zhujiayuan
 * @version 2021-09-04-16:33
 */
public class TreeTest {
    public static void main(String[] args) {
        Deque<Character> qu=new ArrayDeque();
        qu.push('{');
        qu.push('[');
        System.out.println(qu.getLast().equals((Character) '['));
    }

    public int maxDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }else if(root.left==null &&root.right==null){
            return 1;
        }else {
            return Math.max(this.maxDepth(root.left),this.maxDepth(root.right))+1;
        }
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists=new ArrayList<>();

        int[][] num=new int[numRows][];
        num[0]=new int[1];
        num[0][0]=1;
        for(int i=1;i<numRows;i++){
            num[i]=new int[i+1];
            num[i][0]=1;
            num[i][i]=1;
            for (int j=1;j<i;j++){
                num[i][j]=num[i-1][j-1]+num[i-1][j];
            }
        }
        for (int i=0;i<numRows;i++){
            List<Integer> l1=new ArrayList<>();
            for(int j:num[i]){
                l1.add(j);
            }
            lists.add(l1);
        }
        return lists;
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return this.isSy(root.left,root.right);

    }
    private boolean isSy(TreeNode nodeL,TreeNode nodeR){
        if(nodeL==null&&nodeR==null){
            return true;
        }else if(nodeL==null&&nodeR!=null){
            return false;
        }else if(nodeL!=null&&nodeR==null){
            return false;
        }else {
            return nodeL.val==nodeR.val&&this.isSy(nodeL.left,nodeR.right)&&this.isSy(nodeL.right,nodeR.left);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listVal=new ArrayList<>();
        if (root==null)  return listVal;
        List<List<TreeNode>>  list=new ArrayList<>();
        List<TreeNode> l1=new ArrayList<>();
        l1.add(root);
        list.add(l1);
        int k=0;
        while (true){
            l1=new ArrayList<>();
            for(TreeNode treeNode:list.get(k)){
                if(treeNode.left!=null) l1.add(treeNode.left);
                if(treeNode.right!=null) l1.add(treeNode.right);
            }
            k++;
            if(l1.size()==0) break;
            list.add(l1);
        }

        for(int i=0;i<k;i++){
            List<Integer> l2=new ArrayList<>();
            for(TreeNode treeNode:list.get(i)){
                l2.add(treeNode.val);
            }
            listVal.add(l2);
        }
        return listVal;
    }

    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++){
            res=res<<1;
            res+=n&1;
            n=n>>1;
        }
        return res;
    }


    public int rob(int[] nums) {
        int l=nums.length;
        switch (l){
            case 1:return nums[0];
            case 2:return Math.max(nums[0],nums[1]);
        }
        int[] fit1=new int[l];
        int[] fit2=new int[l];
        fit1[0]=nums[0];
        fit1[1]=nums[1];
        int max=Math.max(nums[0],nums[1]);
        fit2[0]=nums[0];
        fit2[1]=max;
        for(int i=2;i<l;i++){
            fit1[i]=nums[i]+fit2[i-2];
            fit2[i]=Math.max(fit1[i-1],fit1[i]);
            max=Math.max(fit2[i],max);
        }
        return max;
    }
    public int maxSubArray(int[] num) {
        int length = num.length;
        int[] dp = new int[length];
        //边界条件
        dp[0] = num[0];
        int max = dp[0];
        for (int i = 1; i < length; i++) {
            //转移公式
            dp[i] = Math.max(dp[i - 1], 0) + num[i];
            //记录最大值
            max = Math.max(max, dp[i]);
        }
        return max;
    }
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int fit=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            fit=Math.max(fit,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return fit;
    }




    public int hammingWeight(int n) {
        int num;
        if(n>=0) num=n;
        else num=-(1+n);
        int k=0;
        while (num>1){
            if(num%2==1) {
                k++;
            }
            num=num/2;
        }
        if(num==1) k++;
        if(n>=0){
            return k;
        }else {
            return 32-k;
        }
    }

    public int hammingDistance(int x, int y) {
        int num=x^y;
        if(num==0) return 0;
        int k=1;
        while (num>1){
            if(num%2==1) {
                k++;
            }
            num=num/2;

        }
        return k;

    }
/*
    public int reverseBits(int n) {
        int num=0;
        int[] nums=new int[32];
        if(n>=0){
            int k=0;
            while (n>1){
                nums[k]=n%2;
                n=n/2;
                k++;
            }
            nums[k]=1;
            for(int i=1;i<32;i++){
                num=num*2+nums[i];
            }
            if(nums[0]==1){
                return 0-num;
            }else return num;
        }else {
            n=-(1+n);
            int k=0;
            while (n>1){
                nums[k]=n%2;
                n=n/2;
                k++;
            }
            nums[k]=1;
            for(int i=0;i<32;i++){
                nums[i]=1-nums[i];
            }
            for(int i=1;i<32;i++){
                num=num*2+nums[i];
            }
            if(nums[0]==1){
                return 0-num;
            }else return num;
        }
    }

    public boolean isValid(String s) {
        if(s==null||s.length()==0) return false;
        if(s.length()%2!=0) return false;
//        Deque<Character> qu=new ArrayDeque();
        char[] c=s.toCharArray();
        char[] c1=new char[c.length+2];
        c1[1]=c[0];
        int k=2;
        boolean b;
        for(int i=1;i<c.length;i++){
            if(c[i]=='{'||c[i]=='['||c[i]=='('){
                c1[k]=c[i];
                k++;
            }else {
                b=true;
                if(c[i]=='}'&&c1[k-1]=='{'){
                    k--;
                    b=false;
                }
                if(c[i]==']'&&c1[k-1]=='['){
                    k--;
                    b=false;
                }
                if(c[i]==')'&&c1[k-1]=='('){
                    k--;
                    b=false;
                }
                if(b){
                    c1[k]=c[i];
                    k++;
                }

            }
        }
        return k==1;
    }

    public int missingNumber(int[] nums) {
        int num=(int)nums.length*(nums.length+1)/2;
        for (int i=0;i<nums.length;i++){
            num-=nums[i];
        }
        return num;
    }

    /*
    public boolean isValidBST(TreeNode root) {
        String s=this.toStringTree(root);
        char[] c=s.toCharArray();
        if(c.length<=1){
            return true;
        }else {
            for(int i=0;i<c.length-1;i++){
                if(c[i]>=c[i+1]) return false;
            }
        }
        return true;
    }

    private String toStringTree(TreeNode root){
        if(root==null){
            return "";
        }else {
            return this.toStringTree(root.left)+root.val+this.toStringTree(root.right);
        }

    }

        if(root.left==null&&root.right==null){
            return true;
        } else if (root.right==null) {
            if(root.left.val<root.val) {
                return true;
            }else {
                return false;
            }
        }else if(root.left==null){
            if(root.val<root.right.val){
                return  true;
            }else {
                return false;
            }
        } else {
            return root.left.val< root.val&&root.val<root.right.val&&this.isValidBST(root.left)&&this.isValidBST(root.right);
        }

         */


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}