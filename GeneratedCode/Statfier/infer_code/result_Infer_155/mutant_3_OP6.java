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
    boolean conditionFor = getConditionForSource1();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  @UserDefinedSource2
  void source2Bad() {
    sink();
    boolean conditionFor = getConditionForSource2();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  @UserDefinedSink
  void sink() {}

  @UserDefinedSource1
  void source1Ok() {
    safeMethod();
    boolean conditionFor = getConditionForSource1Ok();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  @UserDefinedSource2
  void source2Ok() {
    safeMethod();
    boolean conditionFor = getConditionForSource2Ok();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  void safeMethod() {}

  private boolean getConditionForSource1() {
    return false;
  }

  private boolean getConditionForSource2() {
    return false;
  }

  private boolean getConditionForSource1Ok() {
    return false;
  }

  private boolean getConditionForSource2Ok() {
    return false;
  }
}