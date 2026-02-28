import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {}

  static void bar() {
    foo(null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {}

  static void bar2() {
    foo2(null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  private static boolean getCondition() {
    return false;
  }
}