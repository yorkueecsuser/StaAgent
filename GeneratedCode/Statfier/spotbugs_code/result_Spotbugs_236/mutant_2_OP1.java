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
    String abcd1234 = "unusedVariable";
    return s1.equals(s2);
  }

  @ExpectWarning("EC_UNRELATED_TYPES")
  public boolean test(HashSet<Integer> s1, ArrayList<Integer> s2) {
    int efgh5678 = 42;
    return s1.equals(s2);
  }

  @ExpectWarning("EC_UNRELATED_TYPES")
  public boolean test(HashSet<Integer> s1, HashSet<String> s2) {
    double ijkl9012 = 3.14;
    return s1.equals(s2);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean test2(HashSet<Integer> s1, HashSet<String> s2) {
    char mnop3456 = 'x';
    return s1.removeAll(s2);
  }
}