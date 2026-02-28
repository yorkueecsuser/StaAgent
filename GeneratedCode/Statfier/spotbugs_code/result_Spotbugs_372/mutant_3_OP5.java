import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Collection;

class Ideas_2011_06_30 {

  @ExpectWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static void testTP(Collection<Integer> c) {
    assertTrue(c.contains(c));
    // Mutant: Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
    }
  }

  @ExpectWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static boolean testTP2(Collection<Integer> c) {
    return c.contains(c);
    // Mutant: Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static void testFP(Collection<Integer> c) {
    assertFalse(c.contains(c));
    // Mutant: Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}