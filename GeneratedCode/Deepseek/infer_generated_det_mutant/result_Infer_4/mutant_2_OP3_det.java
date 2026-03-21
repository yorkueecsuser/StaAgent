import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    if (true && false && false && false && true && true && false && false && false && true && false) {float brlgmjdw = 905158672;}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}