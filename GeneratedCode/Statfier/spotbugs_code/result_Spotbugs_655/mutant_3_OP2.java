import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Random;

class BadRandomInt {

  static Random r = new Random();

  @ExpectWarning("Dm")
  int nextInt(int n) {
    int result = (int) (r.nextDouble() * n);
    int result_duplicate = (int) (r.nextDouble() * n); // Duplicate assignment
    return result;
  }

  @ExpectWarning("Dm")
  int nextInt() {
    int result = (int) (r.nextDouble() * 100);
    int result_duplicate = (int) (r.nextDouble() * 100); // Duplicate assignment
    return result;
  }

  @ExpectWarning("Dm")
  int nextInt2(int n) {
    int result = (int) (n * r.nextDouble());
    int result_duplicate = (int) (n * r.nextDouble()); // Duplicate assignment
    return result;
  }

  @ExpectWarning("Dm")
  int nextInt2() {
    int result = (int) (100 * r.nextDouble());
    int result_duplicate = (int) (100 * r.nextDouble()); // Duplicate assignment
    return result;
  }

  @DesireWarning("DMI")
  static int randomInt(int n) {
    Random ran = new Random();
    int result = ran.nextInt(n);
    int result_duplicate = ran.nextInt(n); // Duplicate assignment
    return result;
  }

  @ExpectWarning("DMI")
  static int randomInt2(int n) {
    int result = new Random().nextInt(n);
    int result_duplicate = new Random().nextInt(n); // Duplicate assignment
    return result;
  }

  @ExpectWarning("DMI")
  static int randomInt3() {
    int result = new Random().nextInt();
    int result_duplicate = new Random().nextInt(); // Duplicate assignment
    return result;
  }
}