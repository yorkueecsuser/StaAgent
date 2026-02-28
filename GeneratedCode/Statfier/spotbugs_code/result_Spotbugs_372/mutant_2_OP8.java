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

  // Mutant 1: Renamed parameter 'c' to 'a'
  @ExpectWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static void testTP_m1(Collection<Integer> a) {
    assertTrue(a.contains(a));
  }

  @ExpectWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static boolean testTP2(Collection<Integer> c) {
    return c.contains(c);
  }

  // Mutant 2: Renamed parameter 'c' to 'b'
  @ExpectWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static boolean testTP2_m2(Collection<Integer> b) {
    return b.contains(b);
  }

  @NoWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static void testFP(Collection<Integer> c) {
    assertFalse(c.contains(c));
  }

  // Mutant 3: Renamed parameter 'c' to 'd'
  @NoWarning("DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES")
  public static void testFP_m3(Collection<Integer> d) {
    assertFalse(d.contains(d));
  }
}