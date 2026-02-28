import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.sql.ResultSet;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifier;
import javax.annotation.meta.TypeQualifierNickname;
import javax.annotation.meta.When;

class Ideas_2013_01_29 {

  @Documented
  @TypeQualifier
  @Retention(RetentionPolicy.RUNTIME)
  public @interface Foo {
    When when() default When.ALWAYS;
  }

  @Foo(when = When.NEVER)
  @TypeQualifierNickname
  public @interface NotFoo {}

  @Foo(when = When.MAYBE)
  @TypeQualifierNickname
  public @interface MaybeFoo {}

  int foobar() {
    return ResultSet.CLOSE_CURSORS_AT_COMMIT;
  }

  @NotFoo
  Object test1(@Foo Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition &&!condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
    return x;
  }

  @Foo
  Object test2(@MaybeFoo Object x, boolean b) {
    if (b) System.out.println("b");
    boolean condition = getCondition();
    if (condition &&!condition) {
      // Unreachable if-else statement
      if (condition &&!condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
    return x;
  }

  @Foo
  Object test2(@MaybeFoo Object x, @Foo Object y, boolean b) {
    if (b) return y;
    boolean condition = getCondition();
    if (condition &&!condition) {
      // Unreachable if-else statement
      if (condition &&!condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
    return x;
  }

  @Nonnull
  Object testNullness(@CheckForNull Object x, boolean b) {
    if (b) System.out.println("b");
    boolean condition = getCondition();
    if (condition &&!condition) {
      // Unreachable if-else statement
      if (condition &&!condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
    return x;
  }

  @Nonnull
  Object testNullness(@CheckForNull Object x, @Foo Object y, boolean b) {
    if (b) return y;
    boolean condition = getCondition();
    if (condition &&!condition) {
      // Unreachable if-else statement
      if (condition &&!condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
    return x;
  }

  private boolean getCondition() {
    return true; // This method ensures the condition is dynamically determined at runtime
  }
}