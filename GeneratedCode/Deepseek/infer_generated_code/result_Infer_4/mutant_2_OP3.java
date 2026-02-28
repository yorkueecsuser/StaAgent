import com.facebook.infer.annotation.*;

class C {
  boolean condition = false;

  @PerformanceCritical
  void perfCritical() {
    if (condition) {
        expensive();
    }
  }

  @Expensive
  void expensive() {}

  public void showBug() {
    perfCritical();
  }
}