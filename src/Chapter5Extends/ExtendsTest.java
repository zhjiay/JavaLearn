package Chapter5Extends;

/**Java的继承，subClass extends superClass
 *      subClass 拥有 superClass 的全部属性和方法，其中@override重写方法（覆盖），但是private 的不会被继承？
 *          private不是不会继承，而是封装了，只有superClass才能直接调用，不过子类可以使用super.getMethod()来获取数据。不能直接调用，
 *      关于构造器，也可以直接继承，
 *
 * 继承最重要的是多态性，这个和类型转换相关联，所谓多态其实就是一个java类的向下兼容性，即一个父类变量只要可以被赋值于其子类的对象，只不过，由于父类
 *      的属性均被子类的属性所涵盖，所以可以屏蔽掉一些没用，不过这个可以解压出来（即展现其多态性）。一下作为测试。
 *      总结，多态性中父类有的，在子类中不会被屏蔽，如果重写了，那么就用重写的;父类中没有的，那就真没有，虽然看起来好像有。这是自动类型转换，
 *      强制类型提升。即 subClass object =(subClass) parameter;但是有一点，这个para至少也要是或者指向subClass，否则就会报错，毕竟不能缺失方法
 *
 *      a instanceof Class,判断a是不是Class类型，或者Class的子类的，即能兼容的类型
 *
 *
 *
 * Object类是所有类的父类，重写 toString();equal();等方法，
 * @author zhujiayuan
 * @version 2021-08-11-19:14
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Employee e=new Employee("tom",18,17000);
        Boss b=new Boss("tony",23,39000,"宝马");
        Man m=new Man("mike",22,12);
        Object o=e;
//        o.stringPrint();  原因在于o中没有这个方法，如果有的话，那么就会调用e中的这个方法
        e.stringPrint();
        b.stringPrint();
        m.stringPrint();
        System.out.println("*******************************");
        System.out.println(b instanceof Employee);

        Employee eTest=new Employee();
        eTest=e;
        Boss b1= (Boss) eTest;  //强制类型提升
        b1.stringPrint();
//        eTest.getCars()   这个是用不了的，等于说，多态性的时候，主要看指向的里面的方法，如果重写了就用重写的，如果父类中没有的那么就没有这个方法；
    }
}
//这是一个抽象类的测试，从这里可以看出，抽象类和普通类一样，普通类有的，它都有，但是不能实例化；同时多了abstract修饰的方法；
abstract class Person{
    private String name;
    private int age;

    public Person(){

    }
    public Person(String name,int age){
        this.setName(name);
        this.setAge(age);
    }

    public abstract void stringPrint();

    public void setName(String name){
        this.name=name;
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
}


class Employee extends Person{
    private int salary;

    public Employee(){

    }
    public Employee(String name,int age){
        super(name, age);
    }
    public Employee(String name,int age,int salary){
        this(name, age);
        this.setSalary(salary);
    }


    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return this.salary;
    }
    public void stringPrint(){
        System.out.println("姓名:"+this.getName()+"年龄:"+this.getAge()+"工资:"+this.getSalary());
    }

    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }else{
            return false;
        }
    }
}


final class Boss extends Employee{
    private String car;

    public Boss(){}
    public Boss(String name,int age,int salary,String car){
        super(name, age, salary);
        this.setCar(car);
    }
    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void stringPrint(){
        System.out.println("姓名:"+this.getName()+"年龄:"+this.getAge()+"工资:"+this.getSalary()+"车:"+this.getCar());
    }
}

final class Man extends Person{
    private int length;

    public Man(){}
    public Man(String name,int age,int length){
        super(name, age);
        this.setLength(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void stringPrint() {
        System.out.println("姓名:"+this.getName()+"年龄:"+this.getAge()+"长度:"+this.getLength());
    }
}