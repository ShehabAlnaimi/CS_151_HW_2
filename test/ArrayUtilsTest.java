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

}
