package Chapter7Exception;

/**一个人很难时刻警醒自己，我只能不断地不断地提醒不然不要再反过去的错误了
 * 异常类层次：Throwable:
 *                      Error:          非检查型错误
 *                              Java虚拟机无法解决的错误，比如栈溢出；
 *                      Exception:
 *                          RuntimeException://往往是编译错误，     非检查型错误
 *                          IOException://文件不存在或者格式等错误；  检查型错误
 *
 *  除了Error和RuntimeException是非检查异常
 *  检查型异常就是编译时可以发现的，通不过编译，非检查型要运行才能出现
 *
 * @author zhujiayuan
 * @version 2021-08-15-14:18
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3};
        try {
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.getMessage();
            System.out.println("出现异常");
        }
    }
}
