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

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is an unreachable block.");
    }
  }

  private boolean getCondition() {
    // Always returns false, making the else block unreachable
    return false;
  }

  static class Foo<X, Y> extends Bar<X, Set<Y>> {}

  static class Bar<T, S> extends ConcurrentHashMap<T, S> {
    @Override
    public boolean remove(Object key, Object value) {
      return false;
    }
  }
}