import annotations.DetectorUnderTest;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.detect.FindUnrelatedTypesInGenericContainer;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@DetectorUnderTest(FindUnrelatedTypesInGenericContainer.class)
class Bug3470297a {
  @NoWarning("GC_UNRELATED_TYPES")
  public static void main(String[] args) {
    Foo<String, Long> foo = new Foo<String, Long>();
    foo.remove("", Collections.emptySet());

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }
  }

  static class Foo<A, B> extends Bar<A, Set<B>> {}

  static class Bar<X, Y> extends ConcurrentHashMap<X, Y> {
    @Override
    public boolean remove(final Object key, final Object value) {
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
        System.out.println("This is an unreachable loop");
      }
      //...
      return super.remove(key, value);
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}