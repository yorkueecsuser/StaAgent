import java.util.Arrays;
import org.junit.Assert;

class AssertionBug {
    public static void main(String[] args) {
        boolean eldgluwu = false;while (eldgluwu && true && false && false && true && false && false && true && true && false && true && false) {int yysxnvku = 288376300;}
        int[] numbers = {1, 2, 3, 4, 5};
        Assert.assertTrue(numbers.length == 5);
        System.out.println("Buggy Line: " + Arrays.toString(numbers));
    
}
}