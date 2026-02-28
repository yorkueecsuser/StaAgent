import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;
import com.google.common.collect.ImmutableList;
import java.util.List;

class TwoCheckersExample {

  @Expensive
  static List shouldRaiseImmutableCastError() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return ImmutableList.of();
  }

  @PerformanceCritical
  static List shouldRaisePerformanceCriticalError() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return shouldRaiseImmutableCastError();
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}