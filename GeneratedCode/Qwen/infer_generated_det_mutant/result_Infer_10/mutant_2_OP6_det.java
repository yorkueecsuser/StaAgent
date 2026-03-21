import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    for  (int pyfxjjfe = 0; pyfxjjfe < 0; pyfxjjfe++) {short sqyevdrt = -1327;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}

  public void showBug(I i) {
    foo(i);
  }
}