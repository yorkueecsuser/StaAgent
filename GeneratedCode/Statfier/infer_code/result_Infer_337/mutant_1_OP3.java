import android.support.annotation.UiThread;
import codetoanalyze.java.annotation.NonBlocking;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class NonBlk {
  Future future;

  @NonBlocking
  void doGet() throws InterruptedException, ExecutionException {
    future.get();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
  }

  @UiThread
  void onUiThreadIndirectOk() throws InterruptedException, ExecutionException {
    doGet();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
  }

  @NonBlocking
  @UiThread
  void onUiThreadDirectOk() throws InterruptedException, ExecutionException {
    future.get();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
  }

  @NonBlocking
  synchronized void deadlockABBad() {
    synchronized (future) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement");
      }
    }
  }

  @NonBlocking
  void deadlockBABad() {
    synchronized (future) {
      synchronized (this) {
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("This is an unreachable if statement");
        }
      }
    }
  }

  private void privateDoGetOk() throws InterruptedException, ExecutionException {
    future.get();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
  }

  @NonBlocking
  @UiThread
  void onUiThreadCalleeOk() throws InterruptedException, ExecutionException {
    privateDoGetOk();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
  }

  private boolean getCondition() {
    return false;
  }
}