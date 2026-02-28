import java.io.IOException;
import java.io.OutputStream;

class IgnoredException {

  void foo(OutputStream o) {
    try {
      System.out.println("Foo");
      o.close();
    } catch (IOException e) {
    }

    // Duplicate of the first try-catch block
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
    // Duplicate of the second try-catch block
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
    // Duplicate of the third try-catch block
    try {
      System.out.println("Foo");
      o.close();
    } catch (Throwable e) {
    }
  }
}