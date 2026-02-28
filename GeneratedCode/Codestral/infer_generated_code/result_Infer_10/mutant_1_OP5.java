import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // RacerD warns here - BUG: INTERFACE_NOT_THREAD_SAFE

    // Adding an unreachable switch statement
    int value = getValue();
    switch (value) {
      case 1:
        // This code will never be executed
        System.out.println("Unreachable code");
        break;
    }
  }

  // Method to simulate dynamic value generation
  private int getValue() {
    return 0; // Always return 0 to make the switch unreachable
  }

  // Public method to demonstrate the bug and the unreachable switch statement
  public void showBug() {
    I i = new I() {
      @Override
      public void bar() {
        // Some non-thread-safe operation
        System.out.println("Performing non-thread-safe operation");
      }
    };
    foo(i);
  }
}