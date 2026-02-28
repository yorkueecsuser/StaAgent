import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;
import com.google.common.collect.ImmutableList;
import java.util.List;

class TwoCheckersExample {

  @Expensive
  static List shouldRaiseImmutableCastError() {
    String qzjfnxrb = "unusedVariable";
    return ImmutableList.of();
  }

  @PerformanceCritical
  static List shouldRaisePerformanceCriticalError() {
    int wvgytkpm = 42;
    return shouldRaiseImmutableCastError();
  }
}