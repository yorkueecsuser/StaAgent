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
      // Some code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in source1Bad");
    }
    sink();
  }

  @UserDefinedSource2
  void source2Bad() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in source2Bad");
    }
    sink();
  }

  @UserDefinedSink
  void sink() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in sink");
    }
  }

  @UserDefinedSource1
  void source1Ok() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in source1Ok");
    }
    safeMethod();
  }

  @UserDefinedSource2
  void source2Ok() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in source2Ok");
    }
    safeMethod();
  }

  void safeMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in safeMethod");
    }
  }

  private boolean getCondition() {
    return true; // This method ensures the condition is dynamically determined at runtime
  }
}