import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    boolean conditionWhile = getCondition();

    try {
      System.out.println("Foo");
      o.close();
      while (conditionWhile) {
        // Unreachable while loop
      }
    } catch (IOException e) {
    }

    try {
      System.out.println("Foo");
      o.close();
      while (conditionWhile) {
        // Unreachable while loop
      }
    } catch (IOException e) {
      // Just ignore it
    }
    try {
      System.out.println("Foo");
      o.close();
      while (conditionWhile) {
        // Unreachable while loop
      }
    } catch (Throwable e) {
    }
  }

  private boolean getCondition() {
    return false;
  }
}