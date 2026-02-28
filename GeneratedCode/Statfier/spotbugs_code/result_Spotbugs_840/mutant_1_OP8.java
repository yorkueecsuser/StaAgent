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
  @PK long a, z;

  public @PK long getA() {
    return a;
  }

  public @PK long getZ() {
    return z;
  }

  Ideas_2013_05_06(@PK long a, @PK long z, boolean f) {
    this.a = a;
    this.z = z;
  }

  Ideas_2013_05_06(boolean f, @PK long a, @PK long z) {
    this.a = a;
    this.z = z;
  }

  public void callme(boolean f, @PK long a, boolean g, @PK long z, boolean h) {}

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test(@PK long a, @PK long z, boolean f) {
    new Ideas_2013_05_06(a, z, f);
    new Ideas_2013_05_06(f, a, z);
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test(boolean f, @PK long a, @PK long z) {
    new Ideas_2013_05_06(a, z, f);
    new Ideas_2013_05_06(f, a, z);
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test(boolean f, @PK long a, boolean g, @PK long z) {
    new Ideas_2013_05_06(a, z, f);
    new Ideas_2013_05_06(f, a, z);
  }

  public void test2(@PK long a, boolean g, @PK long z, boolean f) {
    callme(f, a, f, z, f);
  }
}