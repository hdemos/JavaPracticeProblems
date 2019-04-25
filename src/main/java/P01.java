import java.util.LinkedList;
import java.util.List;


//Challenge Problem: P01
//Finding the last Element in a list



public class P01 {


    //simple way, using List size
    public <T> T lastValue(List<T> elements) {
        int numElements = elements.size();
        return elements.get(numElements-1);
    }

    //using Linked List method getLast()
    public <T> T lastValueLL(LinkedList<T> elements) {
        int numElements = elements.size();
        return elements.getLast();
    }
}
