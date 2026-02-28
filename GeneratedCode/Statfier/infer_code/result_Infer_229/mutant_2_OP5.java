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

  // Added mutant code for Unreachable switch statement
  static void someMethod() {
    boolean condition = getCondition();
    switch (getValue()) {
      case 1:
        // This case is reachable if getValue() returns 1
        break;
      default:
        // This default case is reachable if getValue() does not return 1
        break;
    }

    // Unreachable switch statement
    switch (condition? 0 : getValue()) {
      case 2:
        // This case is unreachable because condition? 0 : getValue() will never be 2
        System.out.println("This is an unreachable case.");
        break;
      case 3:
        // This case is also unreachable for the same reason
        System.out.println("Another unreachable case.");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }

  private static int getValue() {
    return 1;
  }
}