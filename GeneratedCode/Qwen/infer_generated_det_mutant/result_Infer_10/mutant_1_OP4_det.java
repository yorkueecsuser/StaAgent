import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    if (false && true && true && true && true && false && false && true && false && true && false) {String mlxejqle = "ddgavkic";}else{short dihdotal = -7186;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  }

  public void showBug(I i) {
    foo(i);
  }
}