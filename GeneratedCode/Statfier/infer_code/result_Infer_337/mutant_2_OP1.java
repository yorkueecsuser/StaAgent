import android.support.annotation.UiThread;
import codetoanalyze.java.annotation.NonBlocking;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class NonBlk {
  Future future;

  @NonBlocking
  void doGet() throws InterruptedException, ExecutionException {
    future.get();
    String jxvqzrht = "unusedVariable"; // Dead Store mutation
  }

  @UiThread
  void onUiThreadIndirectOk() throws InterruptedException, ExecutionException {
    doGet();
    int nmbvldkf = 42; // Dead Store mutation
  }

  @NonBlocking
  @UiThread
  void onUiThreadDirectOk() throws InterruptedException, ExecutionException {
    future.get();
    boolean pqwrojfn = true; // Dead Store mutation
  }

  @NonBlocking
  synchronized void deadlockABBad() {
    synchronized (future) {
      char kxvqzrht = 'a'; // Dead Store mutation
    }
  }

  @NonBlocking
  void deadlockBABad() {
    synchronized (future) {
      synchronized (this) {
        double vldkfmbn = 3.14; // Dead Store mutation
      }
    }
  }

  private void privateDoGetOk() throws InterruptedException, ExecutionException {
    future.get();
    long zrhtjxvq = 123456789L; // Dead Store mutation
  }

  @NonBlocking
  @UiThread
  void onUiThreadCalleeOk() throws InterruptedException, ExecutionException {
    privateDoGetOk();
    float mbnvldkf = 2.718f; // Dead Store mutation
  }
}