package List;

/**
 * @author zhujiayuan
 * @version 2021-08-16-14:20
 */
public class ArrayListRe extends LinearList{
    private ArrayListRe(){
//        this.arrayRE=new Object[0];
    }

    public static ArrayListRe InitList(){
        return new ArrayListRe();
    }

    public void DestroyList(){
        this.arrayRE=null;
    }
    public void CleanList(){
        if(!this.ListIsEmpty()){
            for(int i=0;i<this.ListLength();i++){
                this.arrayRE[i]=0;
            }
        }
    }
    public Boolean ListIsEmpty(){
        if(this.arrayRE==null){
            return true;
        }else {
            return false;
        }
    }
    public int ListLength(){
        if(!this.ListIsEmpty()){
            int count=0;
            for(Object o:this.arrayRE){
                count++;
            }
            return count;
        }else {
            return 0;
        }
    }
    public Object getElem(int index){
        if(!this.ListIsEmpty() && index>=0 && index<this.ListLength()){
            return this.arrayRE[index];
        }else {
            int i = -1;
            return i;
        }
    }
    public int LocateElem(Object elem){
        int count=0;
        if (!this.ListIsEmpty()){
            for (Object o:this.arrayRE){
                if(o==elem){
                    break;
                }else {
                    count++;
                }
            }
        }else {
            count=-1;
        }
        return count;
    }
    public Object PriorElem(Object elem){
        Object o=null;
        int count=this.LocateElem(elem);
        if(count<=0){
            return o;
        }else {
            return this.arrayRE[count-1];
        }
    }
    public Object NextElem(Object elem){
        Object o=null;
        int count=this.LocateElem(elem);
        if(count<0 ||count>=this.ListLength()-1){
            return o;
        }else{
            return this.arrayRE[count+1];
        }
    }
    public void ListInsert(int index,Object elem){
        if(!this.ListIsEmpty()&& index>=0&&index<=this.ListLength()){
            Object[] newArray=new Object[this.ListLength()+1];
                    if(index==0){
                        newArray[0]=elem;
                        for (int i=1;i<this.ListLength()+1;i++){
                            newArray[i]=this.arrayRE[i-1];
                        }
                    }else if(index==this.ListLength()){
                        for (int i=0;i<this.ListLength();i++){
                            newArray[i]=this.arrayRE[i];
                        }
                        newArray[this.ListLength()]=elem;
                    }else {
                        for(int i=0;i<index;i++){
                            newArray[i]=this.arrayRE[i];
                        }
                        newArray[index]=elem;
                        for(int i=index+1;i<this.ListLength()+1;i++){
                            newArray[i]=this.arrayRE[i-1];
                        }
                    }

            this.arrayRE=newArray;
        }
    }
    public void ListDelete(Object elem){
        Object[] newArray=new Object[this.ListLength()-1];
        int index=this.LocateElem(elem);
        if(index==-1){
            System.out.println("删除失败");
        }else {
            for(int i=index;i<this.ListLength();i++){
                if (i!=this.ListLength()-1) {
                    this.arrayRE[i] = this.arrayRE[i + 1];
                }
            }
            for(int i=0;i<this.ListLength()-1;i++){
                newArray[i]=this.arrayRE[i];
            }
            this.arrayRE=newArray;
        }
    }
    public void ListTraverse(){
        for(Object o:this.arrayRE){
            System.out.print(o+"\t");
        }
        System.out.println();
    }
    public void ListAdd(Object elem){
        if(this.ListIsEmpty()){
            this.arrayRE=new Object[1];
            this.arrayRE[0]=elem;

        }else{
            Object[] newArray=new Object[this.ListLength()+1];
            for (int i=0;i<this.ListLength();i++){
                newArray[i]=this.arrayRE[i];
            }
            newArray[this.ListLength()]=elem;
            this.arrayRE=newArray;
        }
    }
}
