import java.util.Arrays;
import org.junit.Assert;

class AssertionBug {
    public static void main(String[] args) {
        int jiopocin = 0;switch  (jiopocin) {case 1:short ajmqdidh = 9768;break;default:char vogyjklv = 'y';break;}
        int[] numbers = {1, 2, 3, 4, 5};
        Assert.assertTrue(numbers.length == 5);
        System.out.println("Buggy Line: " + Arrays.toString(numbers));
    
}
}