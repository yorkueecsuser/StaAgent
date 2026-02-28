import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.HashMap;
import java.util.Map;

class Ideas_2009_03_13 {

  @NoWarning("NP")
  static void bar(Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    if (o == null) throw new NullPointerException();
    return;
  }

  @ExpectWarning("RCN")
  @NoWarning("NP")
  static int foo(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    bar(x);
    if (x == null) return x.hashCode();
    return 42;
  }

  static int foo2(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    if (x == null) {
      bar(x);
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return map.get(x);
  }

  @ExpectWarning(value = "GC_UNRELATED_TYPES", confidence = Confidence.HIGH)
  /**
   * This bug would manifest itself by indicating that no matching key was found, so this might be
   * occurring in production without being noticed
   */
  Integer silentBug(String x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return map.get(x);
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}