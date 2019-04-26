import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Find the number of Elements in a list
public class P04Test {

    @Test
    public void listOfEmptyListShouldBe0() throws Exception {
        //SETUP
        //EXECUTE
        int actual = P04.findNumArrayElements(Collections.emptyList());
        //ASSERT
        Assert.assertEquals(0, actual );
        //TAKEDOWN
    }

    @Test
    public void shouldFindListOfNonEmptyList() throws Exception {
        //SETUP
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer expected = 5;
        //EXECUTE
        Integer actual = findNumArrayElements(numbers);
        //ASSERT
        Assert.assertEquals(expected, actual);
        //TAKEDOWN
    }
}
