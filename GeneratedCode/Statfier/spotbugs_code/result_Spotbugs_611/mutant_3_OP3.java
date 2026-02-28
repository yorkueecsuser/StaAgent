import edu.umd.cs.findbugs.annotations.ExpectWarning;

class DoNotRunAThread {

  void f(Runnable r) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an unreachable statement in f");
    }
    r.run();
  }

  @ExpectWarning("DMI_THREAD_PASSED_WHERE_RUNNABLE_EXPECTED")
  void g(Thread t) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an unreachable statement in g");
    }
    f(t);
  }

  @ExpectWarning("RU_INVOKE_RUN")
  void h(Thread t) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an unreachable statement in h");
    }
    t.run();
  }

  private boolean getCondition() {
    return false;
  }
}