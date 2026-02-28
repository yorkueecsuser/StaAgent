import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    boolean condition = getCondition();

    try {
      System.out.println("Foo");
      o.close();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement");
      }
    } catch (IOException e) {
    }

    try {
      System.out.println("Foo");
      o.close();
      if (condition) {
        // Unreachable code
        System.out.println("This is another unreachable if statement");
      }
    } catch (IOException e) {
      // Just ignore it
    }
    try {
      System.out.println("Foo");
      o.close();
      if (condition) {
        // Unreachable code
        System.out.println("Yet another unreachable if statement");
      }
    } catch (Throwable e) {
    }
  }

  private boolean getCondition() {
    return false;
  }
}