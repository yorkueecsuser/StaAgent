import edu.umd.cs.findbugs.annotations.ExpectWarning;

class DoNotRunAThread {

  void f(Runnable r) {
    r.run();
    String jxvqbnfr = "unusedVariable"; // Dead store mutation
  }

  @ExpectWarning("DMI_THREAD_PASSED_WHERE_RUNNABLE_EXPECTED")
  void g(Thread t) {
    f(t);
    int kltmnpqr = 42; // Dead store mutation
  }

  @ExpectWarning("RU_INVOKE_RUN")
  void h(Thread t) {
    t.run();
    boolean wxyzabcd = true; // Dead store mutation
  }
}