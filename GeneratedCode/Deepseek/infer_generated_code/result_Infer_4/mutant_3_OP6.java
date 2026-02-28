import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    expensive();
  }
  @Expensive
  void expensive() {}

  boolean getCondition() {
    return false;
  }

  public void showBug() {
    perfCritical();

    // Unreachable for loop
    for (int i = 0; getCondition(); i++) {
      // do nothing
    }
  }
}