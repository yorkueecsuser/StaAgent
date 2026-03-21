import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    boolean efwezkfc = false;while (efwezkfc && true && false && true && false && true && false && true && true && true && true && false) {int xmhxcpaq = 450544860;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}

  public void showBug(I i) {
    foo(i);
  }
}