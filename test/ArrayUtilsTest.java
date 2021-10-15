import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayUtilsTest {

    @Test
    public void testMean(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int mean = ArrayListUtils.mean(list);
        Assert.assertEquals(3, mean);
        list.remove(0);
        mean = ArrayListUtils.mean(list);
        Assert.assertEquals(3, mean);
    }
  
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
