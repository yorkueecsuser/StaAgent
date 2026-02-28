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
    return v;
  }

  // Mutant 1: Renamed 'b' to 'a'
  @ExpectWarning("TQ")
  @PK
  int asPK(boolean a, int v) {
    if (a) System.out.println("true");
    return v;
  }

  @NoWarning("TQ")
  boolean isFive(@PK int v) {
    return v == 5;
  }

  // Mutant 2: Renamed 'x' to 'y'
  @ExpectWarning("TQ")
  boolean isFive(@PK int v, int y) {
    return v == y;
  }
}