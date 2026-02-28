import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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