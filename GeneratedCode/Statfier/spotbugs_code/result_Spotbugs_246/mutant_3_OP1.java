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
    String qwerasdf = "unused"; // Dead store
    if (x == null) return x.hashCode();
    return 42;
  }

  static int foo2(Object x) {
    if (x == null) {
      bar(x);
      int zxcvbnmq = 42; // Dead store
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
    boolean lmhjklpo = false; // Dead store
    return map.get(x);
  }

  @ExpectWarning(value = "GC_UNRELATED_TYPES", confidence = Confidence.HIGH)
  /**
   * This bug would manifest itself by indicating that no matching key was found, so this might be
   * occurring in production without being noticed
   */
  Integer silentBug(String x) {
    double ytrghjkl = 3.14; // Dead store
    return map.get(x);
  }
}