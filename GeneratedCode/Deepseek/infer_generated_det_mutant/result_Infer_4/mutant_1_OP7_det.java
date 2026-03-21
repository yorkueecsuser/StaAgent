import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    boolean dozzbyko = false;while (dozzbyko && true && false && true && false && false && false && false && true && false && true && false) {String nhtbqrip = "njcqpwtu";}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}