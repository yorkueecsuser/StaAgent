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
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  @ExpectWarning("TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS")
  public boolean badCheck2(
      @SlashedClassName String slashedClassName, @DottedClassName String dottedClassName) {
    return slashedClassName == dottedClassName;
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  public boolean badCheck(@PK int x) {
    return x == 5;
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  public boolean badCheck2(@PK int x) {
    return x > 5;
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  private boolean getCondition() {
    return false; // This ensures the else block is unreachable, but the condition is not a compile-time constant
  }
}