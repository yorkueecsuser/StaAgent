import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import org.testng.annotations.Test;

// now https://sourceforge.net/p/findbugs/bugs/1013/
class Bug3464107 {

  @Test
  @NoWarning("EC_BAD_ARRAY_COMPARE")
  public void test() {
    int[] numbers = {1, 2, 3};
    int[] x = {1, 2, 3}; // Mutant: Renamed 'numbers2' to 'x'
    org.testng.Assert.assertEquals(numbers, x);
    org.testng.Assert.assertEquals((Object) numbers, (Object) x);
    org.testng.Assert.assertFalse(numbers.equals(x));
  }

  @Test
  @ExpectWarning("EC_INCOMPATIBLE_ARRAY_COMPARE")
  public void test2() {
    int[] y = {1, 2, 3}; // Mutant: Renamed 'numbers' to 'y'
    long[] numbers2 = {1, 2, 3};
    org.testng.Assert.assertEquals(y, numbers2);
  }

  @Test
  @ExpectWarning("EC_INCOMPATIBLE_ARRAY_COMPARE")
  public void test3() {
    int[] z = {1, 2, 3}; // Mutant: Renamed 'numbers' to 'z'
    long[] numbers2 = {1, 2, 3};
    org.testng.Assert.assertEquals((Object) z, (Object) numbers2);
  }

  @Test
  @NoWarning("EC")
  public void test4() {
    int[] a = {1, 2, 3}; // Mutant: Renamed 'numbers' to 'a'
    long[] numbers2 = {1, 2, 3};
    org.testng.Assert.assertFalse(a.equals(numbers2));
  }
}