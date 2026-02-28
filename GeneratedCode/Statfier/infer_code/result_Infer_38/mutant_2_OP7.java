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
  void uiThread() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @MainThread
  void mainThread() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @AnyThread
  void anyThread() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @WorkerThread
  void workerThread() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  void unannotated() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  void callUiThreadMethod() {
    uiThread();
    mainThread();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  void callNonUiThreadMethod() {
    workerThread();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @UiThread
  void callsFromUiThreadBad() {
    callNonUiThreadMethod();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @UiThread
  void callsFromUiThreadOk() {
    callUiThreadMethod();
    anyThread();
    unannotated();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @MainThread
  void callsFromMainThreadBad() {
    callNonUiThreadMethod();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @MainThread
  void callsFromMainThreadOk() {
    callUiThreadMethod();
    anyThread();
    unannotated();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @WorkerThread
  void callsFromWorkerThreadBad() {
    callUiThreadMethod();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @WorkerThread
  void callsFromWorkerThreadOk() {
    callNonUiThreadMethod();
    anyThread();
    unannotated();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @AnyThread
  void callsFromAnyThreadBad() {
    callUiThreadMethod();
    callNonUiThreadMethod();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @AnyThread
  void callsFromAnyThreadOk() {
    anyThread();
    unannotated();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}