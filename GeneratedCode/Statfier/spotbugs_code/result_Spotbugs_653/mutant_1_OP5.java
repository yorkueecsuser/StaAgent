import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException e) {
    }

    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException e) {
      // Just ignore it
    }
    try {
      System.out.println("Foo");
      o.close();
    } catch (Throwable e) {
    }

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is always executed
        System.out.println("This will always be printed");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}