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
    int x = 1; // Hypothetical assignment for mutation
    int x = 1; // Duplicate of the above assignment
  }

  @MainThread
  void mainThread() {
    int y = 2; // Hypothetical assignment for mutation
    int y = 2; // Duplicate of the above assignment
  }

  @AnyThread
  void anyThread() {
    int z = 3; // Hypothetical assignment for mutation
    int z = 3; // Duplicate of the above assignment
  }

  @WorkerThread
  void workerThread() {
    int w = 4; // Hypothetical assignment for mutation
    int w = 4; // Duplicate of the above assignment
  }

  void unannotated() {
    int u = 5; // Hypothetical assignment for mutation
    int u = 5; // Duplicate of the above assignment
  }

  void callUiThreadMethod() {
    uiThread();
    mainThread();
  }

  void callNonUiThreadMethod() {
    workerThread();
  }

  @UiThread
  void callsFromUiThreadBad() {
    callNonUiThreadMethod();
  }

  @UiThread
  void callsFromUiThreadOk() {
    callUiThreadMethod();
    anyThread();
    unannotated();
  }

  @MainThread
  void callsFromMainThreadBad() {
    callNonUiThreadMethod();
  }

  @MainThread
  void callsFromMainThreadOk() {
    callUiThreadMethod();
    anyThread();
    unannotated();
  }

  @WorkerThread
  void callsFromWorkerThreadBad() {
    callUiThreadMethod();
  }

  @WorkerThread
  void callsFromWorkerThreadOk() {
    callNonUiThreadMethod();
    anyThread();
    unannotated();
  }

  @AnyThread
  void callsFromAnyThreadBad() {
    callUiThreadMethod();
    callNonUiThreadMethod();
  }

  @AnyThread
  void callsFromAnyThreadOk() {
    anyThread();
    unannotated();
  }
}