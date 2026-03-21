import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    short qdxgqbep = 5550;
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}