import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Random;

class BadRandomInt {

  static Random r = new Random();

  @ExpectWarning("Dm")
  int nextInt(int n) {
    boolean shouldRun = false; // This will ensure the if-else is unreachable but not a compile-time constant
    if (shouldRun) {
      return -1; // Unreachable code
    } else {
      return (int) (r.nextDouble() * n);
    }
  }

  @ExpectWarning("Dm")
  int nextInt() {
    boolean shouldRun = false; // This will ensure the if-else is unreachable but not a compile-time constant
    if (shouldRun) {
      return -1; // Unreachable code
    } else {
      return (int) (r.nextDouble() * 100);
    }
  }

  @ExpectWarning("Dm")
  int nextInt2(int n) {
    boolean shouldRun = false; // This will ensure the if-else is unreachable but not a compile-time constant
    if (shouldRun) {
      return -1; // Unreachable code
    } else {
      return (int) (n * r.nextDouble());
    }
  }

  @ExpectWarning("Dm")
  int nextInt2() {
    boolean shouldRun = false; // This will ensure the if-else is unreachable but not a compile-time constant
    if (shouldRun) {
      return -1; // Unreachable code
    } else {
      return (int) (100 * r.nextDouble());
    }
  }

  @DesireWarning("DMI")
  static int randomInt(int n) {
    Random ran = new Random();
    boolean shouldRun = false; // This will ensure the if-else is unreachable but not a compile-time constant
    if (shouldRun) {
      return -1; // Unreachable code
    } else {
      return ran.nextInt(n);
    }
  }

  @ExpectWarning("DMI")
  static int randomInt2(int n) {
    boolean shouldRun = false; // This will ensure the if-else is unreachable but not a compile-time constant
    if (shouldRun) {
      return -1; // Unreachable code
    } else {
      return new Random().nextInt(n);
    }
  }

  @ExpectWarning("DMI")
  static int randomInt3() {
    boolean shouldRun = false; // This will ensure the if-else is unreachable but not a compile-time constant
    if (shouldRun) {
      return -1; // Unreachable code
    } else {
      return new Random().nextInt();
    }
  }
}