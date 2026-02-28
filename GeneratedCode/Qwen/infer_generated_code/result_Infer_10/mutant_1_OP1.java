import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    String qvbnrhty = "unused"; // Dead Store mutation
  }

  public void showBug(I i) {
    foo(i);
    int kxjvflqz = 42; // Dead Store mutation
  }
}