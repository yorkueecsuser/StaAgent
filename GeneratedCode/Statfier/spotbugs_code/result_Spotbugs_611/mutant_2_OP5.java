import edu.umd.cs.findbugs.annotations.ExpectWarning;

class DoNotRunAThread {

  void f(Runnable r) {
    r.run();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // This is the only reachable case
        break;
    }
  }

  @ExpectWarning("DMI_THREAD_PASSED_WHERE_RUNNABLE_EXPECTED")
  void g(Thread t) {
    f(t);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // This is the only reachable case
        break;
    }
  }

  @ExpectWarning("RU_INVOKE_RUN")
  void h(Thread t) {
    t.run();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // This is the only reachable case
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}