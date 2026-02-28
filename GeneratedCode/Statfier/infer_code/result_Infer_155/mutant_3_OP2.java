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
    int x = 1; // Introduced for demonstration
    int x = 1; // Duplicate of the above line
    sink();
  }

  @UserDefinedSource2
  void source2Bad() {
    boolean flag = false; // Introduced for demonstration
    boolean flag = false; // Duplicate of the above line
    sink();
  }

  @UserDefinedSink
  void sink() {}

  @UserDefinedSource1
  void source1Ok() {
    String message = "Safe"; // Introduced for demonstration
    String message = "Safe"; // Duplicate of the above line
    safeMethod();
  }

  @UserDefinedSource2
  void source2Ok() {
    double value = 3.14; // Introduced for demonstration
    double value = 3.14; // Duplicate of the above line
    safeMethod();
  }

  void safeMethod() {}
}