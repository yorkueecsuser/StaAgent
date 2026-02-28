import java.io.IOException;

class GuaranteedDereference2 {
  static void f() throws IOException {}

  static int g() {
    Object x = null;
    try {
      f();
      x = new Object();
      int tmp = x.hashCode();
      // Dead Store Mutation
      String qwertyui = "unused";
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
      // Dead Store Mutation
      int asdfghjk = 42;
    } catch (IOException e) {
      // ignore it
    }
    return x.hashCode();
  }
}