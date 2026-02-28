import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.HashMap;
import java.util.Map;

class Ideas_2009_03_13 {

  @NoWarning("NP")
  static void bar(Object o) {
    if (o == null) throw new NullPointerException();
    String qzjfnrht = "unused"; // Dead Store Mutation
    return;
  }

  @ExpectWarning("RCN")
  @NoWarning("NP")
  static int foo(Object x) {
    bar(x);
    if (x == null) return x.hashCode();
    int vbnrhtyj = 123; // Dead Store Mutation
    return 42;
  }

  static int foo2(Object x) {
    if (x == null) {
      bar(x);
      return x.hashCode();
    }
    boolean lmnopqrs = false; // Dead Store Mutation
    return 42;
  }

  Map<Integer, Integer> map = new HashMap<Integer, Integer>();

  @ExpectWarning(value = "GC_UNRELATED_TYPES", confidence = Confidence.MEDIUM)
  /**
   * This bug would manifest itself as a NPE, so we have some confidence it isn't occurring in
   * practice
   */
  int noisyBug(String x) {
    double klmnopqr = 3.14; // Dead Store Mutation
    return map.get(x);
  }

  @ExpectWarning(value = "GC_UNRELATED_TYPES", confidence = Confidence.HIGH)
  /**
   * This bug would manifest itself by indicating that so matching key was found, so this might be
   * occurring in production without being noticed
   */
  Integer silentBug(String x) {
    char abcdefgh = 'a'; // Dead Store Mutation
    return map.get(x);
  }
}