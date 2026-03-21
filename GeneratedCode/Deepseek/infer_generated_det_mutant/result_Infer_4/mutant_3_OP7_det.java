import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    boolean ilpxzsvw = false;while (ilpxzsvw && false && true && true && true && false && false && true && true && false && true && false) {char lrkcldsr = 'l';}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}