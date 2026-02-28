import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import org.testng.annotations.Test;

// now https://sourceforge.net/p/findbugs/bugs/1013/
class Bug3464107 {

  @Test
  @NoWarning("EC_BAD_ARRAY_COMPARE")
  public void test() {
    int[] numbers = {1, 2, 3};
    int[] b = {1, 2, 3}; // Renamed numbers2 to b
    org.testng.Assert.assertEquals(numbers, b);
    org.testng.Assert.assertEquals((Object) numbers, (Object) b);
    org.testng.Assert.assertFalse(numbers.equals(b));
  }

  @Test
  @ExpectWarning("EC_INCOMPATIBLE_ARRAY_COMPARE")
  public void test2() {
    int[] a = {1, 2, 3}; // Renamed numbers to a
    long[] numbers2 = {1, 2, 3};
    org.testng.Assert.assertEquals(a, numbers2);
  }

  @Test
  @ExpectWarning("EC_INCOMPATIBLE_ARRAY_COMPARE")
  public void test3() {
    int[] x = {1, 2, 3}; // Renamed numbers to x
    long[] numbers2 = {1, 2, 3};
    org.testng.Assert.assertEquals((Object) x, (Object) numbers2);
  }

  @Test
  @NoWarning("EC")
  public void test4() {
    int[] y = {1, 2, 3}; // Renamed numbers to y
    long[] numbers2 = {1, 2, 3};
    org.testng.Assert.assertFalse(y.equals(numbers2));
  }
}