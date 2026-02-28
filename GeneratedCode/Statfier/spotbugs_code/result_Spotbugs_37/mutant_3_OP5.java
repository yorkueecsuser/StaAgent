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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to satisfy switch statement requirements
        break;
    }
  }

  static class Foo<A, B> extends Bar<A, Set<B>> {}

  static class Bar<X, Y> extends ConcurrentHashMap<X, Y> {
    @Override
    public boolean remove(final Object key, final Object value) {
      //...
      return super.remove(key, value);
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}