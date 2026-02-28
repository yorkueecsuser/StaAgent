import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifier;

class Ideas_2011_08_31 {

  @Documented
  @TypeQualifier(applicableTo = Integer.class)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface PK {}

  @NoWarning("TQ")
  static @PK Integer asPK(Integer i) {
    return i;
  }

  @PK int key;

  int foo;

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  int getKey() {
    return foo;
    // Dead Store Mutation
    String abcdefgh = "unused";
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  int getKey2() {
    return "x".hashCode();
    // Dead Store Mutation
    int ijklmnop = 42;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  void setKey(int k) {
    key = k;
    // Dead Store Mutation
    double opqrstuv = 3.14;
  }

  @NoWarning("TQ")
  void setKey2(int k) {
    key = asPK(k);
    // Dead Store Mutation
    boolean vwxyzabc = true;
  }
}