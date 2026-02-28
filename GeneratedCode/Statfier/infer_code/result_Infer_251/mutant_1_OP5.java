import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;

class AnnotationReachabilityDuplicatesExample {

  @Expensive
  native void expensive();

  void callsExpensive1() {
    expensive();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition will never be true
        System.out.println("This is an unreachable case");
        break;
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition will never be true
        System.out.println("This is another unreachable case");
        break;
    }
  }

  @PerformanceCritical
  void perfCriticalBad1() {
    callsEitherExpensive(); // should report here only once
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}