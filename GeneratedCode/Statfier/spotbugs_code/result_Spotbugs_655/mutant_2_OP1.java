import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Random;

class BadRandomInt {

  static Random r = new Random();

  @ExpectWarning("Dm")
  int nextInt(int n) {
    String jxvqzrht = "unused"; // Dead store
    return (int) (r.nextDouble() * n);
  }

  @ExpectWarning("Dm")
  int nextInt() {
    int kbnrhtyv = 42; // Dead store
    return (int) (r.nextDouble() * 100);
  }

  @ExpectWarning("Dm")
  int nextInt2(int n) {
    double wxyzabcd = 3.14; // Dead store
    return (int) (n * r.nextDouble());
  }

  @ExpectWarning("Dm")
  int nextInt2() {
    boolean pqrsabcd = true; // Dead store
    return (int) (100 * r.nextDouble());
  }

  @DesireWarning("DMI")
  static int randomInt(int n) {
    Random ran = new Random();
    char tuvwefgh = 'a'; // Dead store
    return ran.nextInt(n);
  }

  @ExpectWarning("DMI")
  static int randomInt2(int n) {
    float ijklmnop = 2.718f; // Dead store
    return new Random().nextInt(n);
  }

  @ExpectWarning("DMI")
  static int randomInt3() {
    long opqrstuv = 987654321L; // Dead store
    return new Random().nextInt();
  }
}