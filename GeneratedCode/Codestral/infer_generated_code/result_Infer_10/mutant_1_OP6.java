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
        // Add unreachable for loop
        boolean conditionFor = false;
        for (int j = 0; conditionFor; j++) {
          // This code is unreachable
          System.out.println("This is an unreachable loop.");
        }
        // Some non-thread-safe operation
        System.out.println("Performing non-thread-safe operation");
      }
    };
    foo(i);
  }
}