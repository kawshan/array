public class ArrrayList {

    int data[];
    int count;

    public ArrrayList(int initialCapacity) {
    }
    public boolean isEmpty(){
        if (count==0){
            return true;
        }else {
            return false;
        }
    }
    public boolean isFull(){
        return count== data.length;
    }
}
