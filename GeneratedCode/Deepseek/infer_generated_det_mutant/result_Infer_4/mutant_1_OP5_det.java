import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    int lzqgxlva = 0;switch  (lzqgxlva) {case 1:long etunqrul = -308901891;break;default:boolean pgbukrrx = false;break;}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}