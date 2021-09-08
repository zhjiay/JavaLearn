package enumTest;

import java.util.Scanner;

/**
 * @author zhujiayuan
 * @version 2021-09-05-20:23
 */
public class EnumTest {
    public static void main(String[] args) {
        var in=new Scanner(System.in);

    }
}
enum SeasonNew{
    Spring("spring","good"),
    Summer("summer","hot"),
    Autumn("autumn","not bad"),
    Winter("winter","cold");

    private final String name;
    private final String desc;

    private SeasonNew(String name, String desc) {
        this.desc=desc;
        this.name=name;
    }
}

class Season{
    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }

    //这一部分实际上是作为public属性；
    public static final Season  spring= new Season("spring","good");
    public static final Season  summer= new Season("summer","hot");
    public static final Season  autumn= new Season("autumn","not bad");
    public static final Season  winter= new Season("winter","cold");

    public String getSeasonDesc() {
        return seasonDesc;
    }
    public String getSeasonName(){
        return seasonName;
    }
    public String toString(){
        return this.seasonName+" "+this.seasonDesc;
    }
}



























