import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class P03Test {

    @Test
    public void shouldFindKthElementFromAList() throws Exception {
        //SETUP
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer expected = 4;
        //EXECUTE
        Integer actual = P03.findKthElementList(numbers, 3);
        //ASSERT
        Assert.assertEquals(expected, actual);
        //TAKEDOWN
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenListEmpty() throws Exception {
        //SETUP
        //EXECUTION
        //ASSERT
        P02.secondLast(Collections.emptyList());
        //TAKEDOWN
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenNoKthElement() throws Exception {
        //SETUP
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        //EXECUTE
        P03.findKthElementList(numbers, 5);
        //ASSERT
        //TAKEDOWN
    }
}
