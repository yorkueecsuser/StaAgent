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
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in source1Bad");
    }
  }

  @UserDefinedSource2
  void source2Bad() {
    sink();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in source2Bad");
    }
  }

  @UserDefinedSink
  void sink() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in sink");
    }
  }

  @UserDefinedSource1
  void source1Ok() {
    safeMethod();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in source1Ok");
    }
  }

  @UserDefinedSource2
  void source2Ok() {
    safeMethod();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in source2Ok");
    }
  }

  void safeMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in safeMethod");
    }
  }

  private boolean getCondition() {
    return false;
  }
}