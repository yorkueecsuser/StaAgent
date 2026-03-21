import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    if (true && false && false && false && true && false && true && false && true && true && false) {byte afxidxho = 35;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  }

  public void showBug(I i) {
    foo(i);
  }
}