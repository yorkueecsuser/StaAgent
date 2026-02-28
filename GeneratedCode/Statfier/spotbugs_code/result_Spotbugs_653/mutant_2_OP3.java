import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    try {
      System.out.println("Foo");
      o.close();
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable if statement
        System.out.println("This will never be printed");
      }
    } catch (IOException e) {
    }

    try {
      System.out.println("Foo");
      o.close();
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable if statement
        System.out.println("This will never be printed either");
      }
    } catch (IOException e) {
      // Just ignore it
    }
    try {
      System.out.println("Foo");
      o.close();
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable if statement
        System.out.println("This will also never be printed");
      }
    } catch (Throwable e) {
    }
  }

  private boolean getCondition() {
    return false;
  }
}