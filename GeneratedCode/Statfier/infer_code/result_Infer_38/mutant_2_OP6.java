import android.support.annotation.MainThread;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@interface AnyThread {}

/*
  Sources:

  https://developer.android.com/reference/android/support/annotation/UiThread
  "Denotes that the annotated method or constructor should only be called on the UI thread."

  https://developer.android.com/reference/android/support/annotation/MainThread
  "Denotes that the annotated method should only be called on the main thread."
  "Note: Ordinarily, an app's main thread is also the UI thread."
  (this is what's assumed here also)

  https://developer.android.com/reference/android/support/annotation/WorkerThread
  "Denotes that the annotated method should only be called on a worker thread."

  https://developer.android.com/reference/android/support/annotation/AnyThread
  "Denotes that the annotated method can be called from any thread (e.g. it is "thread safe".) [...]
   static tools can then check that nothing you call from within this method or class have more
   strict threading requirements."
*/

class UiThreads {

  @UiThread
  void uiThread() {}

  @MainThread
  void mainThread() {}

  @AnyThread
  void anyThread() {}

  @WorkerThread
  void workerThread() {}

  void unannotated() {}

  void callUiThreadMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    uiThread();
    mainThread();
  }

  void callNonUiThreadMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    workerThread();
  }

  @UiThread
  void callsFromUiThreadBad() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    callNonUiThreadMethod();
  }

  @UiThread
  void callsFromUiThreadOk() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    callUiThreadMethod();
    anyThread();
    unannotated();
  }

  @MainThread
  void callsFromMainThreadBad() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    callNonUiThreadMethod();
  }

  @MainThread
  void callsFromMainThreadOk() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    callUiThreadMethod();
    anyThread();
    unannotated();
  }

  @WorkerThread
  void callsFromWorkerThreadBad() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    callUiThreadMethod();
  }

  @WorkerThread
  void callsFromWorkerThreadOk() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    callNonUiThreadMethod();
    anyThread();
    unannotated();
  }

  @AnyThread
  void callsFromAnyThreadBad() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    callUiThreadMethod();
    callNonUiThreadMethod();
  }

  @AnyThread
  void callsFromAnyThreadOk() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    anyThread();
    unannotated();
  }

  private boolean getCondition() {
    return false;
  }
}