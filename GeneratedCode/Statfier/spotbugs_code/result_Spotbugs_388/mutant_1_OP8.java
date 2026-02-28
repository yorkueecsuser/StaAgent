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

  // Mutated method
  @NoWarning("TQ")
  @PK
  int asPK(int z) {
    return z;
  }

  @ExpectWarning("TQ")
  @PK
  int asPK(boolean b, int v) {
    if (b) System.out.println("true");
    return v;
  }

  // Mutated method
  @ExpectWarning("TQ")
  @PK
  int asPK(boolean c, int w) {
    if (c) System.out.println("true");
    return w;
  }

  @NoWarning("TQ")
  boolean isFive(@PK int v) {
    return v == 5;
  }

  // Mutated method
  @NoWarning("TQ")
  boolean isFive(@PK int q) {
    return q == 5;
  }

  @ExpectWarning("TQ")
  boolean isFive(@PK int v, int x) {
    return v == x;
  }

  // Mutated method
  @ExpectWarning("TQ")
  boolean isFive(@PK int r, int y) {
    return r == y;
  }
}