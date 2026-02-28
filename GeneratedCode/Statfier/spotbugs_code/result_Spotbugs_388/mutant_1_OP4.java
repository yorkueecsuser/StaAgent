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
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      // This branch is unreachable because getCondition() always returns true
      System.out.println("This is unreachable");
    }
    return v;
  }

  @ExpectWarning("TQ")
  @PK
  int asPK(boolean b, int v) {
    if (b) System.out.println("true");
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      // This branch is unreachable because getCondition() always returns true
      System.out.println("This is unreachable");
    }
    return v;
  }

  @NoWarning("TQ")
  boolean isFive(@PK int v) {
    return v == 5;
  }

  @ExpectWarning("TQ")
  boolean isFive(@PK int v, int x) {
    return v == x;
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return true;
  }
}