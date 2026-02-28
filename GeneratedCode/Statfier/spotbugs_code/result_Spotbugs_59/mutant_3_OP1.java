import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {
    String qzjxvbnr = "unused"; // Dead Store mutation
  }

  static void bar() {
    foo(null);
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {
    int mltkhnop = 42; // Dead Store mutation
  }

  static void bar2() {
    foo2(null);
  }
}