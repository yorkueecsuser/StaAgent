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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return i;
  }

  @PK int key;

  int foo;

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  int getKey() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in getKey");
    }
    return foo;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  int getKey2() {
    boolean conditionKey2 = getCondition();
    if (conditionKey2) {
      // Some unreachable code
      System.out.println("This is unreachable code in getKey2");
    }
    return "x".hashCode();
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  void setKey(int k) {
    boolean conditionSetKey = getCondition();
    if (conditionSetKey) {
      // Some unreachable code
      System.out.println("This is unreachable code in setKey");
    }
    key = k;
  }

  @NoWarning("TQ")
  void setKey2(int k) {
    boolean conditionSetKey2 = getCondition();
    if (conditionSetKey2) {
      // Some unreachable code
      System.out.println("This is unreachable code in setKey2");
    }
    key = asPK(k);
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}