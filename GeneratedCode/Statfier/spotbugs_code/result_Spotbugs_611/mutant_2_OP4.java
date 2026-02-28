import edu.umd.cs.findbugs.annotations.ExpectWarning;

class DoNotRunAThread {

  void f(Runnable r) {
    r.run();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a placeholder for some code that should run if shouldRun is true
    } else {
      // This is an unreachable else block because shouldRun is always false
    }
  }

  @ExpectWarning("DMI_THREAD_PASSED_WHERE_RUNNABLE_EXPECTED")
  void g(Thread t) {
    f(t);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a placeholder for some code that should run if shouldRun is true
    } else {
      // This is an unreachable else block because shouldRun is always false
    }
  }

  @ExpectWarning("RU_INVOKE_RUN")
  void h(Thread t) {
    t.run();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a placeholder for some code that should run if shouldRun is true
    } else {
      // This is an unreachable else block because shouldRun is always false
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}