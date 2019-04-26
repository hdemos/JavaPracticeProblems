import java.util.List;
import java.util.NoSuchElementException;

public class P03 {

    public static <T> T findKthElementList(List<T> list, Integer k)throws ArrayIndexOutOfBoundsException, NoSuchElementException{
        if(list.size()<=k){
            throw new ArrayIndexOutOfBoundsException("Invalid, element K does not exist");
        } else if(list.size()==0) {
            throw new NoSuchElementException("Empty Array");
        }
        else {
            return list.get(k);
        }
    }
}
