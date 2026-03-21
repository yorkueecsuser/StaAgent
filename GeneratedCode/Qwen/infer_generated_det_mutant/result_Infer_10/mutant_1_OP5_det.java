import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    int egvfqsur = 0;switch  (egvfqsur) {case 1:double wwotlflm = -543160129;break;default:String hdrkzdgf = "jzcloqkd";break;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}

  public void showBug(I i) {
    foo(i);
  }
}