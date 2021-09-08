package Chapter4;

import java.util.Locale;

/**Class String:
 *      field :  final char[] value; 常量字符数组，不能改。可以新早
 *
 *      constructor :   String a="****"  直接赋值法      在字符串常量池中
 *                      String b=new String(char[] a); new 的结构都在堆空间中；
 *                      a中是字符串常量池中的地址，b是堆空间的地址。b指向堆空间某一处，这一处指向字符串常量池 new创建了两个地址
 *
 *      String拼接：   String.intern();返回一个常量池的地址；
 *                      常量与常量拼接在常量池中，拼接中只要有变量参与那就在堆空间中。
 *
 *      StringBuffer:线性安全但是效率低
 *      StringBuilder：线性不安全但是效率高；
 * @author zhujiayuan
 * @version 2021-08-22-21:23
 */
public class StringTest {
    public static void main(String[] args) {
        String s="I AM A STUDENT";
        String t=" STU";
        StringTest test=new StringTest();

        System.out.println(test.indexOf(s,t));
    }
    public String reS(String s){//4.10
        String t="";
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            t=c+t;
        }
        return t;
    }
    public String indexST(String s,String t){
        char c;
        String temp="";
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(t.indexOf(c)!=-1){
                temp=temp+c;
            }
        }
        return temp;
    }
    public String replace(String s,String sub,String t){
        String temp="";
        int a=s.indexOf(sub);
        int b=sub.length();
        while (a!=-1){
            temp=s.substring(0,a)+t+s.substring(a+b-1);
            a=s.indexOf(sub,a+1);
        }

        return temp;
    }

    public int indexOf(String s,String t){      //字符串匹配模式算法
        int j;
        int i=0;
        int temp=0;
        for(i=0;i<=s.length()-t.length();i++){
            j=0;
            while (s.charAt(i+j)==t.charAt(j)){
                if(j==t.length()-1){
                    temp=i;
                    break;
                }else {
                    j++;
                }
            }
        }
        return temp;
    }
    public int[] nextavl(String s){         //KMP算法，暂放；
        int[] temp=new int[s.length()];
        temp[0]=0;
        char[] arr=s.toCharArray();
        for (int i=1;i<s.length();i++){

        }
        return temp;
    }
}
