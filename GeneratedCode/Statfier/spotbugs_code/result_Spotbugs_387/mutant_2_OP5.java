import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifier;
import javax.annotation.meta.TypeQualifierNickname;
import javax.annotation.meta.When;

class Ideas_2011_09_24 {
  @Documented
  @TypeQualifier(applicableTo = Integer.class)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface PK {}

  @Documented
  @TypeQualifier(applicableTo = CharSequence.class)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface SlashedClassName {

    When when() default When.ALWAYS;
  }

  @Documented
  @SlashedClassName(when = When.NEVER)
  @TypeQualifierNickname
  @Retention(RetentionPolicy.RUNTIME)
  public @interface DottedClassName {}

  @ExpectWarning("TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS")
  public boolean badCheck(
      @SlashedClassName String slashedClassName, @DottedClassName String dottedClassName) {
    return slashedClassName.equals(dottedClassName);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  @ExpectWarning("TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS")
  public boolean badCheck2(
      @SlashedClassName String slashedClassName, @DottedClassName String dottedClassName) {
    return slashedClassName == dottedClassName;

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is another unreachable case.");
        break;
    }
  }

  public boolean badCheck(@PK int x) {
    return x == 5;

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("Unreachable case in badCheck(int x).");
        break;
    }
  }

  public boolean badCheck2(@PK int x) {
    return x > 5;

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("Unreachable case in badCheck2(int x).");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}