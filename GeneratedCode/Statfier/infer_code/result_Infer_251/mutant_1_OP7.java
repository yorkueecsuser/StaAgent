import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;

class AnnotationReachabilityDuplicatesExample {

  @Expensive
  native void expensive();

  void callsExpensive1() {
    expensive();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  void callsExpensive2() {
    expensive();
  }

  void callsExpensiveTwice() {
    callsExpensive1();
    callsExpensive2();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Another unreachable while loop
    }
  }

  @PerformanceCritical
  void perfCriticalBad2() {
    callsExpensiveTwice(); // should report here only once
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Yet another unreachable while loop
    }
  }

  native boolean star();

  void callsEitherExpensive() {
    if (star()) {
      callsExpensive1();
    } else {
      callsExpensive2();
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop in else branch
    }
  }

  @PerformanceCritical
  void perfCriticalBad1() {
    callsEitherExpensive(); // should report here only once
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Final unreachable while loop
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}