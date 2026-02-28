import android.support.annotation.UiThread;
import codetoanalyze.java.annotation.NonBlocking;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class NonBlk {
  Future future;

  @NonBlocking
  void doGet() throws InterruptedException, ExecutionException {
    future.get();
  }

  @UiThread
  void onUiThreadIndirectOk() throws InterruptedException, ExecutionException {
    doGet();
  }

  @NonBlocking
  @UiThread
  void onUiThreadDirectOk() throws InterruptedException, ExecutionException {
    future.get();
  }

  @NonBlocking
  synchronized void deadlockABBad() {
    synchronized (future) {
    }
  }

  @NonBlocking
  void deadlockBABad() {
    synchronized (future) {
      synchronized (this) {
      }
    }
  }

  private void privateDoGetOk() throws InterruptedException, ExecutionException {
    future.get();
  }

  @NonBlocking
  @UiThread
  void onUiThreadCalleeOk() throws InterruptedException, ExecutionException {
    privateDoGetOk();
  }

  // Mutated code
  Future b;

  @NonBlocking
  void doGetMutated() throws InterruptedException, ExecutionException {
    b.get();
  }

  @UiThread
  void onUiThreadIndirectOkMutated() throws InterruptedException, ExecutionException {
    doGetMutated();
  }

  @NonBlocking
  @UiThread
  void onUiThreadDirectOkMutated() throws InterruptedException, ExecutionException {
    b.get();
  }

  @NonBlocking
  synchronized void deadlockABBadMutated() {
    synchronized (b) {
    }
  }

  @NonBlocking
  void deadlockBABadMutated() {
    synchronized (b) {
      synchronized (this) {
      }
    }
  }

  private void privateDoGetOkMutated() throws InterruptedException, ExecutionException {
    b.get();
  }

  @NonBlocking
  @UiThread
  void onUiThreadCalleeOkMutated() throws InterruptedException, ExecutionException {
    privateDoGetOkMutated();
  }
}