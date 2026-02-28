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
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return x;
  }

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
    return z;
  }

  @PK
  long getX() {
    return x;
  }

  @PK
  long getLongKey() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return 42;
  }

  @PK
  Object getO() {
    return "42";
  }

  @PK
  int getLongKey(int x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return 42 + x;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey3(@PK2 long x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return x;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey(String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return s.length();
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return 42L;
  }

  void setLongKey(@PK long key) {}

  @PK
  Long getBoxedLongKey() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return 42L;
  }

  void setBoxedLongKey(@PK Long key) {}

  @PK
  double getDoubleKey() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return 42;
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  double getDoubleKey2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return 42.0;
  }

  void setDoubleKey(@PK double key) {}

  @PK
  Double getBoxedDoubleKey() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return 42.0;
  }

  void setBoxedDoubleKey(@PK Double key) {}

  @NoWarning("TQ")
  void boxLong() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    setBoxedLongKey(getLongKey());
  }

  @NoWarning("TQ")
  void unboxLong() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    setLongKey(getBoxedLongKey());
  }

  @NoWarning("TQ")
  void boxDouble() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    setBoxedDoubleKey(getDoubleKey());
  }

  @NoWarning("TQ")
  void unboxDouble() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    setDoubleKey(getBoxedDoubleKey());
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}