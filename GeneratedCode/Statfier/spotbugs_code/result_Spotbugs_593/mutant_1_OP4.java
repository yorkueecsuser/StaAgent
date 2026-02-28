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
      // Some code
    } else {
      // Unreachable else branch
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
      // Some code
    } else {
      // Unreachable else branch
    }
    return z;
  }

  @PK
  long getX() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
    return x;
  }

  @PK
  long getLongKey() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
    return 42;
  }

  @PK
  Object getO() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
    return "42";
  }

  @PK
  int getLongKey(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
    return 42 + x;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey3(@PK2 long x) {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
    return x;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
    return s.length();
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey2() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
    return 42L;
  }

  void setLongKey(@PK long key) {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @PK
  Long getBoxedLongKey() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
    return 42L;
  }

  void setBoxedLongKey(@PK Long key) {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @PK
  double getDoubleKey() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
    return 42;
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  double getDoubleKey2() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
    return 42.0;
  }

  void setDoubleKey(@PK double key) {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @PK
  Double getBoxedDoubleKey() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
    return 42.0;
  }

  void setBoxedDoubleKey(@PK Double key) {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @NoWarning("TQ")
  void boxLong() {
    setBoxedLongKey(getLongKey());
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @NoWarning("TQ")
  void unboxLong() {
    setLongKey(getBoxedLongKey());
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @NoWarning("TQ")
  void boxDouble() {
    setBoxedDoubleKey(getDoubleKey());
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @NoWarning("TQ")
  void unboxDouble() {
    setDoubleKey(getBoxedDoubleKey());
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}