import edu.umd.cs.findbugs.annotations.ExpectWarning;

class DoNotRunAThread {

  void f(Runnable r) {
    r.run();
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never be executed
      System.out.println("This is an unreachable else block.");
    }
  }

  @ExpectWarning("DMI_THREAD_PASSED_WHERE_RUNNABLE_EXPECTED")
  void g(Thread t) {
    f(t);
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      System.out.println("This is an unreachable if block in g.");
    } else {
      // Some alternative code that will also never be executed
      System.out.println("This is an unreachable else block in g.");
    }
  }

  @ExpectWarning("RU_INVOKE_RUN")
  void h(Thread t) {
    t.run();
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      System.out.println("This is an unreachable if block in h.");
    } else {
      // Some alternative code that will also never be executed
      System.out.println("This is an unreachable else block in h.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}