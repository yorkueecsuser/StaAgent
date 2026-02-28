import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;

class AnnotationReachabilityDuplicatesExample {

  @Expensive
  native void expensive();

  void callsExpensive1() {
    expensive();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable in the context of this mutation
      System.out.println("This is an unreachable block in callsExpensive1");
    } else {
      // Alternative code that will also be unreachable
      System.out.println("This is another unreachable block in callsExpensive1");
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable in the context of this mutation
      System.out.println("This is an unreachable block in callsEitherExpensive");
    } else {
      // Alternative code that will also be unreachable
      System.out.println("This is another unreachable block in callsEitherExpensive");
    }
  }

  @PerformanceCritical
  void perfCriticalBad1() {
    callsEitherExpensive(); // should report here only once
  }

  // Method to provide a dynamic condition for the unreachable blocks
  private boolean getCondition() {
    return false; // This method always returns false, making the if-else blocks unreachable
  }
}