package List;

/**
 * @author zhujiayuan
 * @version 2021-08-16-13:57
 */
public abstract class LinearList {
    Object elem;
    Object[] arrayRE;
    //数据结构的元素

    public LinearList(){

    }

//    public static Object[] InitList(){
//        Object[] arrayRE=new Object[0];
//        return arrayRE;
//    }//构造一个空的列表
    public abstract void DestroyList();//摧毁一个列表
    public abstract void CleanList();   //重置为0
    public abstract Boolean ListIsEmpty();      //判断是否为空
    public abstract int ListLength();           //长度
    public abstract Object getElem(int index);           //index 的元素
    public abstract int LocateElem(Object elem);                   //定位元素职位
    public abstract Object PriorElem(Object elem);                     //前一个元素
    public abstract Object NextElem(Object elem);          //后一个元素
    public abstract void ListInsert(int index,Object elem);//        //插入元素
    public abstract void ListDelete(Object elem);//删除元素
    public abstract void ListTraverse();//遍历列表
    public abstract void ListAdd(Object elem);//末尾添加

}



