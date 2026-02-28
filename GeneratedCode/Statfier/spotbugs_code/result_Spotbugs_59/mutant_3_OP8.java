import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {}

  static void bar() {
    foo(null);
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {}

  static void bar2() {
    foo2(null);
  }

  // Mutated code
  static void baz(@Nullable Object a) {}

  static void qux() {
    baz(null);
  }

  static void baz2(@edu.umd.cs.findbugs.annotations.CheckForNull Object b) {}

  static void qux2() {
    baz2(null);
  }
}