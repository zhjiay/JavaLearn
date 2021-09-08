package Exercise1;

/**
 * @author zhujiayuan
 * @version 2021-08-16-11:38
 */
public class Test {
}

abstract class Person{
    private int age;
    private String name;

    public Person(){

    }
    public Person(String name,int age){
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public abstract void toStr();
}

class Student extends Person{
    private String major;

    public void setMajor(String major) {
        this.major = major;
    }
    public String getMajor(){
        return this.major;
    }

    public void toStr(){
        System.out.println(super.getName()+super.getAge()+this.getMajor());
    }
}