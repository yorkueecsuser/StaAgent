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
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for any code that should not be executed
    }
    sink();
  }

  @UserDefinedSource2
  void source2Bad() {
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for any code that should not be executed
    }
    sink();
  }

  @UserDefinedSink
  void sink() {
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for any code that should not be executed
    }
  }

  @UserDefinedSource1
  void source1Ok() {
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for any code that should not be executed
    }
    safeMethod();
  }

  @UserDefinedSource2
  void source2Ok() {
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for any code that should not be executed
    }
    safeMethod();
  }

  void safeMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for any code that should not be executed
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if branches are unreachable
  }
}