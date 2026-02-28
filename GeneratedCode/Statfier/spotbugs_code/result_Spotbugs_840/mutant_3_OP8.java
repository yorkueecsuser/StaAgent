import edu.umd.cs.findbugs.annotations.NoWarning;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifier;

class Ideas_2013_05_06 {

  @Documented
  @TypeQualifier(applicableTo = Long.class)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface PK {}

  public static @PK long asPK(long pk) {
    return pk;
  }

  @PK long x, y;

  public @PK long getX() {
    return x;
  }

  public @PK long getY() {
    return y;
  }

  Ideas_2013_05_06(@PK long x, @PK long y, boolean b) {
    this.x = x;
    this.y = y;
  }

  Ideas_2013_05_06(boolean b, @PK long x, @PK long y) {
    this.x = x;
    this.y = y;
  }

  public void callme(boolean b, @PK long x, boolean c, @PK long y, boolean d) {}

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test(@PK long x, @PK long y, boolean b) {
    new Ideas_2013_05_06(x, y, b);
    new Ideas_2013_05_06(b, x, y);
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test(boolean b, @PK long x, @PK long y) {
    new Ideas_2013_05_06(x, y, b);
    new Ideas_2013_05_06(b, x, y);
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test(boolean b, @PK long x, boolean c, @PK long y) {
    new Ideas_2013_05_06(x, y, b);
    new Ideas_2013_05_06(b, x, y);
  }

  public void test2(@PK long x, boolean c, @PK long y, boolean b) {
    callme(b, x, b, y, b);
  }

  // Mutated code
  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test3(@PK long a, @PK long y, boolean b) {
    new Ideas_2013_05_06(a, y, b);
    new Ideas_2013_05_06(b, a, y);
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test4(boolean b, @PK long x, @PK long c) {
    new Ideas_2013_05_06(x, c, b);
    new Ideas_2013_05_06(b, x, c);
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test5(boolean b, @PK long x, boolean d, @PK long y) {
    new Ideas_2013_05_06(x, y, b);
    new Ideas_2013_05_06(b, x, y);
  }

  public void test6(@PK long x, boolean e, @PK long y, boolean b) {
    callme(b, x, b, y, b);
  }
}