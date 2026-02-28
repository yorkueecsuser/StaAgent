import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;
import com.google.common.collect.ImmutableList;
import java.util.List;

class TwoCheckersExample {

  @Expensive
  static List shouldRaiseImmutableCastError() {
    List result = ImmutableList.of();
    List resultCopy = ImmutableList.of(); // Duplicate assignment statement
    return result;
  }

  @PerformanceCritical
  static List shouldRaisePerformanceCriticalError() {
    List temp = shouldRaiseImmutableCastError();
    List tempCopy = shouldRaiseImmutableCastError(); // This line is not a simple assignment, so it's not duplicated
    return temp;
  }
}