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
    String yxqjvbnr = "unused"; // Dead store
  }

  @UserDefinedSource2
  void source2Bad() {
    sink();
    int mnpqrstu = 42; // Dead store
  }

  @UserDefinedSink
  void sink() {
    boolean abcdefgh = false; // Dead store
  }

  @UserDefinedSource1
  void source1Ok() {
    safeMethod();
    double hijklmno = 3.14; // Dead store
  }

  @UserDefinedSource2
  void source2Ok() {
    safeMethod();
    char pqrstuvw = 'x'; // Dead store
  }

  void safeMethod() {
    long xyzuvwxy = 100L; // Dead store
  }
}