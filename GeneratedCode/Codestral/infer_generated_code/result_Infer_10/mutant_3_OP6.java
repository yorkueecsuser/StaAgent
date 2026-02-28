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
  }

  // Public method to demonstrate the bug
  public void showBug() {
    I i = new I() {
      @Override
      public void bar() {
        // Some non-thread-safe operation
        System.out.println("Performing non-thread-safe operation");

        // Inserted unreachable for loop
        boolean conditionFor = false;
        for (int j = 0; conditionFor; j++) {
          // This code will never be executed
          System.out.println("This is an unreachable statement");
        }
      }
    };
    foo(i);
  }

  // Method to dynamically determine the condition for the loop
  private boolean getCondition() {
    return false;
  }
}