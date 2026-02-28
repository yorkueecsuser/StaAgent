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
    return v; // Original assignment
    int v2 = v; // Mutated assignment
  }

  @ExpectWarning("TQ")
  @PK
  int asPK(boolean b, int v) {
    if (b) System.out.println("true");
    return v; // Original assignment
    int v2 = v; // Mutated assignment
  }

  @NoWarning("TQ")
  boolean isFive(@PK int v) {
    return v == 5; // Original condition
    boolean result = v == 5; // Mutated assignment
  }

  @ExpectWarning("TQ")
  boolean isFive(@PK int v, int x) {
    return v == x; // Original condition
    boolean result = v == x; // Mutated assignment
  }
}