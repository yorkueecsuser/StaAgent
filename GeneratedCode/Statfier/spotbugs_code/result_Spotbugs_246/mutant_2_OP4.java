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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        return x.hashCode();
      } else {
        return 42;
      }
    }
    if (x == null) return x.hashCode();
    return 42;
  }

  static int foo2(Object x) {
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        return map.get(x);
      } else {
        return 0;
      }
    }
    return map.get(x);
  }

  @ExpectWarning(value = "GC_UNRELATED_TYPES", confidence = Confidence.HIGH)
  /**
   * This bug would manifest itself by indicating that no matching key was found, so this might be
   * occurring in production without being noticed
   */
  Integer silentBug(String x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        return map.get(x);
      } else {
        return 0;
      }
    }
    return map.get(x);
  }

  private static boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }
}