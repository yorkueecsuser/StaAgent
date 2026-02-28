import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;
import com.google.common.collect.ImmutableList;
import java.util.List;

class TwoCheckersExample {

  @Expensive
  static List shouldRaiseImmutableCastError() {
    return ImmutableList.of();
  }

  @PerformanceCritical
  static List shouldRaisePerformanceCriticalError() {
    return shouldRaiseImmutableCastError();
  }

  // Mutant code starts here
  private static boolean getUnreachableCondition() {
    return false;
  }

  static void someMethod() {
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to avoid unreachable statement error
        System.out.println("Default case.");
        break;
    }
  }
}