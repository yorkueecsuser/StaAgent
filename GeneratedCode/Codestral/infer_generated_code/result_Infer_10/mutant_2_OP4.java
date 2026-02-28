// Import the required annotation
import com.facebook.infer.annotation.ThreadSafe;

// Define the interface I
interface I {
  void bar();
}

// Define the thread-safe class C
@ThreadSafe
class C {
  // Method to get a condition for the unreachable branch
  private boolean getCondition() {
    return false;
  }

  void foo(I i) {
    // Adding the unreachable if-else branch
    if (getCondition()) {
      // Unreachable code
      System.out.println("This line should never execute.");
    } else {
      i.bar(); // Original code
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
}