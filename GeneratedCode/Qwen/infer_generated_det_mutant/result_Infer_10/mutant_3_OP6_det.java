import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    for  (int ucfzqdpn = 0; ucfzqdpn < 0; ucfzqdpn++) {long hnrwvvff = -680356762;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  }

  public void showBug(I i) {
    foo(i);
  }
}