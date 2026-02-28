import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    }

    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException e) {
    }

    boolean anotherCondition = getAnotherCondition();
    if (anotherCondition) {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }

    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException e) {
      // Just ignore it
    }

    boolean yetAnotherCondition = getYetAnotherCondition();
    if (yetAnotherCondition) {
      // Yet another unreachable code
      System.out.println("This is yet another unreachable");
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

  private boolean getYetAnotherCondition() {
    return false;
  }
}