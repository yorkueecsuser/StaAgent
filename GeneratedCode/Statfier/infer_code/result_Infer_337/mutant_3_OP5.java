import android.support.annotation.UiThread;
import codetoanalyze.java.annotation.NonBlocking;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class NonBlk {
  Future future;

  @NonBlocking
  void doGet() throws InterruptedException, ExecutionException {
    future.get();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is never set to true
        System.out.println("Unreachable case");
        break;
    }
  }

  @UiThread
  void onUiThreadIndirectOk() throws InterruptedException, ExecutionException {
    doGet();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is never set to true
        System.out.println("Unreachable case");
        break;
    }
  }

  @NonBlocking
  @UiThread
  void onUiThreadDirectOk() throws InterruptedException, ExecutionException {
    future.get();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is never set to true
        System.out.println("Unreachable case");
        break;
    }
  }

  @NonBlocking
  synchronized void deadlockABBad() {
    synchronized (future) {
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is unreachable because condition is never set to true
          System.out.println("Unreachable case");
          break;
      }
    }
  }

  @NonBlocking
  void deadlockBABad() {
    synchronized (future) {
      synchronized (this) {
        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This case is unreachable because condition is never set to true
            System.out.println("Unreachable case");
            break;
        }
      }
    }
  }

  private void privateDoGetOk() throws InterruptedException, ExecutionException {
    future.get();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is never set to true
        System.out.println("Unreachable case");
        break;
    }
  }

  @NonBlocking
  @UiThread
  void onUiThreadCalleeOk() throws InterruptedException, ExecutionException {
    privateDoGetOk();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is never set to true
        System.out.println("Unreachable case");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}