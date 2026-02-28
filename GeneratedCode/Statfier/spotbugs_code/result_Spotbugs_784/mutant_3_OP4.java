import java.io.IOException;

class GuaranteedDereference2 {
  static void f() throws IOException {}

  static int g() {
    Object x = null;
    try {
      f();
      x = new Object();
      int tmp = x.hashCode();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block in g()");
      } else {
        // Alternative block
        System.out.println("Alternative block in g()");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block in g2()");
      } else {
        // Alternative block
        System.out.println("Alternative block in g2()");
      }
    } catch (IOException e) {
      // ignore it
    }
    return x.hashCode();
  }

  private static boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}