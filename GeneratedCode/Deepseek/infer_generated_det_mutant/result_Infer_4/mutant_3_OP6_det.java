import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    for  (int uabtykrl = 0; uabtykrl < 0; uabtykrl++) {char yryqqzyc = 'y';}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}