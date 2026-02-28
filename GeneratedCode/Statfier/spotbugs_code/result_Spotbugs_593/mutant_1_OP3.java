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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x += 10;
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
  }

  @PK static final int z = asPK(42) + 1;
  long x;

  @PK
  int getZ() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return z + 5;
    }
    return z;
  }

  @PK
  long getX() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return x + 100;
    }
    return x;
  }

  @PK
  long getLongKey() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 84;
    }
    return 42;
  }

  @PK
  Object getO() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return "84";
    }
    return "42";
  }

  @PK
  int getLongKey(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 84 + x;
    }
    return 42 + x;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey3(@PK2 long x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return x + 10;
    }
    return x;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return s.length() + 10;
    }
    return s.length();
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey2() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 84L;
    }
    return 42L;
  }

  void setLongKey(@PK long key) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      key += 10;
    }
  }

  @PK
  Long getBoxedLongKey() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 84L;
    }
    return 42L;
  }

  void setBoxedLongKey(@PK Long key) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      key += 10;
    }
  }

  @PK
  double getDoubleKey() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 84;
    }
    return 42;
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  double getDoubleKey2() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 84.0;
    }
    return 42.0;
  }

  void setDoubleKey(@PK double key) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      key += 10.0;
    }
  }

  @PK
  Double getBoxedDoubleKey() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 84.0;
    }
    return 42.0;
  }

  void setBoxedDoubleKey(@PK Double key) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      key += 10.0;
    }
  }

  @NoWarning("TQ")
  void boxLong() {
    setBoxedLongKey(getLongKey());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      setBoxedLongKey(100L);
    }
  }

  @NoWarning("TQ")
  void unboxLong() {
    setLongKey(getBoxedLongKey());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      setLongKey(100L);
    }
  }

  @NoWarning("TQ")
  void boxDouble() {
    setBoxedDoubleKey(getDoubleKey());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      setBoxedDoubleKey(100.0);
    }
  }

  @NoWarning("TQ")
  void unboxDouble() {
    setDoubleKey(getBoxedDoubleKey());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      setDoubleKey(100.0);
    }
  }

  private static boolean getCondition() {
    return false;
  }
}