import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    if (true && false && true && true && false && false && true && true && false && false && false) {short rxdzysgb = -2944;}else{double vxlupvfb = -622982396;}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}