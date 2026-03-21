import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    if (false && false && false && true && false && true && true && false && true && false && false) {short qdzvcdmr = 8186;}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}