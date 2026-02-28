import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Random;

class BadRandomInt {

  static Random r = new Random();

  @ExpectWarning("Dm")
  int nextInt(int n) {
    return (int) (r.nextDouble() * n);
    int temp = (int) (r.nextDouble() * n); // Mutant: duplicated assignment
  }

  @ExpectWarning("Dm")
  int nextInt() {
    return (int) (r.nextDouble() * 100);
    int temp = (int) (r.nextDouble() * 100); // Mutant: duplicated assignment
  }

  @ExpectWarning("Dm")
  int nextInt2(int n) {
    return (int) (n * r.nextDouble());
    int temp = (int) (n * r.nextDouble()); // Mutant: duplicated assignment
  }

  @ExpectWarning("Dm")
  int nextInt2() {
    return (int) (100 * r.nextDouble());
    int temp = (int) (100 * r.nextDouble()); // Mutant: duplicated assignment
  }

  @DesireWarning("DMI")
  static int randomInt(int n) {
    Random ran = new Random();
    return ran.nextInt(n);
    int temp = ran.nextInt(n); // Mutant: duplicated assignment
  }

  @ExpectWarning("DMI")
  static int randomInt2(int n) {
    return new Random().nextInt(n);
    int temp = new Random().nextInt(n); // Mutant: duplicated assignment
  }

  @ExpectWarning("DMI")
  static int randomInt3() {
    return new Random().nextInt();
    int temp = new Random().nextInt(); // Mutant: duplicated assignment
  }
}