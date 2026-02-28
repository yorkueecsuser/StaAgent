import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }

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
    
    boolean anotherConditionWhile = getAnotherCondition();
    while (anotherConditionWhile) {
      // This loop is also unreachable
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

  private boolean getAnotherCondition() {
    return false;
  }
}