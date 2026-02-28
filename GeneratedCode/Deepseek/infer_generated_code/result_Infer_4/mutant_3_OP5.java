import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    expensive();
  }
  @Expensive
  void expensive() {
    // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
  }

  public void showBug() {
    perfCritical();
  }

  public void unreachableSwitchStatement() {
    int value = getValue();
    switch(value) {
      case 1:
        // do something
        break;
      case 2:
        // do something
        break;
      default:
        // do nothing
        break;
    }
  }

  // Assuming getValue() method is defined to return 0 or 1 or 2
  int getValue() {
    return 0; // Compile-time constant
  }
}