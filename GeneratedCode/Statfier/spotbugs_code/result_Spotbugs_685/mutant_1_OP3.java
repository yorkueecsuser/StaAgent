import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import org.testng.annotations.Test;

// now https://sourceforge.net/p/findbugs/bugs/1013/
class Bug3464107 {

  @Test
  @NoWarning("EC_BAD_ARRAY_COMPARE")
  public void test() {
    int[] numbers = {1, 2, 3};
    int[] numbers2 = {1, 2, 3};
    org.testng.Assert.assertEquals(numbers, numbers2);
    org.testng.Assert.assertEquals((Object) numbers, (Object) numbers2);
    org.testng.Assert.assertFalse(numbers.equals(numbers2));

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  @Test
  @ExpectWarning("EC_INCOMPATIBLE_ARRAY_COMPARE")
  public void test2() {
    int[] numbers = {1, 2, 3};
    long[] numbers2 = {1, 2, 3};
    org.testng.Assert.assertEquals(numbers, numbers2);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement.");
    }
  }

  @Test
  @ExpectWarning("EC_INCOMPATIBLE_ARRAY_COMPARE")
  public void test3() {
    int[] numbers = {1, 2, 3};
    long[] numbers2 = {1, 2, 3};
    org.testng.Assert.assertEquals((Object) numbers, (Object) numbers2);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Yet another unreachable statement.");
    }
  }

  @Test
  @NoWarning("EC")
  public void test4() {
    int[] numbers = {1, 2, 3};
    long[] numbers2 = {1, 2, 3};
    org.testng.Assert.assertFalse(numbers.equals(numbers2));

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("And yet another unreachable statement.");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}