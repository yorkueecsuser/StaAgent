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
    String yqzjfnbx = "unused";
  }

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
    int vbnrhtyq = 42;
  }

  void callNonUiThreadMethod() {
    workerThread();
    boolean jklmnpqr = true;
  }

  @UiThread
  void callsFromUiThreadBad() {
    callNonUiThreadMethod();
    char xwvutsrq = 'a';
  }

  @UiThread
  void callsFromUiThreadOk() {
    callUiThreadMethod();
    anyThread();
    unannotated();
    double plmkjihg = 3.14;
  }

  @MainThread
  void callsFromMainThreadBad() {
    callNonUiThreadMethod();
    float opqrstuv = 2.71f;
  }

  @MainThread
  void callsFromMainThreadOk() {
    callUiThreadMethod();
    anyThread();
    unannotated();
    long wxyzabcd = 100L;
  }

  @WorkerThread
  void callsFromWorkerThreadBad() {
    callUiThreadMethod();
    short efghijkl = 10;
  }

  @WorkerThread
  void callsFromWorkerThreadOk() {
    callNonUiThreadMethod();
    anyThread();
    unannotated();
    byte mnopqrst = 20;
  }

  @AnyThread
  void callsFromAnyThreadBad() {
    callUiThreadMethod();
    callNonUiThreadMethod();
    String tuvwxyza = "another unused";
  }

  @AnyThread
  void callsFromAnyThreadOk() {
    anyThread();
    unannotated();
    int rstuvwxy = 99;
  }
}