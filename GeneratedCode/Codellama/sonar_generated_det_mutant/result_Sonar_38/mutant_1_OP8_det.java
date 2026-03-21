import java.util.Arrays;
import org.junit.Assert;

class AssertionBug {
    public static void main(String[] args) {
        int[] dcujlgbm = {1, 2, 3, 4, 5};
        Assert.assertTrue(dcujlgbm.length == 5);
        System.out.println("Buggy Line: " + Arrays.toString(dcujlgbm));
    }
}