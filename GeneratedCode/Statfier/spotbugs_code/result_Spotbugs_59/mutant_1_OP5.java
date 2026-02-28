import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {}

  static void bar() {
    foo(null);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {}

  static void bar2() {
    foo2(null);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is also unreachable");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}