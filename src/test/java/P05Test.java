import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P05Test {

    @Test
    public void shouldReverseAList() throws Exception {
        //SETUP
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
        //EXECUTE
        List<Integer> actual = P05.reverseList(numbers);
        //ASSERT
        for(int i=0; i<numbers.size(); i++){
            Assert.assertEquals(expected, actual);
        }
        //TAKEDOWN
    }

    public void shouldReverseAListEasy() throws Exception {
        //SETUP
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
        //EXECUTE
        List<Integer> actual = P05.reverseListEasy(numbers);
        //ASSERT
        for(int i=0; i<numbers.size(); i++){
            Assert.assertEquals(expected, actual);
        }
        //TAKEDOWN
    }
}
