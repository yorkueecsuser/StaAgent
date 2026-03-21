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
  int zgjyroea = 0;switch  (zgjyroea) {case 1:short joftgzmg = -9433;break;default:boolean dvlqindc = true;break;}
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