import java.io.IOException;

class GuaranteedDereference2 {
  static void f() throws IOException {}

  static int g() {
    Object x = null;
    try {
      f();
      x = new Object();
      int tmp = x.hashCode();
    } catch (IOException e) {
      // ignore it
    }
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable
        System.out.println("This will never be printed");
        break;
    }
    return x.hashCode();
  }

  static int g2() {
    Object x = null;
    try {
      f();
      x = new Object();
      f();
      int tmp = x.hashCode();
    } catch (IOException e) {
      // ignore it
    }
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable
        System.out.println("This will never be printed");
        break;
    }
    return x.hashCode();
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}