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
    I j = new I() {
      @Override
      public void bar() {
        System.out.println("Performing non-thread-safe operation");
      }
    };
    foo(j); // Renaming mutant: Original variable 'i' is renamed to 'j'
  }
}