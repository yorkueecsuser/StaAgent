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
    boolean alwaysFalse = getCondition();
    switch(alwaysFalse) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  @UiThread
  void onUiThreadIndirectOk() throws InterruptedException, ExecutionException {
    doGet();
    // Inserting unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch(alwaysFalse) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  @NonBlocking
  @UiThread
  void onUiThreadDirectOk() throws InterruptedException, ExecutionException {
    future.get();
    // Inserting unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch(alwaysFalse) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  @NonBlocking
  synchronized void deadlockABBad() {
    synchronized (future) {
      // Inserting unreachable switch statement
      boolean alwaysFalse = getCondition();
      switch(alwaysFalse) {
        case true:
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  @NonBlocking
  void deadlockBABad() {
    synchronized (future) {
      synchronized (this) {
        // Inserting unreachable switch statement
        boolean alwaysFalse = getCondition();
        switch(alwaysFalse) {
          case true:
            System.out.println("This is unreachable");
            break;
        }
      }
    }
  }

  private void privateDoGetOk() throws InterruptedException, ExecutionException {
    future.get();
    // Inserting unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch(alwaysFalse) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  @NonBlocking
  @UiThread
  void onUiThreadCalleeOk() throws InterruptedException, ExecutionException {
    privateDoGetOk();
    // Inserting unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch(alwaysFalse) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  // Helper method to ensure the switch condition is not a compile-time constant
  private boolean getCondition() {
    return false;
  }
}