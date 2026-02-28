import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;
import com.google.common.collect.ImmutableList;
import java.util.List;

class TwoCheckersExample {

  @Expensive
  static List shouldRaiseImmutableCastError() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should not run
      System.out.println("This is an unreachable if block");
    } else {
      // Some alternative code that should not run
      System.out.println("This is an unreachable else block");
    }
    return ImmutableList.of();
  }

  @PerformanceCritical
  static List shouldRaisePerformanceCriticalError() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should not run
      System.out.println("This is an unreachable if block in performance critical method");
    } else {
      // Some alternative code that should not run
      System.out.println("This is an unreachable else block in performance critical method");
    }
    return shouldRaiseImmutableCastError();
  }

  private static boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}