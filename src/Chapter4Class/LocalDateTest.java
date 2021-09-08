package Chapter4Class;

import java.awt.im.InputMethodRequests;
import java.util.Date;

/**关于时间有两个类 Date(util和sql)、 LocalDate、calendar;
 *      Data:   构造器Data();Data(毫秒数);
 *              方法：toString();getTime()返回毫秒数; 从1970；1；1；00；00；00开始计时
 *
 *      java.sql.Data:
 *
 *
 * @author zhujiayuan
 * @version 2021-08-10-21:30
 */
public class LocalDateTest {
    public static void main(String[] args) {
        long time= System.currentTimeMillis();
        System.out.println(time);

        Date date1=new Date();
        System.out.println(date1.toString());
    }
}
