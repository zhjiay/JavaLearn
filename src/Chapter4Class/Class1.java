package Chapter4Class;

/**面向对象class;
 *  class是面向对象的载体，也是Java面向对象的核心体现。不考虑extends和implements，classde内部成员有：
 *      field:属性
 *      constructor
 *      method;
 *      不怎么重要的 代码块 内部内
 *
 * 修饰符：
 *      class的权限修饰符     public > protected > "void" > private
 *                          public 一个工程中全部，自由访问
 *                          protected 同个包内，和不同包的子类
 *                          ”void“ 这个包内
 *                          private 这个类内部，就class页面
 *
 *      属性： 属性由权限修饰符+其余的修饰符+属性类型 +属性名+初始化等构成:
 *                          例如 public static final int a;
 *
 *      构造器：constructor  public.. className(parameter){}
 *          必须有一个空参的构造器
 *
 *       method：也是又权限修饰符+返回值类型 +方法名();
 *              递归之类的，调用啥的，
 *
 *        代码块、内部类 等...
 *
 *       static 修饰符，就是随着类加载而加载，直接类调用就好了，可以认为static修饰的属性、方法就是类方法
 *       final 修饰符，就是最终的，不能修改，也不能被继承或者重写啥的。
 *
 *class封装性，即用private修饰，只能再内部被调用，或者用其它的方法来调用修改。
 *
 *参数：   方法内的参数都是形参，但是基本数据类型是临时变量，而引用数据类型是地址值，引用数据类型是可以通过地址值访问修改到实际的参数
 *参数传递：     可以通过int ... a的形式
 *
 * class初始化：从属性开始，然后是代码块，之后就是构造器，一轮一轮的设置，
 *
 * 工厂方法：通过工厂方法构造对象， Class object=Class.factorymethod(); ???????????????????
 * 指针：  class next之类的，构造器构造就完了
 * @author zhujiayuan
 * @version 2021-08-10-20:34
 */
public class Class1 {
    public static void main(String[] args) {
        Employee em=new Employee("zhu",12);

        em.toStringEmployee();
        System.out.println(Employee.company);

    }
}

class Employee{
    private int age;
    private String name;
    public static final String company = "virtual university";

    {
        this.age=19;
        this.name="tony";
    }

    public Employee(){

    }
    public Employee(String name){
        this.setName(name);
    }
    public Employee(String name,int age){
        this(name);
        this.setAge(age);
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }

    public void toStringEmployee(){
        System.out.println(this.getName()+":\t"+this.getAge());
    }

    public void parameterTest(int a,int b,int...c){ //不推荐这种方式传递
        int sum;
        sum=a*b;

    }
}