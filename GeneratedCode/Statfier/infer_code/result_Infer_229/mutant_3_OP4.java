import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;
import com.google.common.collect.ImmutableList;
import java.util.List;

class TwoCheckersExample {

  @Expensive
  static List shouldRaiseImmutableCastError() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch.");
    }
    return ImmutableList.of();
  }

  @PerformanceCritical
  static List shouldRaisePerformanceCriticalError() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is another unreachable else branch.");
    }
    return shouldRaiseImmutableCastError();
  }

  private static boolean getCondition() {
    // This method should return a condition that is dynamically determined at runtime
    return false; // In a real scenario, this could be a dynamic condition
  }
}