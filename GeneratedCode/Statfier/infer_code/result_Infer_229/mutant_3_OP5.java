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

  // Introduced mutant: Unreachable switch statement
  static void introduceUnreachableSwitch() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // This will always evaluate to 1, making the switch statement effectively unreachable
      case 0:
        System.out.println("This is unreachable code.");
        break;
      default:
        // Default case to avoid compiler warning about missing switch branches
        break;
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}