import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    expensive();
  }
  @Expensive
  void expensive() {}

  // Mutated Java code
  @PerformanceCritical
  void perfCriticalMutant() {
    expensive();
    if (false) { // Unreachable if statement
      // empty block
    }
  }

  public void showBug() {
    perfCriticalMutant();
  }
}