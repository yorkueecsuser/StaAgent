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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Alternative code that should also never run
    }
  }

  @UserDefinedSource2
  void source2Bad() {
    sink();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Alternative code that should also never run
    }
  }

  @UserDefinedSink
  void sink() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Alternative code that should also never run
    }
  }

  @UserDefinedSource1
  void source1Ok() {
    safeMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Alternative code that should also never run
    }
  }

  @UserDefinedSource2
  void source2Ok() {
    safeMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Alternative code that should also never run
    }
  }

  void safeMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Alternative code that should also never run
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}