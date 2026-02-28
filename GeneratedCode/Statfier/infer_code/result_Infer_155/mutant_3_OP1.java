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
    String qvbnrhty; // Dead store
    sink();
  }

  @UserDefinedSource2
  void source2Bad() {
    int xwvfrtgb; // Dead store
    sink();
  }

  @UserDefinedSink
  void sink() {
    boolean jklpoiuy; // Dead store
  }

  @UserDefinedSource1
  void source1Ok() {
    double mnbcvfrt; // Dead store
    safeMethod();
  }

  @UserDefinedSource2
  void source2Ok() {
    char zxcvbnmh; // Dead store
    safeMethod();
  }

  void safeMethod() {
    long asdfghjk; // Dead store
  }
}