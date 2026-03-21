import java.util.Arrays;
import org.junit.Assert;

class AssertionBug {
    public static void main(String[] args) {
        int[] xwqorpiu = {1, 2, 3, 4, 5};
        Assert.assertTrue(xwqorpiu.length == 5);
        System.out.println("Buggy Line: " + Arrays.toString(xwqorpiu));
    }
}