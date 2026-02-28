import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Random;

class BadRandomInt {

  static Random r = new Random();

  @ExpectWarning("Dm")
  int nextInt(int n) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
    return (int) (r.nextDouble() * n);
  }

  @ExpectWarning("Dm")
  int nextInt() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
    return (int) (r.nextDouble() * 100);
  }

  @ExpectWarning("Dm")
  int nextInt2(int n) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
    return (int) (n * r.nextDouble());
  }

  @ExpectWarning("Dm")
  int nextInt2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
    return (int) (100 * r.nextDouble());
  }

  @DesireWarning("DMI")
  static int randomInt(int n) {
    Random ran = new Random();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
    return ran.nextInt(n);
  }

  @ExpectWarning("DMI")
  static int randomInt2(int n) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
    return new Random().nextInt(n);
  }

  @ExpectWarning("DMI")
  static int randomInt3() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
    return new Random().nextInt();
  }

  private static boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined at runtime
  }
}