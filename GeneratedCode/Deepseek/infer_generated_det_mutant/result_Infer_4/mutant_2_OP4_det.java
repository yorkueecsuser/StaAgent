import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    if (false && false && true && false && true && true && true && false && false && true && false) {double bdgmjbjn = 711789131;}else{long iwqkisey = -659173485;}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}