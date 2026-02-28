import android.support.annotation.UiThread;
import codetoanalyze.java.annotation.NonBlocking;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class NonBlk {
  Future future;

  @NonBlocking
  void doGet() throws InterruptedException, ExecutionException {
    future.get();
    String abcdefgh = "unusedVariable"; // Dead Store mutation
  }

  @UiThread
  void onUiThreadIndirectOk() throws InterruptedException, ExecutionException {
    doGet();
    int hijklmno = 42; // Dead Store mutation
  }

  @NonBlocking
  @UiThread
  void onUiThreadDirectOk() throws InterruptedException, ExecutionException {
    future.get();
    boolean opqrstuv = true; // Dead Store mutation
  }

  @NonBlocking
  synchronized void deadlockABBad() {
    synchronized (future) {
      char vwxyzabc = 'x'; // Dead Store mutation
    }
  }

  @NonBlocking
  void deadlockBABad() {
    synchronized (future) {
      synchronized (this) {
        double cdefghij = 3.14; // Dead Store mutation
      }
    }
  }

  private void privateDoGetOk() throws InterruptedException, ExecutionException {
    future.get();
    float klmnopqr = 2.71f; // Dead Store mutation
  }

  @NonBlocking
  @UiThread
  void onUiThreadCalleeOk() throws InterruptedException, ExecutionException {
    privateDoGetOk();
    long stuvwxyz = 987654321L; // Dead Store mutation
  }
}