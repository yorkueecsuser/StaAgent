import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.math.BigDecimal;

class RV_RETURN_VALUE_IGNORED_BigDecimal {

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug(BigDecimal any1, BigDecimal any2) {
    any1.add(any2);
  }

  @NoWarning("RV_RETURN_VALUE_IGNORED")
  void notBug(BigDecimal any1, BigDecimal any2) {
    BigDecimal any3 = any1.add(any2);
    System.out.println(any3);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug(BigDecimal any1) {
    any1.abs();
  }

  @NoWarning("RV_RETURN_VALUE_IGNORED")
  void notBug(BigDecimal any1) {
    BigDecimal any2 = any1.abs();
    System.out.println(any2);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug2(BigDecimal any1, int anyInt) {
    any1.movePointLeft(anyInt);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug3(BigDecimal any1, int anyInt) {
    any1.setScale(anyInt);
  }

  // Mutated code starts here

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug_m(BigDecimal x, BigDecimal y) {
    x.add(y);
  }

  @NoWarning("RV_RETURN_VALUE_IGNORED")
  void notBug_m(BigDecimal a, BigDecimal b) {
    BigDecimal c = a.add(b);
    System.out.println(c);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug_m(BigDecimal z) {
    z.abs();
  }

  @NoWarning("RV_RETURN_VALUE_IGNORED")
  void notBug_m(BigDecimal w) {
    BigDecimal v = w.abs();
    System.out.println(v);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug2_m(BigDecimal p, int q) {
    p.movePointLeft(q);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug3_m(BigDecimal r, int s) {
    r.setScale(s);
  }
}