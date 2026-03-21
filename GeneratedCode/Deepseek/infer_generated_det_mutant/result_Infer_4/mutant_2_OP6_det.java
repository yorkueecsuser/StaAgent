import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    for  (int fkesdrfw = 0; fkesdrfw < 0; fkesdrfw++) {int kurllwpv = 682162375;}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}