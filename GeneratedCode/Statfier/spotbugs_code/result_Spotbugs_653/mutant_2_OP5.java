import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    boolean condition = getCondition();

    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException e) {
      // Inserting unreachable switch statement
      switch (condition) {
        case true:
          System.out.println("Unreachable case");
          break;
      }
    }

    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException e) {
      // Just ignore it
      // Inserting unreachable switch statement
      switch (condition) {
        case true:
          System.out.println("Unreachable case");
          break;
      }
    }
    try {
      System.out.println("Foo");
      o.close();
    } catch (Throwable e) {
      // Inserting unreachable switch statement
      switch (condition) {
        case true:
          System.out.println("Unreachable case");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}