import edu.umd.cs.findbugs.annotations.ExpectWarning;

class DoNotRunAThread {

  void f(Runnable r) {
    r.run();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will execute if shouldRun is true
    } else {
      // This is an unreachable block because shouldRun is always false
    }
  }

  @ExpectWarning("DMI_THREAD_PASSED_WHERE_RUNNABLE_EXPECTED")
  void g(Thread t) {
    f(t);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will execute if shouldRun is true
    } else {
      // This is an unreachable block because shouldRun is always false
    }
  }

  @ExpectWarning("RU_INVOKE_RUN")
  void h(Thread t) {
    t.run();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will execute if shouldRun is true
    } else {
      // This is an unreachable block because shouldRun is always false
    }
  }

  private boolean getCondition() {
    return false;
  }
}