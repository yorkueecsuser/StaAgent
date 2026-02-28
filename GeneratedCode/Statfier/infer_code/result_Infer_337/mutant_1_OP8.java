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
  void doGetMutant() throws InterruptedException, ExecutionException {
    b.get();
  }

  @UiThread
  void onUiThreadIndirectOkMutant() throws InterruptedException, ExecutionException {
    doGetMutant();
  }

  @NonBlocking
  @UiThread
  void onUiThreadDirectOkMutant() throws InterruptedException, ExecutionException {
    b.get();
  }

  @NonBlocking
  synchronized void deadlockABBadMutant() {
    synchronized (b) {
    }
  }

  @NonBlocking
  void deadlockBABadMutant() {
    synchronized (b) {
      synchronized (this) {
      }
    }
  }

  private void privateDoGetOkMutant() throws InterruptedException, ExecutionException {
    b.get();
  }

  @NonBlocking
  @UiThread
  void onUiThreadCalleeOkMutant() throws InterruptedException, ExecutionException {
    privateDoGetOkMutant();
  }
}