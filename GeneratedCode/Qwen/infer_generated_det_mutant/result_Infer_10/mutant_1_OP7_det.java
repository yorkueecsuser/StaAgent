import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    boolean ioetoeht = false;while (ioetoeht && true && false && false && false && true && false && false && true && true && true && false) {String ioipnnbb = "klvsobqk";}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  }

  public void showBug(I i) {
    foo(i);
  }
}