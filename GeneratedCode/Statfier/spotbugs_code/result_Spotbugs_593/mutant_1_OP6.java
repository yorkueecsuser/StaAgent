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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return x;
  }
  ;

  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @TypeQualifier
  public @interface PK2 {}

  static {
    System.out.println("Initializing class");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @PK static final int z = asPK(42) + 1;
  long x;

  @PK
  int getZ() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return z;
  }

  @PK
  long getX() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return x;
  }

  @PK
  long getLongKey() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return 42;
  }

  @PK
  Object getO() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return "42";
  }

  @PK
  int getLongKey(int x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return 42 + x;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey3(@PK2 long x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return x;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey(String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return s.length();
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return 42L;
  }

  void setLongKey(@PK long key) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @PK
  Long getBoxedLongKey() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return 42L;
  }

  void setBoxedLongKey(@PK Long key) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @PK
  double getDoubleKey() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return 42;
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  double getDoubleKey2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return 42.0;
  }

  void setDoubleKey(@PK double key) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @PK
  Double getBoxedDoubleKey() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return 42.0;
  }

  void setBoxedDoubleKey(@PK Double key) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @NoWarning("TQ")
  void boxLong() {
    setBoxedLongKey(getLongKey());
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @NoWarning("TQ")
  void unboxLong() {
    setLongKey(getBoxedLongKey());
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @NoWarning("TQ")
  void boxDouble() {
    setBoxedDoubleKey(getDoubleKey());
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @NoWarning("TQ")
  void unboxDouble() {
    setDoubleKey(getBoxedDoubleKey());
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  private static boolean getCondition() {
    return false;
  }
}