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
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  Ideas_2013_05_06(boolean b, @PK long x, @PK long y) {
    this.x = x;
    this.y = y;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  public void callme(boolean b, @PK long x, boolean c, @PK long y, boolean d) {
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test(@PK long x, @PK long y, boolean b) {
    new Ideas_2013_05_06(x, y, b);
    new Ideas_2013_05_06(b, x, y);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test(boolean b, @PK long x, @PK long y) {
    new Ideas_2013_05_06(x, y, b);
    new Ideas_2013_05_06(b, x, y);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  public void test(boolean b, @PK long x, boolean c, @PK long y) {
    new Ideas_2013_05_06(x, y, b);
    new Ideas_2013_05_06(b, x, y);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  public void test2(@PK long x, boolean c, @PK long y, boolean b) {
    callme(b, x, b, y, b);
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  private boolean getCondition() {
    return false; // This ensures the else block is theoretically unreachable
  }
}