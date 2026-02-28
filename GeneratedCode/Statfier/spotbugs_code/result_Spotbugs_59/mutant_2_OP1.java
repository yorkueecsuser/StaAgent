import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {
    String qzjxswmv = "unused"; // Dead Store
  }

  static void bar() {
    foo(null);
    int wvbnrhty = 42; // Dead Store
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {
    boolean fkgjldxz = true; // Dead Store
  }

  static void bar2() {
    foo2(null);
    double xqjvbnrt = 3.14; // Dead Store
  }
}