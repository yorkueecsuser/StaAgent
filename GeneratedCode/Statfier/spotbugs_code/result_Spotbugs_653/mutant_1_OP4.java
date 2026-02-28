import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    boolean condition = getCondition();

    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException e) {
      if (condition) {
        // This block is reachable based on the condition
      } else {
        // This block is unreachable if condition is always true
        System.out.println("Unreachable else block 1");
      }
    }

    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException e) {
      // Just ignore it
      if (condition) {
        // This block is reachable based on the condition
      } else {
        // This block is unreachable if condition is always true
        System.out.println("Unreachable else block 2");
      }
    }
    try {
      System.out.println("Foo");
      o.close();
    } catch (Throwable e) {
      if (condition) {
        // This block is reachable based on the condition
      } else {
        // This block is unreachable if condition is always true
        System.out.println("Unreachable else block 3");
      }
    }
  }

  private boolean getCondition() {
    return true; // This can be set to any logic that determines the condition at runtime
  }
}