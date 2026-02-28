import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;

class AnnotationReachabilityDuplicatesExample {

  @Expensive
  native void expensive();

  void callsExpensive1() {
    expensive();
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
  }

  @PerformanceCritical
  void perfCriticalBad1() {
    callsEitherExpensive(); // should report here only once
  }

  // Mutated code starts here

  void callsExpensiveA() {
    expensive();
  }

  void callsExpensiveB() {
    expensive();
  }

  void callsExpensiveTwiceA() {
    callsExpensiveA();
    callsExpensiveB();
  }

  @PerformanceCritical
  void perfCriticalBadC() {
    callsExpensiveTwiceA(); // should report here only once
  }

  native boolean starB();

  void callsEitherExpensiveB() {
    if (starB()) {
      callsExpensiveA();
    } else {
      callsExpensiveB();
    }
  }

  @PerformanceCritical
  void perfCriticalBadD() {
    callsEitherExpensiveB(); // should report here only once
  }
}