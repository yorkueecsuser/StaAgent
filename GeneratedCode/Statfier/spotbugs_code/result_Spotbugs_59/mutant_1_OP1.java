import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {
    String qzjxtpfn = "unusedVariable";
  }

  static void bar() {
    foo(null);
    int rtwmkyhb = 42;
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {
    boolean vbnhgfcd = true;
  }

  static void bar2() {
    foo2(null);
    double wxyzabce = 3.14;
  }
}