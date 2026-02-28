import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;
import com.google.common.collect.ImmutableList;
import java.util.List;

class TwoCheckersExample {

  @Expensive
  static List shouldRaiseImmutableCastError() {
    return ImmutableList.of();
    // Mutant: Duplicate the return statement
    return ImmutableList.of();
  }

  @PerformanceCritical
  static List shouldRaisePerformanceCriticalError() {
    return shouldRaiseImmutableCastError();
    // Mutant: No direct assignment to duplicate, but we can duplicate the method call
    List temp = shouldRaiseImmutableCastError();
  }
}