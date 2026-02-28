import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Date;

class Ideas_2008_11_21 {

  void whatDoIDo(String reason) {
    throw new RuntimeException(reason);
  }

  static final int FOO = 17;

  int flags;

  boolean isFoo() {
    return (flags & FOO)!= 0;
  }

  @ExpectWarning("BSHIFT")
  boolean testShift(int x) {
    return x == x >>> 32;
  }

  String testDeadStorePastUnconditionalThrower() {
    String foo = new Date().toString();
    whatDoIDo("huh");
    return foo;
  }

  // Mutated code
  void whatDoIDo(String a) {
    throw new RuntimeException(a);
  }

  static final int BAR = 17;

  int baz;

  boolean isBar() {
    return (baz & BAR)!= 0;
  }

  @ExpectWarning("BSHIFT")
  boolean testShift(int y) {
    return y == y >>> 32;
  }

  String testDeadStorePastUnconditionalThrowerMutant() {
    String b = new Date().toString();
    whatDoIDo("huh");
    return b;
  }
}