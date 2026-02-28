import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;

class AnnotationReachabilityDuplicatesExample {

  @Expensive
  native void expensive();

  void callsExpensive1() {
    expensive();
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void callsExpensive2() {
    expensive();
  }

  void callsExpensiveTwice() {
    callsExpensive1();
    callsExpensive2();
  }

  @PerformanceCritical
  void perfCriticalBad2() {
    callsExpensiveTwice(); // should report here only once
  }

  native boolean star();

  void callsEitherExpensive() {
    if (star()) {
      callsExpensive1();
    } else {
      callsExpensive2();
    }
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @PerformanceCritical
  void perfCriticalBad1() {
    callsEitherExpensive(); // should report here only once
  }

  // Method to provide dynamic condition for the for loop
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}