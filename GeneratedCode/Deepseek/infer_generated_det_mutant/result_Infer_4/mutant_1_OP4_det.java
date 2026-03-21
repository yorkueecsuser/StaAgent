import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    if (true && false && false && false && false && false && false && false && true && true && false) {boolean xjczlylr = true;}else{long jfagrcsi = 348379531;}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}