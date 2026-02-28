import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Random;

class BadRandomInt {

  static Random r = new Random();

  @ExpectWarning("Dm")
  int nextInt(int n) {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return (int) (r.nextDouble() * n);
  }

  @ExpectWarning("Dm")
  int nextInt() {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return (int) (r.nextDouble() * 100);
  }

  @ExpectWarning("Dm")
  int nextInt2(int n) {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return (int) (n * r.nextDouble());
  }

  @ExpectWarning("Dm")
  int nextInt2() {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return (int) (100 * r.nextDouble());
  }

  @DesireWarning("DMI")
  static int randomInt(int n) {
    Random ran = new Random();
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return ran.nextInt(n);
  }

  @ExpectWarning("DMI")
  static int randomInt2(int n) {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new Random().nextInt(n);
  }

  @ExpectWarning("DMI")
  static int randomInt3() {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new Random().nextInt();
  }

  // Method to provide a dynamic condition for the while loop
  private static boolean getCondition() {
    return false; // This will always return false, making the loop unreachable
  }
}