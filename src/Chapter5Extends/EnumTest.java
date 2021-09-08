package Chapter5Extends;

import java.util.Scanner;

/**
 * @author zhujiayuan
 * @version 2021-08-11-21:31
 */
public class EnumTest {
    public static void main(String[] args) {
        var s=Season.autumn;
        System.out.println(s.getName());

    }
}
enum SeasonNew{
    spring("春天","三月","气温合适"),
    summer("edfqw","wqeer","qwer");


    SeasonNew(String 春天, String 三月, String 气温合适) {

    }
}
//自定义枚举类
class Season{
    private final String seasonName;
    private final String Month;

    private Season(String seasonName,String Month){
        this.seasonName=seasonName;
        this.Month=Month;
    }

    public static Season spring=new Season("春天","April");
    public static Season summer=new Season("夏天","june");
    public static Season autumn=new Season("秋天","september");
    public static Season winter=new Season("冬天","November");

    public String getName(){
        return this.seasonName;
    }

    public String toString(){
        return this.seasonName+"####"+this.Month;
    }
}


