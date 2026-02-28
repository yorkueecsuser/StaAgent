import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    for(int i=0; i<10; i++) {
      expensive();
    }
  }
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}