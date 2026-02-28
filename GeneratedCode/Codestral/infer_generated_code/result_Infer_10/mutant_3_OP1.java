import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar();
  }

  public void showBug() {
    // Added dead store
    int deadStoreVar = 10; // Unused variable

    I i = new I() {
      @Override
      public void bar() {
        System.out.println("Performing non-thread-safe operation");
      }
    };
    foo(i);
  }
}