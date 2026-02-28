import edu.umd.cs.findbugs.annotations.ExpectWarning;

class DoNotRunAThread {

  void f(Runnable r) {
    r.run();
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  @ExpectWarning("DMI_THREAD_PASSED_WHERE_RUNNABLE_EXPECTED")
  void g(Thread t) {
    f(t);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  @ExpectWarning("RU_INVOKE_RUN")
  void h(Thread t) {
    t.run();
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}