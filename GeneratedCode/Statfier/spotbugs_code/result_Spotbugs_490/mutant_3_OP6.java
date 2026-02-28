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
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable loop
    }
    return i;
  }

  @PK int key;

  int foo;

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  int getKey() {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable loop
    }
    return foo;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  int getKey2() {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable loop
    }
    return "x".hashCode();
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  void setKey(int k) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable loop
    }
    key = k;
  }

  @NoWarning("TQ")
  void setKey2(int k) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable loop
    }
    key = asPK(k);
  }

  private boolean getCondition() {
    return false;
  }
}