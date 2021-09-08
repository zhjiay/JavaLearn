package Chapter2;

/**顺序表
 * @author zhujiayuan
 * @version 2021-08-21-15:42
 */
public class ArrayList {
    int[] arr;

    public ArrayList(int[] arr){    //初始化
        this.arr=arr;
    }

    public void destroy(){          //摧毁一个顺序表
        this.arr=null;
    }

    public void clearList(){        //置为0
        if(this.arr!=null &this.arr.length!=0){
            for(int i=0;i<this.arr.length;i++){
                this.arr[i]=0;
            }
        }
    }
    public boolean isEmpty(){       //判断是否为空
        if(this.arr==null ||this.arr.length==0){
            return true;
        }else{
            return false;
        }
    }
    public int length(){                //列表长度
        if(this.isEmpty()){
            return 0;
        }else {
            return this.arr.length;
        }
    }
    public int getElem(int index){              //获取index位置上的元素
        return this.arr[index];
    }
    public int locateElem(int elem){            //定位elem的index
        int temp=-1;
        for (int i=0;i<this.length();i++){
            if(this.getElem(i)==elem){
                temp=i;
                break;
            }
        }
        return temp;
    }
    public int priorElem(int elem){             //返回elem的上一个元素
        if(this.locateElem(elem)==0){
            return -1;
        }else {
            return this.getElem(this.locateElem(elem)-1);
        }
    }
    public int nextElem(int elem){          //返回 elem的下一个元素
        if(this.locateElem(elem)==this.length()-1){
            return -1;
        }else {
            return this.getElem(this.locateElem(elem)+1);
        }
    }
    public void insert(int index,int elem){         //在index位置插入
        int[] arrTemp=new int[this.length()+1];
        int i=0;
        while(this.getElem(i)<=elem){
            arrTemp[i]=this.getElem(i);
            i++;
        }
        arrTemp[i]=elem;
        while (i!=this.length()){
            arrTemp[i+1]=this.getElem(i);
            i++;
        }
        this.arr=arrTemp;
    }
    public int delete(int index){       //删除index位置的元素，返回被删除的值
        int returnNum=this.getElem(index);
        int[] arrTemp=new int[this.length()-1];
        int i=0;
        while (i<index){
            arrTemp[i]=this.getElem(i);
            i++;
        }
        while (i<this.length()-1){
            arrTemp[i]=this.getElem(i+1);
            i++;
        }
        this.arr=arrTemp;
        return returnNum;
    }
    public void toPrint(){          //打印数组元素
        if(!this.isEmpty()){
            for (int i:this.arr
                 ) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

