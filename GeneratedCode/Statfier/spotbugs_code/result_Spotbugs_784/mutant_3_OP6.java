import java.io.IOException;

class GuaranteedDereference2 {
  static void f() throws IOException {}

  static int g() {
    Object x = null;
    try {
      f();
      x = new Object();
      int tmp = x.hashCode();
      // Mutant: Inserting unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable code
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
      // Mutant: Inserting unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable code
      }
    } catch (IOException e) {
      // ignore it
    }
    return x.hashCode();
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}