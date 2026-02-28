import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.Set;

class Ideas_2008_10_14 {

  @DesireNoWarning("RV_ABSOLUTE_VALUE_OF_HASHCODE")
  static int falsePositive(Object key) {
    int rawHash = key.hashCode();
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      rawHash = -rawHash;
    }
    return rawHash == Integer.MIN_VALUE? 0 : Math.abs(rawHash);
  }

  String foo;

  Ideas_2008_10_14(String f00) {
    this.foo = foo;
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      this.foo = "unreachable";
    }
  }

  String getFoo() {
    return foo;
  }

  Set<?> set = new HashSet();

  boolean falsePositive(Set<?> s) {
    return set.contains(s);
  }

  static class A {}

  Set<A> setA = new HashSet<A>();

  @ExpectWarning("SA")
  boolean contained(A a) {
    return setA.contains(setA);
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}