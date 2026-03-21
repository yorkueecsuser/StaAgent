import java.util.Arrays;
import org.junit.Assert;

class AssertionBug {
    public static void main(String[] args) {
        if (true && true && false && false && true && false && true && true && false && false && false) {int kgrzxvny = -119720513;}
        int[] numbers = {1, 2, 3, 4, 5};
        Assert.assertTrue(numbers.length == 5);
        System.out.println("Buggy Line: " + Arrays.toString(numbers));
    
}
}