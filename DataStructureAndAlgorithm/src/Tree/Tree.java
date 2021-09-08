package Tree;

/**树：
 *      树的分类：二叉树、三叉树、、、
 *      搜索树：
 *              平衡二叉树（AVL树)，叶子节点深度之不会超过1；红黑树是AVL的效率版本;弱平衡二叉树;
 *              B树：多叉树，根节点一个数据，其余两个数据，在非叶结点上也有数据；
 *              B+树：B树进一步，只在叶结点存储数据
 *              B*树，兄弟节点指针关联
 *
 *      算法：深度优先和广度优先
 *              深度优先更加方便实现，利用递归的思路，栈的数据结构
 *              广度优先就事利用队列的数据结构，每一层此的数据依次进入队列，然后
 *              全部进去之后就出队列，每出一个其子节点就进入到下一个队列中。
 * @author zhujiayuan
 * @version 2021-08-16-21:41
 */
public class Tree {
    public static void main(String[] args) {
        Node n=new Node(55);
        int[] arr=new int[]{17,34,65,37,12,87,45,32,56,76,55};
        for (int i:arr
             ) {
            n.Add(i);
        }
        n.toPrint();
        System.out.println("\n"+n.nodeCount());
        System.out.println(n.nodeDeep());
        int[][] arrParent=new int[n.nodeCount()][3];
        for(int i=0;i<arrParent.length;i++){
            arrParent[i][0]=i;
        }
        arrParent[0][1]=n.number;
        arrParent[0][2]=-1;

        Node t=new Node(0);
        //广度优先遍历  暂时放这里吧，实在是写出不
        //数据结构是工具主要是学习Java基础，现在先把集合看完
        //先把这棵树的节点按照层次放到数组里
        Node[] nArr=new Node[n.nodeCount()];
        nArr[0]=n;
        for(int i=1;i<n.nodeCount();i++){

        }

    }
}


class Node{
    public int number;
    Node L;
    Node R;

    private Node(){

    }
    public Node(int number){
        this.number=number;
        this.L=null;
        this.R=null;
    }
    public void destory(){
        this.L=null;
        this.R=null;
        this.number=-1;
    }
    public void clear(){}
    public boolean isEmpty(){
        if(this.L==null &&this.R==null){
            return true;
        }else {
            return false;
        }
    }
    public int depth(){
        if(this.L.isEmpty()&&this.R.isEmpty()){
            return 1;
        }else {
            if(this.L.depth()>=this.R.depth()){
                return this.L.depth()+1;
            }else {
                return this.R.depth()+1;
            }
        }
    }
    public Node root(Node node){
        return node;
    }
    public int value(Node node){
        return  -1;
    }
    public void Add(int number){
        if(number<=this.number){
            if(this.L==null){
                this.L=new Node(number);
            }else {
                this.L.Add(number);
            }
        }else {
            if(this.R==null){
                this.R=new Node(number);
            }else {
                this.R.Add(number);
            }
        }
    }//二叉树的添加

    public void toPrint(){  //先序遍历
        System.out.print(this.number+" ");
        if(this.L!=null){
            this.L.toPrint();
        }
        if(this.R!=null){
            this.R.toPrint();
        }
    }
    public int nodeCount(){ //节点计数
        int temp=1;
        if(this.L!=null){
            temp+=this.L.nodeCount();
        }
        if(this.R!=null){
            temp+=this.R.nodeCount();
        }
        return temp;
    }
    public int nodeDeep(){      //求深度 也是深度优先的一种体现
        int lNum=0,rNum=0;
        if(this.L!=null){
            lNum=this.L.nodeDeep();
        }
        if(this.R!=null){
            rNum=this.R.nodeDeep();
        }
        return lNum>rNum?lNum:rNum +1;
    }
}