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
    return x;
  }

  @Foo
  Object test2(@MaybeFoo Object x, @Foo Object y, boolean b) {
    if (b) return y;
    return x;
  }

  @Nonnull
  Object testNullness(@CheckForNull Object x, boolean b) {
    if (b) System.out.println("b");
    return x;
  }

  @Nonnull
  Object testNullness(@CheckForNull Object x, @Foo Object y, boolean b) {
    if (b) return y;
    return x;
  }

  // Mutated code
  @NotFoo
  Object test1(@Foo Object a) {
    return a;
  }

  @Foo
  Object test2(@MaybeFoo Object c, boolean d) {
    if (d) System.out.println("d");
    return c;
  }

  @Foo
  Object test2(@MaybeFoo e, @Foo f, boolean g) {
    if (g) return f;
    return e;
  }

  @Nonnull
  Object testNullness(@CheckForNull h, boolean i) {
    if (i) System.out.println("i");
    return h;
  }

  @Nonnull
  Object testNullness(@CheckForNull j, @Foo k, boolean l) {
    if (l) return k;
    return j;
  }
}