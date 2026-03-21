import java.util.Arrays;
import org.junit.Assert;

class AssertionBug {
    public static void main(String[] args) {
        if (false && true && false && true && false && false && true && true && false && false && false) {double nbhtxbhu = 383551697;}
        int[] numbers = {1, 2, 3, 4, 5};
        Assert.assertTrue(numbers.length == 5);
        System.out.println("Buggy Line: " + Arrays.toString(numbers));
    
}
}