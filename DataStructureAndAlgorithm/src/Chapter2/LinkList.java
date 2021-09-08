package Chapter2;

/**
 * @author zhujiayuan
 * @version 2021-08-21-16:59
 */
public class LinkList {
    int value;
    LinkList next;

    public LinkList(){      //无参构造器，表示头节点
        this.next=null;
    }
    public LinkList(int value){    //参构造器，表示链表只对外暴露头节点
        this.value=value;
        this.next=null;
    }

    public void destroy(){          //摧毁链表
        this.next=null;
    }
    public void clear(){            //清除链表，值置为0
        if(this.next!=null){
            this.next.value=0;
            this.next.clear();
        }
    }
    public void insFirst(LinkList node){ //将node置为第一个节点，头节点是第0个节点
        if(this.next==null){
            this.next=node;
        }else {
            node.next=this.next;
            this.next=node;
        }
    }
    public LinkList delFirst(){     //删除第一个节点，并返回删除的节点
        LinkList temp;
        if(this.next==null){
            temp=null;
        }else {
            temp=this.next;
            this.next=temp.next;
        }
        return temp;
    }
    public void append(LinkList node){  //在尾部链接上新的节点    理解为末尾加
        if(this.next==null){
            this.next=node;
        }else {
            this.next.append(node);
        }
    }
    public LinkList remove(){           //删除最后一个节点， 并返回该节点，末尾
        LinkList temp;
        if(this.next==null){
            temp=null;
        }else if(this.next.next==null){
            temp=this.next;
            this.next=null;
        }else {
            temp=this.next.remove();
        }
        return temp;
    }
    public LinkList getLast(){  //得到最后一个节点
        LinkList temp;
        if(this.next==null){
            temp=this;
        }else {
            temp=this.next.getLast();
        }
        return temp;
    }
    public LinkList getNode(int index){     //获取第index个节点，头节点也算
        LinkList temp;
        if(index==0){
            temp=this;
        }else {
            temp=this.next.getNode(index-1);
        }
        return temp;
    }
    public void insBefore(LinkList node,LinkList insNode){   //insNode插入到node节点之前
        if(this.next==node){
            insNode.next=this.next;
            this.next=node;
        }else {
            this.next.insBefore(node,insNode);
        }
    }
    public void insAfter(LinkList node,LinkList insNode){   //insNode插入到node节点之后
        if(this==node){
            insNode.next=this.next;
            this.next=insNode;
        }else {
            this.next.insAfter(node,insNode);
        }
    }
    public void setCurElem(int value,LinkList node){//node替换掉value处的node
        if(this.next==node){
            this.next.value=value;
        }else {
            this.next.setCurElem(value,node);
        }
    }
    public int getCurElem(LinkList node){       //获取node节点处的数据
        if(this.next==node){
            return this.next.value;
        }else {
            return this.next.getCurElem(node);
        }
    }
    public boolean isEmpty(){           //判断是否为空
        return this.next==null;
    }
    public int length(){            //链表长度，不包括头节点
        if(this.isEmpty()){
            return 0;
        }else {
            return this.next.length()+1;
        }
    }
    public int getPositionHead(){       //头节点位置 0
        return 0;
    }
    public int getPositionLast(){       //尾节点位置
        return this.length();
    }
    public int getPositionPrior(LinkList node){     //node前一个节点的位置
        if(this==node){
            return -1;
        }else {
            return this.next.getPositionPrior(node)+1;
        }
    }
    public int getPositionNext(LinkList node){          //node 后一个节点的位置
        if(this==node){
            return 1;
        }else {
            return getPositionNext(node)+1;
        }
    }
    public int getPosition(LinkList node){          //返回node的位置
        if(this==node){
            return 0;
        }else {
            return this.next.getPosition(node)+1;
        }
    }
    public boolean isElemIN(int value){
        if(this.next==null){
            return false;
        }else if(this.next.value==value){
            return  true;
        }else {
            return this.next.isElemIN(value);
        }
    }
    public void toPrint(){
        this.toPrint1();
        System.out.println();
    }
    private void toPrint1(){      //从头节点的下一个节点开始
        if(!this.isEmpty()){
            System.out.print(this.next.value+" ");
            this.next.toPrint1();
        }
    }
}
