import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    try {
      System.out.println("Foo");
      o.close();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
      } else {
        // This block is unreachable if shouldRun is false
      }
    } catch (IOException e) {
    }

    try {
      System.out.println("Foo");
      o.close();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
      } else {
        // This block is unreachable if shouldRun is false
      }
    } catch (IOException e) {
      // Just ignore it
    }
    try {
      System.out.println("Foo");
      o.close();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
      } else {
        // This block is unreachable if shouldRun is false
      }
    } catch (Throwable e) {
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}