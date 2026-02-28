// Import the required annotation
import com.facebook.infer.annotation.ThreadSafe;

// Define the interface I
interface I {
  void bar();
}

// Define the thread-safe class C
@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // RacerD warns here - BUG: INTERFACE_NOT_THREAD_SAFE
    // Adding unreachable switch statement mutant
    boolean condition = false;
    int value = 0;
    if(condition) {
      switch(value) {
        case 1:
          // This code will never be executed
          System.out.println("Unreachable code");
          break;
      }
    }
  }

  // Public method to demonstrate the bug
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

  // Added this method to return the condition for the unreachable switch statement
  private static boolean getCondition() {
    return false;
  }
}