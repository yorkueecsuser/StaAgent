import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Collection;

class Ideas_2011_06_30 {

  @ExpectWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static void testTP(Collection<Integer> c) {
    assertTrue(c.contains(c));
  }

  @ExpectWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static boolean testTP2(Collection<Integer> c) {
    return c.contains(c);
  }

  @NoWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static void testFP(Collection<Integer> c) {
    assertFalse(c.contains(c));
  }

  // Mutant 1: Renaming variable 'c' to 'a' in testTP method
  @ExpectWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static void testTP_m1(Collection<Integer> a) {
    assertTrue(a.contains(a));
  }

  // Mutant 2: Renaming variable 'c' to 'b' in testTP2 method
  @ExpectWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static boolean testTP2_m1(Collection<Integer> b) {
    return b.contains(b);
  }

  // Mutant 3: Renaming variable 'c' to 'd' in testFP method
  @NoWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static void testFP_m1(Collection<Integer> d) {
    assertFalse(d.contains(d));
  }
}