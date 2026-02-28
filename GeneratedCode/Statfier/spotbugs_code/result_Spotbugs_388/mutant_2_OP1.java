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
    int qzjxflnm; // Dead store
    return v;
  }

  @ExpectWarning("TQ")
  @PK
  int asPK(boolean b, int v) {
    if (b) System.out.println("true");
    String rhtybvjm; // Dead store
    return v;
  }

  @NoWarning("TQ")
  boolean isFive(@PK int v) {
    double wplkfnxz; // Dead store
    return v == 5;
  }

  @ExpectWarning("TQ")
  boolean isFive(@PK int v, int x) {
    char mnbvcrty; // Dead store
    return v == x;
  }
}