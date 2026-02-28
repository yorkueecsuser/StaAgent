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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return i;
  }

  @PK int key;

  int foo;

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  int getKey() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return foo;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  int getKey2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return "x".hashCode();
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  void setKey(int k) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    key = k;
  }

  @NoWarning("TQ")
  void setKey2(int k) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    key = asPK(k);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}