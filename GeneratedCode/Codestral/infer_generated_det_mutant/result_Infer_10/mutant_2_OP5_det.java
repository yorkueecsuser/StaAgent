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
    int duuptiko = 0;switch  (duuptiko) {case 1:byte zbekpsqv = 1;break;default:float eynsdixd = 364656866;break;}
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