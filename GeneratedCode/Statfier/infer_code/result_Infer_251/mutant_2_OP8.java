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

  // Mutant 1: Renaming 'expensive' to 'a'
  @Expensive
  native void a();

  void b() {
    a();
  }

  void c() {
    a();
  }

  void d() {
    b();
    c();
  }

  @PerformanceCritical
  void e() {
    d(); // should report here only once
  }

  native boolean f();

  void g() {
    if (f()) {
      b();
    } else {
      c();
    }
  }

  @PerformanceCritical
  void h() {
    g(); // should report here only once
  }
}