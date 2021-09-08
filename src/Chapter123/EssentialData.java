package Chapter123;

/**Java基本数据类型，Java基本数据类型变量都是存储在栈中，STACK；一共有八种
 *      整数：byte short int long
 *          8bit 16 32 64   采用二进制补码存储   int范围大概是+20亿左右。
 *          一般使用int 就可以，long型数字后面要加L或l;
 *      浮点数：float double
 *              32bit 64,系统默认是double,如果是float数组，那么要加f；
 *      布尔：boolean 字符：char
 *          boolean 只有两个值，true false；0 1直接用来替换;char是16位,两个字节，一般用 u#### 四位十六进制的表示，
 *          char类型和unicode有一定的关联，char是UTF－１６的一个代码单员
 *
 *       数据转换，Java里有自动类型提升和强制类型，转换。自动类型提升指的是低到高的提升，如byte和int相计算，结果会自动转换为ｉｎｔ；
 *          自动类型转换，转换优先级 double>float>long>int; 一旦发生转换，至少要转换为Int，例如 byte和short计算，都会转换为int
 *       强制类型转换（ｉｎｔ）；可能会有损失。
 *
 *  Java的任何变量都要先定义后使用，不能直接使用。
 *      final修饰词定义常量；
 *
 *  Java运算符：
 *      几个常见的：　％取模，！＝　；　ａ＋＋和＋＋ａ，前者是先用ａ再把ａ＋＋（即谁在前面就限制性谁）；
 *      逻辑运算　　＆与　｜或　　　！非　　　　＆＆短路与　　｜｜短路非。区别在于，短路逻辑中只要是满足了条件，后面的就不会再判断了
 * @author zhujiayuan
 * @version 2021-08-10-18:59
 */
public class EssentialData {
    public static void main(String[] args) {
        byte b=12;
        short s=13;
        int i=14;
        long l=15l;

        char c=123;
        System.out.println(c);

        getType((short)(b+s));  //这里等于将结果强转为short
        getType(c+b);

    }

    public static void getType(Object o){
        System.out.println(o.getClass().toString());
    }
}
