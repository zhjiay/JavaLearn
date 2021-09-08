package LinkedList;

/**
 * @author zhujiayuan
 * @version 2021-08-16-16:10
 */
public class List{
    public static void main(String[] args) {
        Node n=Node.InitList();
        System.out.println(n.ListIsEmpty());
        n.ListAdd(123);
        n.ListAdd(234);
        n.ListAdd(543);
        n.ListAdd(789);
        System.out.println(n.ListIsEmpty());
        n.ListTraverse();
        System.out.println(n.ListLength());
        try{
            System.out.println(n.LocateElem(543));
        }catch (NullPointerException e){
            System.out.println("发现异常");
        }

    }
}

class Node implements ListInterface{
    Object num;
    Node next;
    private Node() {
        this.next=null;
    }
    private Node(Object elem){
        this.num=elem;
        this.next=null;
    }
    public static Node InitList(){
        return new Node();
    }
    public void DestroyList(){
        this.next=null;
    }
    public void CleanList(){
        if(!this.ListIsEmpty()){
            this.next.num=0;
            this.next.CleanList();
        }
    }
    public Boolean ListIsEmpty(){
        return this.next==null;
    }
    public int ListLength(){
        if(this.ListIsEmpty()){
            return 0;
        }else {
            return this.next.ListLength()+1;
        }
    }
    public Object getElem(int index){
        if(index==0){
            return this.next.num;
        }else {
            return this.next.getElem(index-1);
        }
    }
    public int LocateElem(Object Elem){
        if(this.next.num==Elem){
            return 0;
        }else{
            return this.next.LocateElem(Elem)+1;
        }
    }
    public void ListAdd(Object Elem){
        if(this.ListIsEmpty()){
            this.next=new Node(Elem);
        }else {
            this.next.ListAdd(Elem);
        }
    }
    public void ListTraverse(){
        if(!this.ListIsEmpty()){
            System.out.print(this.next.num+"\t");
            this.next.ListTraverse();
        }
        System.out.println();
    }
    public void ListDelete(Object elem){
        if(this.next.num==elem){
            Node temp=this.next.next;
            this.next=temp;
        }else {
            this.next.ListDelete(elem);
        }
    }
    public void ListInsert(int index,Object elem){
        if(index==0){
            Node temp=new Node(elem);
            temp.next=this.next;
            this.next=temp;
        }else{
            this.next.ListInsert(index-1,elem);
        }
    }
    public Object NextElem(Object elem){
        if(this.next.num==elem && this.next.next!=null){
            return this.next.next.num;
        }else{
            return this.next.NextElem(elem);
        }
    }
    public Object PriorElem(Object elem){
        return this.next.PriorElemPri(elem);
    }
    private Object PriorElemPri(Object elem){
        if(this.next.num==null){
            return this.num;
        }else {
            return this.next.PriorElemPri(elem);
        }
    }
}

interface ListInterface {
    public abstract void DestroyList();//摧毁一个列表

    public abstract void CleanList();   //重置为0

    public abstract Boolean ListIsEmpty();      //判断是否为空

    public abstract int ListLength();           //长度

    public abstract Object getElem(int index);           //index 的元素

    public abstract int LocateElem(Object elem);                   //定位元素职位

    public abstract Object PriorElem(Object elem);                     //前一个元素

    public abstract Object NextElem(Object elem);          //后一个元素

    public abstract void ListInsert(int index, Object elem);//        //插入元素

    public abstract void ListDelete(Object elem);//删除元素

    public abstract void ListTraverse();//遍历列表

    public abstract void ListAdd(Object elem);//末尾添加
}
