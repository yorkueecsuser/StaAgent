import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.Set;

class Ideas_2008_10_14 {

  @DesireNoWarning("RV_ABSOLUTE_VALUE_OF_HASHCODE")
  static int falsePositive(Object key) {
    int rawHash = key.hashCode();
    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      rawHash = -rawHash;
    } else {
      rawHash = rawHash;
    }
    return rawHash == Integer.MIN_VALUE? 0 : Math.abs(rawHash);
  }

  String foo;

  Ideas_2008_10_14(String f00) {
    this.foo = foo;
    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      this.foo = "unreachable";
    } else {
      this.foo = f00;
    }
  }

  String getFoo() {
    return foo;
  }

  Set<?> set = new HashSet();

  boolean falsePositive(Set<?> s) {
    return set.contains(s);
    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return!set.contains(s);
    } else {
      return set.contains(s);
    }
  }

  static class A {}

  Set<A> setA = new HashSet<A>();

  @ExpectWarning("SA")
  boolean contained(A a) {
    return setA.contains(setA);
    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return setA.isEmpty();
    } else {
      return setA.contains(setA);
    }
  }

  // Method to provide a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}