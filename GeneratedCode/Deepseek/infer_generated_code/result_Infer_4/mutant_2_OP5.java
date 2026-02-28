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
    // MUTANT: ADDED_UNREACHABLE_SWITCH_STATEMENT
    int unreachableValue = 0;
    switch (unreachableValue) {
      case 1:
        System.out.println("This code will never be reached");
        break;
      default:
        break;
    }
  }
}