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
    uiThread();
    mainThread();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  void callNonUiThreadMethod() {
    workerThread();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @UiThread
  void callsFromUiThreadBad() {
    callNonUiThreadMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @UiThread
  void callsFromUiThreadOk() {
    callUiThreadMethod();
    anyThread();
    unannotated();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @MainThread
  void callsFromMainThreadBad() {
    callNonUiThreadMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @MainThread
  void callsFromMainThreadOk() {
    callUiThreadMethod();
    anyThread();
    unannotated();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @WorkerThread
  void callsFromWorkerThreadBad() {
    callUiThreadMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @WorkerThread
  void callsFromWorkerThreadOk() {
    callNonUiThreadMethod();
    anyThread();
    unannotated();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @AnyThread
  void callsFromAnyThreadBad() {
    callUiThreadMethod();
    callNonUiThreadMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @AnyThread
  void callsFromAnyThreadOk() {
    anyThread();
    unannotated();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}