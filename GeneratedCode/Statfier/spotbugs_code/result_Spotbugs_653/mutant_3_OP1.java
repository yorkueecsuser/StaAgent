import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    try {
      System.out.println("Foo");
      o.close();
      String yvghjklm = "unused"; // Dead store
    } catch (IOException e) {
    }

    try {
      System.out.println("Foo");
      o.close();
      int abcdefgh = 123; // Dead store
    } catch (IOException e) {
      // Just ignore it
    }
    try {
      System.out.println("Foo");
      o.close();
      double wxyzqrst = 3.14; // Dead store
    } catch (Throwable e) {
    }
  }
}