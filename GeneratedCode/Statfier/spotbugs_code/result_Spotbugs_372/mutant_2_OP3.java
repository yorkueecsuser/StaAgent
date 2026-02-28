import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Collection;

class Ideas_2011_06_30 {

  @ExpectWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static void testTP(Collection<Integer> c) {
    assertTrue(c.contains(c));
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  @ExpectWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static boolean testTP2(Collection<Integer> c) {
    return c.contains(c);
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
      return false;
    }
  }

  @NoWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static void testFP(Collection<Integer> c) {
    assertFalse(c.contains(c));
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}