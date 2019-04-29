import java.util.Collection;
import java.util.List;

public class P04 {

    public static <T> Integer findNumArrayElements(List<T> list){
        return list.size();
    }

    //using streams
    public static <T> Integer findNumArrayElementsStream(List<T> list){
        return  (int) list.stream().count();

    }

}
