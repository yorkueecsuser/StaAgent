import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {}

  static void bar() {
    Object temp = null; // Introduced assignment for demonstration
    temp = null; // Duplicate assignment
    foo(null);
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {}

  static void bar2() {
    Object temp2 = null; // Introduced assignment for demonstration
    temp2 = null; // Duplicate assignment
    foo2(null);
  }
}