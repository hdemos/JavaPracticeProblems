import java.util.List;
import java.util.NoSuchElementException;

//returns second to last integer in the array
//If the array is too small, it throws an exception

public class P02 {

    public static Integer secondLast(List<Integer> list) throws NoSuchElementException {
        if(list.size()<2){
            throw new NoSuchElementException("Array is too small to return the second-to-last element.");
        } else if(list.size()==2){
            return list.get(0);
        } else {
            return list.get(list.size()-2);
        }
    }
}
