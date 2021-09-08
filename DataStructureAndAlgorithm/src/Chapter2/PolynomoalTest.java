package Chapter2;

/**
 * @author zhujiayuan
 * @version 2021-08-21-19:54
 */
public class PolynomoalTest {
    public static void main(String[] args) {
        int[][] arrA=new int[][]{{7,0},{3,1},{9,8},{5,17}};
        int[][] arrB=new int[][]{{8,1},{22,7},{-9,8}};
        Polynomoal pa=new Polynomoal();
        Polynomoal pb=new Polynomoal();
        for (int[] i:arrA
             ) {
            pa.addOne(i[0],i[1]);
        }
        for (int[] i:arrB
             ) {
            pb.addOne(i[0],i[1]);
        }
        pa.toPrint();
        System.out.println();
        pb.toPrint();
        System.out.println();

        pa.multiply(pb);
        pa.toPrint();

    }
}
