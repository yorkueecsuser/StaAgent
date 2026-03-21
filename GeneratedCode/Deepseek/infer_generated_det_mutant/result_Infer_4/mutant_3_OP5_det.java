import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    int mnnxyvkm = 0;switch  (mnnxyvkm) {case 1:long rufjbgxc = -505432352;break;default:int ycoolelj = -503982325;break;}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}