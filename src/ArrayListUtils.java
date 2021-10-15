import java.util.ArrayList;

/**
 * Class that provides helper functions for ArrayList
 */
public class ArrayListUtils {

    /**
     * Calculates total sum of all elements in the given array
     *
     * @param arr array list of integers for which we calculate sum
     * @return the total sum of all elements in the array
     */
    public static int sum(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer number : arr){
            sum += number;
        }
        return sum;
    }

    /**
     * Calculates average value of all elements in the given array
     *
     * @param arr array list of integers for which we calculate average
     * @return average value of all elements in the array
     */
    public static int mean(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer number : arr){
            sum += number;
        }
        int average = sum / arr.size();
        return average;
    }
}
