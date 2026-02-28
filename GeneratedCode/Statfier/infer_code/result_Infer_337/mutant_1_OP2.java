import android.support.annotation.UiThread;
import codetoanalyze.java.annotation.NonBlocking;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class NonBlk {
  Future future;
  Future futureCopy; // Added duplicate variable for potential future use

  @NonBlocking
  void doGet() throws InterruptedException, ExecutionException {
    future.get();
    future.get(); // Duplicate of the original assignment statement
  }

  @UiThread
  void onUiThreadIndirectOk() throws InterruptedException, ExecutionException {
    doGet();
  }

  @NonBlocking
  @UiThread
  void onUiThreadDirectOk() throws InterruptedException, ExecutionException {
    future.get();
    future.get(); // Duplicate of the original assignment statement
  }

  @NonBlocking
  synchronized void deadlockABBad() {
    synchronized (future) {
      synchronized (future) {} // Duplicate of the original synchronization block
    }
  }

  @NonBlocking
  void deadlockBABad() {
    synchronized (future) {
      synchronized (this) {
        synchronized (this) {} // Duplicate of the original synchronization block
      }
    }
  }

  private void privateDoGetOk() throws InterruptedException, ExecutionException {
    future.get();
    future.get(); // Duplicate of the original assignment statement
  }

  @NonBlocking
  @UiThread
  void onUiThreadCalleeOk() throws InterruptedException, ExecutionException {
    privateDoGetOk();
  }
}