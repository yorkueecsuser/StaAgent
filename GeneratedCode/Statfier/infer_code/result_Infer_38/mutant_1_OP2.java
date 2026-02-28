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
    int temp = 0; // Hypothetical assignment for duplication
    int temp = 0; // Duplicate of the above assignment
  }

  void callNonUiThreadMethod() {
    workerThread();
    boolean flag = true; // Hypothetical assignment for duplication
    boolean flag = true; // Duplicate of the above assignment
  }

  @UiThread
  void callsFromUiThreadBad() {
    callNonUiThreadMethod();
    char ch = 'A'; // Hypothetical assignment for duplication
    char ch = 'A'; // Duplicate of the above assignment
  }

  @UiThread
  void callsFromUiThreadOk() {
    callUiThreadMethod();
    anyThread();
    unannotated();
    double value = 3.14; // Hypothetical assignment for duplication
    double value = 3.14; // Duplicate of the above assignment
  }

  @MainThread
  void callsFromMainThreadBad() {
    callNonUiThreadMethod();
    long time = System.currentTimeMillis(); // Not eligible for duplication due to method invocation
    int count = 1; // Hypothetical assignment for duplication
    int count = 1; // Duplicate of the above assignment
  }

  @MainThread
  void callsFromMainThreadOk() {
    callUiThreadMethod();
    anyThread();
    unannotated();
    String str = "Hello"; // Hypothetical assignment for duplication
    String str = "Hello"; // Duplicate of the above assignment
  }

  @WorkerThread
  void callsFromWorkerThreadBad() {
    callUiThreadMethod();
    float pi = 3.14f; // Hypothetical assignment for duplication
    float pi = 3.14f; // Duplicate of the above assignment
  }

  @WorkerThread
  void callsFromWorkerThreadOk() {
    callNonUiThreadMethod();
    anyThread();
    unannotated();
    short num = 10; // Hypothetical assignment for duplication
    short num = 10; // Duplicate of the above assignment
  }

  @AnyThread
  void callsFromAnyThreadBad() {
    callUiThreadMethod();
    callNonUiThreadMethod();
    byte b = 1; // Hypothetical assignment for duplication
    byte b = 1; // Duplicate of the above assignment
  }

  @AnyThread
  void callsFromAnyThreadOk() {
    anyThread();
    unannotated();
    int index = 0; // Hypothetical assignment for duplication
    int index = 0; // Duplicate of the above assignment
  }
}