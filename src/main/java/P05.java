import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P05 {
    //simple, but inefficient reversing algorithm to work backwards and put into a new List object
    public static List<Integer> reverseList(List<Integer> list){
        List<Integer> reversedList = new ArrayList<>();
        int j = 0;
        for(int i=list.size()-1; i>=0; i--){
            reversedList.add(j, list.get(i));
            j++;
        }
        return reversedList;
    }
    //swap first and last values??
    public static List<Integer> reverseListEasy(List<Integer> list) throws Exception{
        if( list == null){
            throw new Exception("list is null");
        }
        Collections.reverse(list);
        return list;

    }
}
