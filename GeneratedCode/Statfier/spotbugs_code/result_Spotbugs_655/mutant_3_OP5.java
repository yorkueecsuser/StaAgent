import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Random;

class BadRandomInt {

  static Random r = new Random();

  @ExpectWarning("Dm")
  int nextInt(int n) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        System.out.println("This is an unreachable case.");
        break;
    }
    return (int) (r.nextDouble() * n);
  }

  @ExpectWarning("Dm")
  int nextInt() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        System.out.println("This is an unreachable case.");
        break;
    }
    return (int) (r.nextDouble() * 100);
  }

  @ExpectWarning("Dm")
  int nextInt2(int n) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        System.out.println("This is an unreachable case.");
        break;
    }
    return (int) (n * r.nextDouble());
  }

  @ExpectWarning("Dm")
  int nextInt2() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        System.out.println("This is an unreachable case.");
        break;
    }
    return (int) (100 * r.nextDouble());
  }

  @DesireWarning("DMI")
  static int randomInt(int n) {
    Random ran = new Random();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        System.out.println("This is an unreachable case.");
        break;
    }
    return ran.nextInt(n);
  }

  @ExpectWarning("DMI")
  static int randomInt2(int n) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        System.out.println("This is an unreachable case.");
        break;
    }
    return new Random().nextInt(n);
  }

  @ExpectWarning("DMI")
  static int randomInt3() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        System.out.println("This is an unreachable case.");
        break;
    }
    return new Random().nextInt();
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}