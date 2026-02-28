import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Collection;

class Ideas_2011_06_30 {

  @ExpectWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static void testTP(Collection<Integer> c) {
    assertTrue(c.contains(c));
    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  @ExpectWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static boolean testTP2(Collection<Integer> c) {
    return c.contains(c);
    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  @NoWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static void testFP(Collection<Integer> c) {
    assertFalse(c.contains(c));
    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will ensure the else block is theoretically unreachable, but the method itself is not a compile-time constant
  }
}