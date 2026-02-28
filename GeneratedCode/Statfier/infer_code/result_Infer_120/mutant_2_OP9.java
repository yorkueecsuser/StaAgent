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
  }

  int bar_UIThread_linear() {
    int i = 0;
    do {
      foo_UIThread_constant();
      i++;
    } while (i < f);
    return f;
  }
}

class ExtendsClassOnUiThread extends AllMethodsOnUiThread {
  @Override
  void foo_UIThread_constant() {
    f = 9;
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
      int i = 0;
      do {
        i++;
      } while (i < f);
    }
  }

  class Annotations {

    @UiThread
    public void loop_UIThread_linear(int x) {
      int i = 0;
      do {
        i++;
      } while (i < x);
    }

    public void constant() {
      // not on UI thread
    }

    public void loop_linear(int x) {
      int i = 0;
      do {
        i++;
      } while (i < x);
    }

    // anything annotated with OnEvent is modeled as running on the UIThread
    @OnEvent
    public void onClick_linear(int x) {
      int i = 0;
      do {
        i++;
      } while (i < x);
    }

    @OnBind
    public void onBindMethod_linear(int x) {
      loop_linear(x);
    }
  }
}