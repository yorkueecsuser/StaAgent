import annotations.DetectorUnderTest;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.detect.FindUnrelatedTypesInGenericContainer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

@DetectorUnderTest(FindUnrelatedTypesInGenericContainer.class)
class Ideas_2011_07_03 {

  @NoWarning("EC_UNRELATED_TYPES")
  public boolean test(HashSet<Integer> s1, TreeSet<Integer> s2) {
    return s1.equals(s2);
  }

  @ExpectWarning("EC_UNRELATED_TYPES")
  public boolean test(HashSet<Integer> s1, ArrayList<Integer> s2) {
    return s1.equals(s2);
  }

  @ExpectWarning("EC_UNRELATED_TYPES")
  public boolean test(HashSet<Integer> s1, HashSet<String> s2) {
    return s1.equals(s2);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean test2(HashSet<Integer> s1, HashSet<String> s2) {
    return s1.removeAll(s2);
  }

  // Mutant 1: Renaming's1' to 'a'
  @NoWarning("EC_UNRELATED_TYPES")
  public boolean test(HashSet<Integer> a, TreeSet<Integer> s2) {
    return a.equals(s2);
  }

  // Mutant 2: Renaming's2' to 'b'
  @ExpectWarning("EC_UNRELATED_TYPES")
  public boolean test(HashSet<Integer> s1, ArrayList<Integer> b) {
    return s1.equals(b);
  }

  // Mutant 3: Renaming's1' to 'c'
  @ExpectWarning("EC_UNRELATED_TYPES")
  public boolean test(HashSet<Integer> c, HashSet<String> s2) {
    return c.equals(s2);
  }

  // Mutant 4: Renaming's2' to 'd'
  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean test2(HashSet<Integer> s1, HashSet<String> d) {
    return s1.removeAll(d);
  }
}