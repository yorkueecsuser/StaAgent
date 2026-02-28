import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // RacerD warns here - BUG: INTERFACE_NOT_THREAD_SAFE
    unreachableSwitchStatement();
  }

  private void unreachableSwitchStatement() {
    int value = getValue();
    switch(value) {
      case 1: // This case will never be reached as getValue() returns a value other than 1
        System.out.println("Unreachable code");
        break;
    }
  }

  private int getValue() {
    return 0; // Always returns a value other than 1 to make the switch statement unreachable
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