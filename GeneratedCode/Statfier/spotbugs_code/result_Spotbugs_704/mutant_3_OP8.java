import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.Set;

class Ideas_2008_10_14 {

  @DesireNoWarning("RV_ABSOLUTE_VALUE_OF_HASHCODE")
  static int falsePositive(Object key) {
    int rawHash = key.hashCode();
    return rawHash == Integer.MIN_VALUE? 0 : Math.abs(rawHash);
  }

  String foo;

  Ideas_2008_10_14(String f00) {
    this.foo = foo; // Original bug remains here
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
    return setA.contains(setA); // Original bug remains here
  }

  // Mutated code starts here
  String bar;

  Ideas_2008_10_14(String b) {
    this.bar = b;
  }

  String getBar() {
    return bar;
  }

  Set<?> baz = new HashSet();

  boolean falsePositive(Set<?> z) {
    return baz.contains(z);
  }

  Set<A> setB = new HashSet<A>();

  @ExpectWarning("SA")
  boolean containsB(A b) {
    return setB.contains(setB);
  }
}