import edu.umd.cs.findbugs.annotations.ExpectWarning;

class DoNotRunAThread {

  void f(Runnable r) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code block
      System.out.println("This is an unreachable block in f method.");
    }
    r.run();
  }

  @ExpectWarning("DMI_THREAD_PASSED_WHERE_RUNNABLE_EXPECTED")
  void g(Thread t) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code block
      System.out.println("This is an unreachable block in g method.");
    }
    f(t);
  }

  @ExpectWarning("RU_INVOKE_RUN")
  void h(Thread t) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code block
      System.out.println("This is an unreachable block in h method.");
    }
    t.run();
  }

  private boolean getCondition() {
    return false;
  }
}