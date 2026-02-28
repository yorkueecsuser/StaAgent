import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    expensive();
  }
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }

  // Mutated Code:
  boolean alwaysFalse() {
    return false;
  }

  void showMutant() {
    if (alwaysFalse()) {
      System.out.println("This is an unreachable code");
    } else {
      perfCritical();
    }
  }
}