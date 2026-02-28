import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Random;

class BadRandomInt {

  static Random r = new Random();

  @ExpectWarning("Dm")
  int nextInt(int n) {
    return (int) (r.nextDouble() * n);
  }

  @ExpectWarning("Dm")
  int nextInt() {
    return (int) (r.nextDouble() * 100);
  }

  @ExpectWarning("Dm")
  int nextInt2(int n) {
    return (int) (n * r.nextDouble());
  }

  @ExpectWarning("Dm")
  int nextInt2() {
    return (int) (100 * r.nextDouble());
  }

  @DesireWarning("DMI")
  static int randomInt(int n) {
    Random ran = new Random();
    return ran.nextInt(n);
  }

  @ExpectWarning("DMI")
  static int randomInt2(int n) {
    return new Random().nextInt(n);
  }

  @ExpectWarning("DMI")
  static int randomInt3() {
    return new Random().nextInt();
  }

  // Mutated code starts here

  @ExpectWarning("Dm")
  int nextInt(char x) {
    return (int) (r.nextDouble() * x);
  }

  @ExpectWarning("Dm")
  int nextInt2(byte b) {
    return (int) (b * r.nextDouble());
  }

  @DesireWarning("DMI")
  static int randomInt(short s, int n) {
    Random z = new Random();
    return z.nextInt(n);
  }

  @ExpectWarning("DMI")
  static int randomInt2(long l, int n) {
    return new Random().nextInt(n);
  }

  @ExpectWarning("DMI")
  static int randomInt3(float f) {
    return new Random().nextInt();
  }
}