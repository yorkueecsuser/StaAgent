import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
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

    // Mutated code
    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException a) {
    }

    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException b) {
      // Just ignore it
    }
    try {
      System.out.println("Foo");
      o.close();
    } catch (Throwable c) {
    }
  }
}