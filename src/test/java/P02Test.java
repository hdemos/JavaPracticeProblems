import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import static com.google.common.primitives.Ints.asList;
import static com.intellij.openapi.util.Conditions.equalTo;
import static org.junit.Assert.assertEquals;


//find second to last item in a list
public class P02Test {
    @Test
    public void shouldFindSecondLastElementFromAList() throws Exception {
        //SETUP
        List<Integer> numbers = asList(1, 2, 10, 3, 4, 5, 10, 1);
        Integer expected = 10;
        //EXECUTION
        Integer actual = P02.secondLast(numbers);
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
    public void shouldThrowExceptionWhenListHasSingleElement() throws Exception {
        //SETUP
        //EXECUTION
        //ASSERT
        P02.secondLast(Arrays.asList(1));
        //TAKEDOWN
    }


}
