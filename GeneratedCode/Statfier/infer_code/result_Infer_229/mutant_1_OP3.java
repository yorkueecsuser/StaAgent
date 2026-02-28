import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;
import com.google.common.collect.ImmutableList;
import java.util.List;

class TwoCheckersExample {

  @Expensive
  static List shouldRaiseImmutableCastError() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return ImmutableList.of();
  }

  @PerformanceCritical
  static List shouldRaisePerformanceCriticalError() {
    boolean condition = getCondition();
    if (condition) {
      // This is another unreachable if statement
      System.out.println("This is another unreachable statement");
    }
    return shouldRaiseImmutableCastError();
  }

  private static boolean getCondition() {
    // This method always returns false, ensuring the if blocks are unreachable
    return false;
  }
}