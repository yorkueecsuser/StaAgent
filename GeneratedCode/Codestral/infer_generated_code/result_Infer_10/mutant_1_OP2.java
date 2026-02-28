import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar();
    i.bar(); // Mutant: Duplicating the assignment statement
  }

  public void showBug() {
    I i = new I() {
      @Override
      public void bar() {
        System.out.println("Performing non-thread-safe operation");
      }
    };
    foo(i);
  }
}