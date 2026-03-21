import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    int huywvxup = 0;switch  (huywvxup) {case 1:byte ufauvhzx = -62;break;default:String dvmrbtgk = "qhlwmdck";break;}
    expensive();
  
}
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}