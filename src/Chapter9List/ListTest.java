package Chapter9List;

import java.util.ArrayList;

/**list集合：
 *      与数组的差异：     数组只能类型是确定好的，大小也是确定好的;当然也可以用Object类
 *
 * java集合分为 Collection和Map两种体系，这两个是接口；      主要是list和map
 *      Collection: 单列集合
 *              List:   有序可重复   “动态数组”      （线性列表）
 *                  ArrayList List接口的主要实现类  线程不安全  效率高  低层使用Object[]数组实现（数据结构中的顺序线性表
 *                  LinkedList      链表  低层使用双向链表存储；对于频繁插入和删除操作使用此类
 *                  Vector      古老实现类       线程安全 效率低    Object[]数组实现
 *              Set:无序不可重复      “集合”    set主体上和hash链接比较紧密
 *                  无序不等于随机性，并非按照数组那样有index的
 *                  不可重复：   先HashCode()再equals();两个方法要重写
 *                  HashSet         主要实现类   线程不安全  可以存储null值
 *                      LinkedHashSet   HashSet的子类  链表实现
 *                  TreeSet：要求同一个类，处于排序 状态
 *               ...:
 *       Map(映射):双列（键值对应）;
 *                  HashMap LinkedHashMap  TreeMap  HashTable Properties
 *
 *                  Map(接口):    Map key-value对的数
 *                          Hashtable:  古老实现类   基本上（包括子类）不怎么用了  线程安全
 *                              Properties: key value都是String类型，常用于配置文件
 *                          HashMap:    主要实现类   相比Hashtable  可以存储 null值，线程不安全。
 *                              LinkedHashMap:
 *                          SortedMap(接口)--TreeMap:
 *
 *
 * @author zhujiayuan
 * @version 2021-08-15-15:14
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList();
        arr.add(13);


    }
}














