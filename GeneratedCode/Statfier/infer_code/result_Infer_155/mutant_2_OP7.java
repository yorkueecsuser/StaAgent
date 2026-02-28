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
    boolean conditionWhile1 = getCondition1();
    while (conditionWhile1) {
      // Unreachable while loop
    }
    sink();
  }

  @UserDefinedSource2
  void source2Bad() {
    boolean conditionWhile2 = getCondition2();
    while (conditionWhile2) {
      // Unreachable while loop
    }
    sink();
  }

  @UserDefinedSink
  void sink() {}

  @UserDefinedSource1
  void source1Ok() {
    boolean conditionWhile3 = getCondition3();
    while (conditionWhile3) {
      // Unreachable while loop
    }
    safeMethod();
  }

  @UserDefinedSource2
  void source2Ok() {
    boolean conditionWhile4 = getCondition4();
    while (conditionWhile4) {
      // Unreachable while loop
    }
    safeMethod();
  }

  void safeMethod() {}

  private boolean getCondition1() {
    return false;
  }

  private boolean getCondition2() {
    return false;
  }

  private boolean getCondition3() {
    return false;
  }

  private boolean getCondition4() {
    return false;
  }
}