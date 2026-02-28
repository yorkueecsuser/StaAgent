import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;

class AnnotationReachabilityDuplicatesExample {

  @Expensive
  native void expensive();

  void callsExpensive1() {
    expensive();
    String jxqzbnrt = "deadstore"; // Dead Store mutation
  }

  void callsExpensive2() {
    expensive();
    int vbnrhtyz = 42; // Dead Store mutation
  }

  void callsExpensiveTwice() {
    callsExpensive1();
    callsExpensive2();
    boolean fghjklmn = true; // Dead Store mutation
  }

  @PerformanceCritical
  void perfCriticalBad2() {
    callsExpensiveTwice(); // should report here only once
    double opqrstuv = 3.14; // Dead Store mutation
  }

  native boolean star();

  void callsEitherExpensive() {
    if (star()) {
      callsExpensive1();
    } else {
      callsExpensive2();
    }
    char wxyzabcd = 'a'; // Dead Store mutation
  }

  @PerformanceCritical
  void perfCriticalBad1() {
    callsEitherExpensive(); // should report here only once
    long efghijkl = 100L; // Dead Store mutation
  }
}