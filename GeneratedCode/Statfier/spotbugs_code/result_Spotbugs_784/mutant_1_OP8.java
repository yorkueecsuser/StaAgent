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
  }

  // Mutated code for g method
  static int g_mutated() {
    Object y = null;
    try {
      f();
      y = new Object();
      int q = y.hashCode();
    } catch (IOException e) {
      // ignore it
    }
    return y.hashCode();
  }

  // Mutated code for g2 method
  static int g2_mutated() {
    Object z = null;
    try {
      f();
      z = new Object();
      f();
      int r = z.hashCode();
    } catch (IOException e) {
      // ignore it
    }
    return z.hashCode();
  }
}