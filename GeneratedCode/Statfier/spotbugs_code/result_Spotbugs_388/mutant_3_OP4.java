import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifier;

class Ideas_2011_10_24 {

  @Documented
  @TypeQualifier()
  @Retention(RetentionPolicy.RUNTIME)
  public @interface PK {}

  @NoWarning("TQ")
  @PK
  int asPK(int v) {
    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable if branch");
    } else {
      System.out.println("This is unreachable else branch");
    }
    return v;
  }

  @ExpectWarning("TQ")
  @PK
  int asPK(boolean b, int v) {
    if (b) System.out.println("true");
    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable if branch");
    } else {
      System.out.println("This is unreachable else branch");
    }
    return v;
  }

  @NoWarning("TQ")
  boolean isFive(@PK int v) {
    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable if branch");
    } else {
      System.out.println("This is unreachable else branch");
    }
    return v == 5;
  }

  @ExpectWarning("TQ")
  boolean isFive(@PK int v, int x) {
    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable if branch");
    } else {
      System.out.println("This is unreachable else branch");
    }
    return v == x;
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}