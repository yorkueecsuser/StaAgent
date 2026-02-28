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
  // RENAMING MUTANT: Renaming variable "perfCritical" to "x"
  void x() {
    expensive();
  }
  // RENAMING MUTANT: Renaming variable "showBug" to "y"
  public void y() {
    x();
  }
}