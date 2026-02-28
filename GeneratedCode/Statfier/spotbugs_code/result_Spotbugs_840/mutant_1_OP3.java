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
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
  }

  Ideas_2013_05_06(boolean b, @PK long x, @PK long y) {
    this.x = x;
    this.y = y;
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
  }

  public void callme(boolean b, @PK long x, boolean c, @PK long y, boolean d) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test(@PK long x, @PK long y, boolean b) {
    new Ideas_2013_05_06(x, y, b);
    new Ideas_2013_05_06(b, x, y);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test(boolean b, @PK long x, @PK long y) {
    new Ideas_2013_05_06(x, y, b);
    new Ideas_2013_05_06(b, x, y);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test(boolean b, @PK long x, boolean c, @PK long y) {
    new Ideas_2013_05_06(x, y, b);
    new Ideas_2013_05_06(b, x, y);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
  }

  public void test2(@PK long x, boolean c, @PK long y, boolean b) {
    callme(b, x, b, y, b);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
  }

  private boolean getCondition() {
    return false;
  }
}