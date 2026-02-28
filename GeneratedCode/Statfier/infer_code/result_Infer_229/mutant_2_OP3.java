import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;
import com.google.common.collect.ImmutableList;
import java.util.List;

class TwoCheckersExample {

  @Expensive
  static List shouldRaiseImmutableCastError() {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable block.");
    }
    return ImmutableList.of();
  }

  @PerformanceCritical
  static List shouldRaisePerformanceCriticalError() {
    // Inserting another unreachable if statement
    boolean condition = getAnotherCondition();
    if (condition) {
      // This block is unreachable because getAnotherCondition() will never return true
      System.out.println("This is another unreachable block.");
    }
    return shouldRaiseImmutableCastError();
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }

  // Another method to provide a dynamic condition that is always false
  private static boolean getAnotherCondition() {
    return false;
  }
}