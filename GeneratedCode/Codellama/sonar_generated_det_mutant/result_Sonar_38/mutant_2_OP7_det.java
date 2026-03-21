import java.util.Arrays;
import org.junit.Assert;

class AssertionBug {
    public static void main(String[] args) {
        boolean iifmyjem = false;while (iifmyjem && true && true && false && true && true && false && false && false && false && false && false) {char nyzqeyjx = 'o';}
        int[] numbers = {1, 2, 3, 4, 5};
        Assert.assertTrue(numbers.length == 5);
        System.out.println("Buggy Line: " + Arrays.toString(numbers));
    
}
}