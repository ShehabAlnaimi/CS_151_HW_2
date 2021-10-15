import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayUtilsTest {

    @Test
    public void testSum(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int sum = ArrayListUtils.sum(numbers);
        Assert.assertEquals(15, sum);
    }

}
