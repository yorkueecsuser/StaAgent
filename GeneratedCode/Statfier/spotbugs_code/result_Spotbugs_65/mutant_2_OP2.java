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
    return x;
  }

  @Foo
  Object test2(@MaybeFoo Object x, boolean b) {
    if (b) System.out.println("b");
    return x; // Original assignment
    return x; // Mutated assignment
  }

  @Foo
  Object test2(@MaybeFoo Object x, @Foo Object y, boolean b) {
    if (b) return y; // Original return
    return x; // Original return
    return x; // Mutated return
  }

  @Nonnull
  Object testNullness(@CheckForNull Object x, boolean b) {
    if (b) System.out.println("b");
    return x; // Original return
    return x; // Mutated return
  }

  @Nonnull
  Object testNullness(@CheckForNull Object x, @Foo Object y, boolean b) {
    if (b) return y; // Original return
    return x; // Original return
    return x; // Mutated return
  }
}