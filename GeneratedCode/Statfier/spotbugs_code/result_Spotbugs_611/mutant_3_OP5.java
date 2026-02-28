import edu.umd.cs.findbugs.annotations.ExpectWarning;

class DoNotRunAThread {

  void f(Runnable r) {
    r.run();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case is also unreachable due to the same reason
        System.out.println("This is also an unreachable case");
        break;
    }
  }

  @ExpectWarning("DMI_THREAD_PASSED_WHERE_RUNNABLE_EXPECTED")
  void g(Thread t) {
    f(t);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case is also unreachable due to the same reason
        System.out.println("This is also an unreachable case");
        break;
    }
  }

  @ExpectWarning("RU_INVOKE_RUN")
  void h(Thread t) {
    t.run();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case is also unreachable due to the same reason
        System.out.println("This is also an unreachable case");
        break;
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}