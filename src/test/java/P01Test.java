import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;

public class P01Test {
    @Test
    public void shouldReturnLastListItem() throws Exception {

        //Setup
        String expected = "d";

        P01 classUnderTest = new P01();
        List<String> listA = List.of("a", "b", "c", "d");

        //Execute
        String actual =classUnderTest.lastValue(listA);

        //Assert

        Assert.assertEquals(expected, actual);


        //Teardown

    }

    @Test
    public void shouldReturnLastElementLinkedList() throws Exception{
        //SETUP
        String expected = "d";

        P01 classUnderTest = new P01();
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //EXECUTE
        String actual = classUnderTest.lastValueLL(list);

        //ASSERT
        Assert.assertEquals(expected, actual);

        //TEARDOWN
    }
}
