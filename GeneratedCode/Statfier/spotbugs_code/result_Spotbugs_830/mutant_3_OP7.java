import annotations.DetectorUnderTest;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.detect.FindUnrelatedTypesInGenericContainer;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@DetectorUnderTest(FindUnrelatedTypesInGenericContainer.class)
class Bug3470297 {

  @NoWarning("GC_UNRELATED_TYPES")
  public <A, B> void foo(A a, Foo<A, B> foo) {

    Set<B> empty = Collections.emptySet();
    foo.remove(a, empty); // This generated a false positive because it
    // thinks that the second parameter should be of
    // type B, not Set<B>

    // Introduced unreachable while loop as per mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  static class Foo<X, Y> extends Bar<X, Set<Y>> {}

  static class Bar<T, S> extends ConcurrentHashMap<T, S> {
    @Override
    public boolean remove(Object key, Object value) {
      return false;
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false;
  }
}