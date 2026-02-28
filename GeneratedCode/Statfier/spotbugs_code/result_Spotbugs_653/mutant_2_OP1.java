import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    try {
      System.out.println("Foo");
      o.close();
      String qzjxmtkp = "unused"; // Dead store mutation
    } catch (IOException e) {
    }

    try {
      System.out.println("Foo");
      o.close();
      int rhtybnml = 42; // Dead store mutation
    } catch (IOException e) {
      // Just ignore it
    }
    try {
      System.out.println("Foo");
      o.close();
      double wvutsrqp = 3.14; // Dead store mutation
    } catch (Throwable e) {
    }
  }
}