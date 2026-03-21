import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    boolean mtqhpopo = false;while (mtqhpopo && true && false && false && false && false && true && false && false && false && false && false) {boolean mogpyuih = false;}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}