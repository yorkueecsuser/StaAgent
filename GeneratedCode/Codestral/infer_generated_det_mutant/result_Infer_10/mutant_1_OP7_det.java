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
    boolean bgziyoqx = false;while (bgziyoqx && true && false && true && false && true && true && false && true && true && true && false) {double ndflbcvj = -113407181;}
    i.bar(); // RacerD warns here - BUG: INTERFACE_NOT_THREAD_SAFE
  
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