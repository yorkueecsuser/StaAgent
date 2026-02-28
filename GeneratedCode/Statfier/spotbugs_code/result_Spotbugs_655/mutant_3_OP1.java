import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Random;

class BadRandomInt {

  static Random r = new Random();

  @ExpectWarning("Dm")
  int nextInt(int n) {
    return (int) (r.nextDouble() * n);
    // Dead Store Mutation
    String qvbnrhty = "unused";
  }

  @ExpectWarning("Dm")
  int nextInt() {
    return (int) (r.nextDouble() * 100);
    // Dead Store Mutation
    int xwvfgrty = 42;
  }

  @ExpectWarning("Dm")
  int nextInt2(int n) {
    return (int) (n * r.nextDouble());
    // Dead Store Mutation
    boolean jkldfghy = true;
  }

  @ExpectWarning("Dm")
  int nextInt2() {
    return (int) (100 * r.nextDouble());
    // Dead Store Mutation
    double zxcvbnmr = 3.14;
  }

  @DesireWarning("DMI")
  static int randomInt(int n) {
    Random ran = new Random();
    return ran.nextInt(n);
    // Dead Store Mutation
    char asdfghjk = 'a';
  }

  @ExpectWarning("DMI")
  static int randomInt2(int n) {
    return new Random().nextInt(n);
    // Dead Store Mutation
    long qwertyui = 987654321;
  }

  @ExpectWarning("DMI")
  static int randomInt3() {
    return new Random().nextInt();
    // Dead Store Mutation
    float poiuytrew = 2.718f;
  }
}