import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }

    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException e) {
    }

    boolean conditionWhile2 = getCondition();
    while (conditionWhile2) {
      // Unreachable code
    }

    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException e) {
      // Just ignore it
    }

    boolean conditionWhile3 = getCondition();
    while (conditionWhile3) {
      // Unreachable code
    }

    try {
      System.out.println("Foo");
      o.close();
    } catch (Throwable e) {
    }
  }

  private boolean getCondition() {
    return false;
  }
}