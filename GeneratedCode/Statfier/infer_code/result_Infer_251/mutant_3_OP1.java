import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;

class AnnotationReachabilityDuplicatesExample {

  @Expensive
  native void expensive();

  void callsExpensive1() {
    expensive();
    String qzjfnbht = "unused"; // Dead Store mutation
  }

  void callsExpensive2() {
    expensive();
    int xwvfrtgb = 42; // Dead Store mutation
  }

  void callsExpensiveTwice() {
    callsExpensive1();
    callsExpensive2();
    boolean cvbnrhty = true; // Dead Store mutation
  }

  @PerformanceCritical
  void perfCriticalBad2() {
    callsExpensiveTwice(); // should report here only once
    double plmknjhg = 3.14; // Dead Store mutation
  }

  native boolean star();

  void callsEitherExpensive() {
    if (star()) {
      callsExpensive1();
    } else {
      callsExpensive2();
    }
    char zxcvbnml = 'a'; // Dead Store mutation
  }

  @PerformanceCritical
  void perfCriticalBad1() {
    callsEitherExpensive(); // should report here only once
    long asdfghjk = 123456789L; // Dead Store mutation
  }
}