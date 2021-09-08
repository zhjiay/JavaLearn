package Chapter2;

/**对应第17、18、19三题
 * @author zhujiayuan
 * @version 2021-08-19-21:01
 */
public class Exer17 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] arr1=new int[]{1,2,3,4,5,6,7,8};
        int temp;
        Node n=new Node(0);
        Node n1=new Node(0);
        for (int i:arr
             ) {
            n.add(i);
        }
        n.toPrint();
        System.out.println();
//        Node.insert(n,3,99);
//        Node.delete(n,1);
//        Node.deleteMinMax(n,4,8);
//        n.toPrint();
        /*第21题
        for(int i=0;2*i<arr.length;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for (int i:arr
             ) {
            System.out.println(i);
        }
        */
        System.out.println(n.length());

        if(n1.length()>n.length()){

        }



    }
}
//class HeadNode{
//    private int value;
//    public Node next;
//
//    public HeadNode(){
//        this.next=null;
//    }
//
//
//}
class Node{
    public int value;
    public Node next;

    public Node(int value){
        this.value=value;
        this.next=null;
    }

    public void add(int value){
        if(this.next==null){
            this.next=new Node(value);
        }else{
            this.next.add(value);
        }
    }

    public static void insert(Node node,int i,int value){//这是无头节点的，有头节点的就不用考虑i=2;
        if(i==1){
            Node temp=new Node(value);
            temp.next=node;
            node=temp;
        }else if(i==2){
            Node temp=new Node(value);
            temp.next=node.next;
            node.next=temp;
        }else {
            insert(node.next,i-1,value);
        }
    }//exer17
    public static void delete(Node node,int i){
        if(i==1){
            node.value=node.next.value;
            node.next=node.next.next;
        }else if(i==2){
            node.next=node.next.next;
        }else {
            delete(node.next,i-1);
        }
    }//exer18
    public static void deleteMinMax(Node node,int min,int max){
        if(node.next.value<min){    //递归得到min序列，暂时不考虑空指针异常
            node.next=node.next.next;
            deleteMinMax(node,min,max);
        }else {
            if(node.next.value>max){
                node.next=null;
            }else {
                deleteMinMax(node.next,min,max);
            }
        }
    }//exer19

    public static void reNode(Node node){
        if(node.next.next==null){
            node.next=node.next.next;
        }else {
            reNode(node);   //头节点定位到最后一个

        }
    }
//    public static void reNode1(Node node){
//        if(node.next=)
//    }
    public static void addLink(Node a,Node b,Node c){
        if(a.next==null){
            c.next=b.next;
        }else if(b.next==null){
            c.next=a.next;
        }else {
            c.next=a.next;
            c.next.next=b.next;
            addLink(a.next,b.next,c.next.next);

        }
    }

    public void toPrint(){
        System.out.print(this.value+" ");
        if(this.next!=null){
            this.next.toPrint();
        }
    }
    public int length(){
        if(this.next==null){
            return 1;
        }else {
            return this.next.length()+1;
        }
    }

}
