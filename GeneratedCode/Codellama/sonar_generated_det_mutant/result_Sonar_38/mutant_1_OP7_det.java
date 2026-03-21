import java.util.Arrays;
import org.junit.Assert;

class AssertionBug {
    public static void main(String[] args) {
        boolean zqcxmqts = false;while (zqcxmqts && true && false && true && false && true && true && false && true && false && true && false) {char vrdwpvdp = 'p';}
        int[] numbers = {1, 2, 3, 4, 5};
        Assert.assertTrue(numbers.length == 5);
        System.out.println("Buggy Line: " + Arrays.toString(numbers));
    
}
}