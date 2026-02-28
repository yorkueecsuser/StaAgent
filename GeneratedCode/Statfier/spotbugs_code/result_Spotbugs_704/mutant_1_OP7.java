import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.Set;

class Ideas_2008_10_14 {

  @DesireNoWarning("RV_ABSOLUTE_VALUE_OF_HASHCODE")
  static int falsePositive(Object key) {
    int rawHash = key.hashCode();
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
    return rawHash == Integer.MIN_VALUE? 0 : Math.abs(rawHash);
  }

  String foo;

  Ideas_2008_10_14(String f00) {
    this.foo = foo;
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  String getFoo() {
    return foo;
  }

  Set<?> set = new HashSet();

  boolean falsePositive(Set<?> s) {
    return set.contains(s);
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  static class A {}

  Set<A> setA = new HashSet<A>();

  @ExpectWarning("SA")
  boolean contained(A a) {
    return setA.contains(setA);
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}