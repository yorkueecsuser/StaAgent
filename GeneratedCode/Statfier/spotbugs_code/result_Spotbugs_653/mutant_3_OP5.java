import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is intentionally left empty to make the switch statement unreachable
        break;
    }

    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException e) {
    }

    boolean condition2 = getCondition();
    switch (condition2) {
      case true:
        // This case is intentionally left empty to make the switch statement unreachable
        break;
    }

    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException e) {
      // Just ignore it
    }

    boolean condition3 = getCondition();
    switch (condition3) {
      case true:
        // This case is intentionally left empty to make the switch statement unreachable
        break;
    }

    try {
      System.out.println("Foo");
      o.close();
    } catch (Throwable e) {
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the switch statements unreachable
  }
}