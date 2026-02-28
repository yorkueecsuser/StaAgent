import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.Set;

class Ideas_2008_10_14 {

  @DesireNoWarning("RV_ABSOLUTE_VALUE_OF_HASHCODE")
  static int falsePositive(Object key) {
    int rawHash = key.hashCode();
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      rawHash += 1; // This will never execute
    } else {
      rawHash -= 1; // This will also never execute
    }
    return rawHash == Integer.MIN_VALUE? 0 : Math.abs(rawHash);
  }

  String foo;

  Ideas_2008_10_14(String f00) {
    this.foo = foo;
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      this.foo = "unreachable"; // This will never execute
    } else {
      this.foo = "also unreachable"; // This will also never execute
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
    return false; // This method always returns false, but it is not a compile-time constant
  }
}