import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    int cmtamdlf = 154037250;
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}

  public void showBug(I i) {
    foo(i);
  }
}