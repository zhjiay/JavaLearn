package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/** 抽象基类：
 *      InputStream         File+       Buffer+
 *      OutputStream        File+
 *      Reader              File+
 *      Writer              File+
 *
 *      方法： read():返回读入的一个字符，文件末尾返回-1；
 * @author zhujiayuan
 * @version 2021-08-25-14:20
 */
public class FileTest {
    public static void main(String[] args) throws Exception {
//        File file=new File("C:\\java\\file.text");
//        System.out.println(file.getPath());
        File file =new File("file.txt");
        FileReader fileReader=new FileReader(file);
        System.out.println((char)fileReader.read());
        fileReader.close();
    }
}
