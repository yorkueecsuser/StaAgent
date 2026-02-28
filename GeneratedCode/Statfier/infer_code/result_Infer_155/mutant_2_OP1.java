import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@interface UserDefinedSource1 {}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@interface UserDefinedSource2 {}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@interface UserDefinedSink {}

class CustomAnnotations {

  @UserDefinedSource1
  void source1Bad() {
    sink();
    String abcdefgh = "unusedVariable";
  }

  @UserDefinedSource2
  void source2Bad() {
    sink();
    int hijklmno = 42;
  }

  @UserDefinedSink
  void sink() {
    double pqrstuvw = 3.14;
  }

  @UserDefinedSource1
  void source1Ok() {
    safeMethod();
    boolean xyzabcde = true;
  }

  @UserDefinedSource2
  void source2Ok() {
    safeMethod();
    char fghijklm = 'a';
  }

  void safeMethod() {
    long nopqrstu = 100L;
  }
}