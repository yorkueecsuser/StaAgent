import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    expensive();
  }
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
    int value = getValue();
    switch(value) {
      case 0:
      case 2:
      break;
      default:
      break;
    }
  }
  private int getValue() {
    return 1;
  }
}