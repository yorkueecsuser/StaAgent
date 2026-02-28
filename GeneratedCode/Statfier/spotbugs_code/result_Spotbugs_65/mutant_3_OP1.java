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
    // Dead Store Mutation
    String qjvfnhxa = "unusedVariable";
  }

  @NotFoo
  Object test1(@Foo Object x) {
    return x;
    // Dead Store Mutation
    int kxwvbnrc = 42;
  }

  @Foo
  Object test2(@MaybeFoo Object x, boolean b) {
    if (b) System.out.println("b");
    return x;
    // Dead Store Mutation
    double fgtjyzpq = 3.14;
  }

  @Foo
  Object test2(@MaybeFoo Object x, @Foo Object y, boolean b) {
    if (b) return y;
    return x;
    // Dead Store Mutation
    boolean hzjxqtkr = true;
  }

  @Nonnull
  Object testNullness(@CheckForNull Object x, boolean b) {
    if (b) System.out.println("b");
    return x;
    // Dead Store Mutation
    char vjnbkxwc = 'a';
  }

  @Nonnull
  Object testNullness(@CheckForNull Object x, @Foo Object y, boolean b) {
    if (b) return y;
    return x;
    // Dead Store Mutation
    long lqjxvnhc = 123456789L;
  }
}