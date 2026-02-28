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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return slashedClassName.equals(dottedClassName);
  }

  @ExpectWarning("TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS")
  public boolean badCheck2(
      @SlashedClassName String slashedClassName, @DottedClassName String dottedClassName) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return slashedClassName == dottedClassName;
  }

  public boolean badCheck(@PK int x) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return x == 5;
  }

  public boolean badCheck2(@PK int x) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return x > 5;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}