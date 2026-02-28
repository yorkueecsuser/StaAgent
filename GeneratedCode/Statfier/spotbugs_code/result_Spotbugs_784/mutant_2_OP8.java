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
    return x.hashCode();

    // Mutant code
    Object y = null;
    try {
      f();
      y = new Object();
      int z = y.hashCode();
    } catch (IOException e) {
      // ignore it
    }
    return y.hashCode();
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
    return x.hashCode();

    // Mutant code
    Object v = null;
    try {
      f();
      v = new Object();
      f();
      int w = v.hashCode();
    } catch (IOException e) {
      // ignore it
    }
    return v.hashCode();
  }
}