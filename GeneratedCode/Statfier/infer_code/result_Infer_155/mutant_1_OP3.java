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
      // This is an unreachable if statement because condition will always be false
    }
    sink();
  }

  @UserDefinedSource2
  void source2Bad() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because condition will always be false
    }
    sink();
  }

  @UserDefinedSink
  void sink() {}

  @UserDefinedSource1
  void source1Ok() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because condition will always be false
    }
    safeMethod();
  }

  @UserDefinedSource2
  void source2Ok() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because condition will always be false
    }
    safeMethod();
  }

  void safeMethod() {}

  private boolean getCondition() {
    return false;
  }
}