import android.support.annotation.UiThread;
import codetoanalyze.java.annotation.NonBlocking;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class NonBlk {
  Future future;

  @NonBlocking
  void doGet() throws InterruptedException, ExecutionException {
    future.get();
    String qwejfnrj = "unused"; // Dead store mutation
  }

  @UiThread
  void onUiThreadIndirectOk() throws InterruptedException, ExecutionException {
    doGet();
    int xhjvbnrj = 42; // Dead store mutation
  }

  @NonBlocking
  @UiThread
  void onUiThreadDirectOk() throws InterruptedException, ExecutionException {
    future.get();
    boolean rjfnxhvj = true; // Dead store mutation
  }

  @NonBlocking
  synchronized void deadlockABBad() {
    synchronized (future) {
      char tjfnrjvh = 'a'; // Dead store mutation
    }
  }

  @NonBlocking
  void deadlockBABad() {
    synchronized (future) {
      synchronized (this) {
        double tjfnrjvh = 3.14; // Dead store mutation
      }
    }
  }

  private void privateDoGetOk() throws InterruptedException, ExecutionException {
    future.get();
    long tjfnrjvh = 123456789L; // Dead store mutation
  }

  @NonBlocking
  @UiThread
  void onUiThreadCalleeOk() throws InterruptedException, ExecutionException {
    privateDoGetOk();
    float tjfnrjvh = 1.0f; // Dead store mutation
  }
}