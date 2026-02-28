import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifier;

class Ideas_2012_02_01 {

  @Documented
  @TypeQualifier(applicableTo = Integer.class)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface Foo {}

  @Documented
  @TypeQualifier(applicableTo = Integer.class)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface Bar {}

  static @Foo int getFoo() {
    return 42;
  }

  @ExpectWarning("TQ")
  Ideas_2012_02_01(int x, @Foo int foo) {
    this(x, foo, "x");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @ExpectWarning("TQ")
  Ideas_2012_02_01(int x, StringBuffer b) {
    this(x, getFoo(), b.toString());
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  Ideas_2012_02_01(int x, @Bar int bar, String s) {}

  @ExpectWarning("TQ")
  Ideas_2012_02_01(@Foo int foo) {
    this(foo, "x");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  Ideas_2012_02_01(@Bar int bar, String s) {}

  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the loop unreachable
  }
}