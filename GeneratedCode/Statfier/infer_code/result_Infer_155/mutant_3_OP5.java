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
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() is designed to return false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  @UserDefinedSource2
  void source2Bad() {
    sink();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() is designed to return false
        System.out.println("This is another unreachable case.");
        break;
    }
  }

  @UserDefinedSink
  void sink() {}

  @UserDefinedSource1
  void source1Ok() {
    safeMethod();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() is designed to return false
        System.out.println("Yet another unreachable case.");
        break;
    }
  }

  @UserDefinedSource2
  void source2Ok() {
    safeMethod();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() is designed to return false
        System.out.println("One more unreachable case.");
        break;
    }
  }

  void safeMethod() {}

  private boolean getCondition() {
    return false;
  }
}