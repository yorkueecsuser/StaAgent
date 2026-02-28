import android.support.annotation.UiThread;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface OnBind {}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface OnEvent {}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface OnMount {}

@UiThread
class AllMethodsOnUiThread {
  int f;

  void foo_UIThread_constant() {
    f = 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable else branch
      f = -1;
    }
  }

  int bar_UIThread_linear() {
    for (int i = 0; i < f; i++) {
      foo_UIThread_constant();
    }
    return f;
  }
}

class ExtendsClassOnUiThread extends AllMethodsOnUiThread {
  @Override
  void foo_UIThread_constant() {
    f = 9;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable else branch
      f = -2;
    }
  }

  @Override
  int bar_UIThread_linear() {
    return super.bar_UIThread_linear();
  }
}

class UIAnnotationTest {

  // NOT All annotations that start with "On" are on the main thread
  @Target(ElementType.METHOD)
  @Retention(RetentionPolicy.CLASS)
  @interface OnXYZ {}

  class WeirdAnnotation {
    int f;

    @OnXYZ
    void foo_linear() {
      for (int i = 0; i < f; i++) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should run if condition is true
        } else {
          // Unreachable else branch
          f = -3;
        }
      }
    }
  }

  class Annotations {

    @UiThread
    public void loop_UIThread_linear(int x) {
      for (int i = 0; i < x; i++) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should run if condition is true
        } else {
          // Unreachable else branch
          f = -4;
        }
      }
    }

    public void constant() {
      // not on UI thread
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if condition is true
      } else {
        // Unreachable else branch
        f = -5;
      }
    }

    public void loop_linear(int x) {
      for (int i = 0; i < x; i++) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should run if condition is true
        } else {
          // Unreachable else branch
          f = -6;
        }
      }
    }

    // anything annotated with OnEvent is modeled as running on the UIThread
    @OnEvent
    public void onClick_linear(int x) {
      for (int i = 0; i < x; i++) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should run if condition is true
        } else {
          // Unreachable else branch
          f = -7;
        }
      }
    }

    @OnBind
    public void onBindMethod_linear(int x) {
      loop_linear(x);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if condition is true
      } else {
        // Unreachable else branch
        f = -8;
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}