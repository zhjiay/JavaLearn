package Chapter123;

import java.util.Scanner;

/**Java的控制结构有三种：顺序结构、选择结构、循环结构；
 *  选择结构：if else    swith case break等
 *
 *
 *      循环结构：for()"for(each : array)也是"  while() do{}while();
 * @author zhujiayuan
 * @version 2021-08-10-19:43
 */
public class Control {
    public static void main(String[] args) {
        //选择结构：
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();

        if(a%2==0){
            System.out.println(a+"这是偶数");
        }else{
            System.out.println(a+"这是奇数");
        }
        switch (a%2){
            case 1:System.out.println(a+"这奇数");break;
            case 0:
                System.out.println(a+"这是偶数");
                break;
        }


    }
}
