package Chapter123;

/**关于Java语言的一些基础新的知识：
 *      Java是一门强面向对象的语言，所谓面向对象就是专注于处理的事件，而不是如何去处理这件事。将一类时间抽象为class类，然后在通过实例化来
 *      解决这件事。在class类中都已经定义了该类对象能够使用的方法和属性。
 *
 *      Java的基础知识；jdk>jre>jvm三者是包含关系的
 *
 *      分布式和网络编程等留一个标记即可
 *
 * @author zhujiayuan
 * @version 2021-08-10-18:47
 */
public class Essential {
    public static void main(String[] args){
        System.out.println("helloworld!");

        Essential e=new Essential();
        String str[]=new String[]{"zhujiayuan"};
        e.main(str);        //这里是可以这样调用的，但是问题在于是一个无限循环调用。
    }
}

/*
    从main函数入手，这其实也是一个类，Java程序运行的入口就是main函数，里面定义了一个静态void方法,String[] args是一个字符串数组参数，一般没用
    main是一个方法，所以意味着也可以被对象调用
 */

/*
    java的基础语法，注释三种，其中单行注释// 换行注释 为此
    文档注释，文档注释会参与编译过程，目前已知是文档注释内的包注释、方法注释等要包括在此类，不过@开头可以写出去？
    文档注释内部的语句也会参与编译，也有可能报错，比如说一些转义符
 */