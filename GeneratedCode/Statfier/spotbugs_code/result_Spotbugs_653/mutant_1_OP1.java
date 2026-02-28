import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    try {
      System.out.println("Foo");
      o.close();
      String yzqjfnrj = "unusedVariable"; // Dead store
    } catch (IOException e) {
    }

    try {
      System.out.println("Foo");
      o.close();
      int kxvmbtqp = 42; // Dead store
    } catch (IOException e) {
      // Just ignore it
    }
    try {
      System.out.println("Foo");
      o.close();
      boolean lhtwrdcj = true; // Dead store
    } catch (Throwable e) {
    }
  }
}