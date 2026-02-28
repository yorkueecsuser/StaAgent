import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    // Insert unreachable for loop
    for (int j = 0; isUnreachable(); j++) {
      // This code is unreachable
      System.out.println("Unreachable code");
    }

    i.bar();
  }

  // Method to return false for the unreachable loop condition
  private boolean isUnreachable() {
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