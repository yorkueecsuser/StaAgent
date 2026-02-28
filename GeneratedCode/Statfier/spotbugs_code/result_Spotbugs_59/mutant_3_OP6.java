import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  static void bar() {
    foo(null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  static void bar2() {
    foo2(null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}