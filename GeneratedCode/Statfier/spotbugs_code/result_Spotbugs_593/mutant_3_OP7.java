import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifier;

class Ideas_2012_09_27 {

  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @TypeQualifier
  public @interface PK {}

  @PK
  static int asPK(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return x;
  }

  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @TypeQualifier
  public @interface PK2 {}

  static {
    System.out.println("Initializing class");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @PK static final int z = asPK(42) + 1;
  long x;

  @PK
  int getZ() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return z;
  }

  @PK
  long getX() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return x;
  }

  @PK
  long getLongKey() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return 42;
  }

  @PK
  Object getO() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return "42";
  }

  @PK
  int getLongKey(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return 42 + x;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey3(@PK2 long x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return x;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey(String s) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return s.length();
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return 42L;
  }

  void setLongKey(@PK long key) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @PK
  Long getBoxedLongKey() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return 42L;
  }

  void setBoxedLongKey(@PK Long key) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @PK
  double getDoubleKey() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return 42;
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  double getDoubleKey2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return 42.0;
  }

  void setDoubleKey(@PK double key) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @PK
  Double getBoxedDoubleKey() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return 42.0;
  }

  void setBoxedDoubleKey(@PK Double key) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @NoWarning("TQ")
  void boxLong() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    setBoxedLongKey(getLongKey());
  }

  @NoWarning("TQ")
  void unboxLong() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    setLongKey(getBoxedLongKey());
  }

  @NoWarning("TQ")
  void boxDouble() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    setBoxedDoubleKey(getDoubleKey());
  }

  @NoWarning("TQ")
  void unboxDouble() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    setDoubleKey(getBoxedDoubleKey());
  }

  private static boolean getCondition() {
    return false;
  }
}