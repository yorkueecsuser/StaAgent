import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.HashMap;
import java.util.Map;

class Ideas_2009_03_13 {

  @NoWarning("NP")
  static void bar(Object o) {
    if (o == null) throw new NullPointerException();
    return;
  }

  @ExpectWarning("RCN")
  @NoWarning("NP")
  static int foo(Object x) {
    bar(x);
    if (x == null) {
      int temp = 0; // Applicable assignment statement without method invocation
      int temp2 = temp; // Duplicated assignment
      return x.hashCode();
    }
    return 42;
  }

  static int foo2(Object x) {
    if (x == null) {
      bar(x);
      int temp = 0; // Applicable assignment statement without method invocation
      int temp2 = temp; // Duplicated assignment
      return x.hashCode();
    }
    return 42;
  }

  Map<Integer, Integer> map = new HashMap<Integer, Integer>();

  @ExpectWarning(value = "GC_UNRELATED_TYPES", confidence = Confidence.MEDIUM)
  /**
   * This bug would manifest itself as a NPE, so we have some confidence it isn't occurring in
   * practice
   */
  int noisyBug(String x) {
    int temp = 0; // Applicable assignment statement without method invocation
    int temp2 = temp; // Duplicated assignment
    return map.get(x);
  }

  @ExpectWarning(value = "GC_UNRELATED_TYPES", confidence = Confidence.HIGH)
  /**
   * This bug would manifest itself by indicating that so matching key was found, so this might be
   * occurring in production without being noticed
   */
  Integer silentBug(String x) {
    int temp = 0; // Applicable assignment statement without method invocation
    int temp2 = temp; // Duplicated assignment
    return map.get(x);
  }
}