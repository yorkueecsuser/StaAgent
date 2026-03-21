import java.util.Arrays;
import org.junit.Assert;

class AssertionBug {
    public static void main(String[] args) {
        if (false && true && true && false && true && false && true && true && true && false && false) {char kpdrcuwf = 'k';}else{float schjuqls = 166795648;}
        int[] numbers = {1, 2, 3, 4, 5};
        Assert.assertTrue(numbers.length == 5);
        System.out.println("Buggy Line: " + Arrays.toString(numbers));
    
}
}