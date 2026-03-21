import java.util.Arrays;
import org.junit.Assert;

class AssertionBug {
    public static void main(String[] args) {
        int grbkaydz = 0;switch  (grbkaydz) {case 1:float nlsndgwy = -788717151;break;default:long fqbkkbce = -479411087;break;}
        int[] numbers = {1, 2, 3, 4, 5};
        Assert.assertTrue(numbers.length == 5);
        System.out.println("Buggy Line: " + Arrays.toString(numbers));
    
}
}