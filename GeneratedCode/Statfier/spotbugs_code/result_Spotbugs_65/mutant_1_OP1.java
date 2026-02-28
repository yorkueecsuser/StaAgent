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
    // Dead store mutation
    String qzjfnrvt = "unused";
  }

  @NotFoo
  Object test1(@Foo Object x) {
    return x;
    // Dead store mutation
    int xwvfrtgb = 42;
  }

  @Foo
  Object test2(@MaybeFoo Object x, boolean b) {
    if (b) System.out.println("b");
    return x;
    // Dead store mutation
    double hgfdsazx = 3.14;
  }

  @Foo
  Object test2(@MaybeFoo Object x, @Foo Object y, boolean b) {
    if (b) return y;
    return x;
    // Dead store mutation
    boolean cvbnmkji = true;
  }

  @Nonnull
  Object testNullness(@CheckForNull Object x, boolean b) {
    if (b) System.out.println("b");
    return x;
    // Dead store mutation
    char poiuytrew = 'a';
  }

  @Nonnull
  Object testNullness(@CheckForNull Object x, @Foo Object y, boolean b) {
    if (b) return y;
    return x;
    // Dead store mutation
    long lkjhgfdsa = 123456789L;
  }
}