import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    // Mutated code: This for loop is replaced with equivalent do-while loop
    int i = 0;
    do {
      expensive();
      i++;
    } while (i < 10);
  }

  @Expensive
  void expensive() {}

  public void showBug() {
    perfCritical();
  }
}