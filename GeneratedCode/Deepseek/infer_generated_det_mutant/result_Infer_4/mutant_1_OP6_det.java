import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    for  (int atjdczsl = 0; atjdczsl < 0; atjdczsl++) {boolean iunrvkpu = true;}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}