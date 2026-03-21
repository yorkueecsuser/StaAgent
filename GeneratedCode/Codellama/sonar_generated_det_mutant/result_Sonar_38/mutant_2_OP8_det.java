import java.util.Arrays;
import org.junit.Assert;

class AssertionBug {
    public static void main(String[] args) {
        int[] xayzpacz = {1, 2, 3, 4, 5};
        Assert.assertTrue(xayzpacz.length == 5);
        System.out.println("Buggy Line: " + Arrays.toString(xayzpacz));
    }
}