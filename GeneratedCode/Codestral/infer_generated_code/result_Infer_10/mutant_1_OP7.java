import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    // Inserting unreachable while loop
    while (getUnreachableCondition()) {
      // This code is unreachable
    }
    i.bar();
  }

  // Method that returns false
  private boolean getUnreachableCondition() {
    return false;
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