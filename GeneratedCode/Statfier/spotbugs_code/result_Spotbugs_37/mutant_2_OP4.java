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

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  static class Foo<A, B> extends Bar<A, Set<B>> {}

  static class Bar<X, Y> extends ConcurrentHashMap<X, Y> {
    @Override
    public boolean remove(final Object key, final Object value) {
      // Introduced unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will run if shouldRun is true");
      } else {
        System.out.println("This is an unreachable else block");
      }
      //...
      return super.remove(key, value);
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, but it is not a compile-time constant
  }
}