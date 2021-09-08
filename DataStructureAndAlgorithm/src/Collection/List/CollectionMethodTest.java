package Collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author zhujiayuan
 * @version 2021-09-01-13:09
 */
public class CollectionMethodTest {
    public static void main(String[] args) {
        Collection<Object> coll =new ArrayList<Object>();
//        Iterator it= coll.iterator();
        System.out.println(coll.isEmpty());
        coll.add(123);
        coll.add(1234);
//        coll.add(new person("tom",99));
        System.out.println(coll.add(12345));
        System.out.println(coll.isEmpty());
        System.out.println(coll.size());
//        System.out.println(coll.hashCode());
//        for(Object o:coll){
//            System.out.println(o);
//        }
        Iterator it= coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class person{
    public String name;
    public int age;

    public person(){

    }
    public person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toSting(){
        return "name: "+this.name+"  age: "+this.age;
    }
}
