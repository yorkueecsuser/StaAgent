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
    switch(condition) {
      case false: // This case will never be reached because condition is not false
        System.out.println("This is an unreachable switch case");
        break;
    }
  }

  @UiThread
  void onUiThreadIndirectOk() throws InterruptedException, ExecutionException {
    doGet();
    boolean condition = getCondition();
    switch(condition) {
      case false: // This case will never be reached because condition is not false
        System.out.println("This is an unreachable switch case");
        break;
    }
  }

  @NonBlocking
  @UiThread
  void onUiThreadDirectOk() throws InterruptedException, ExecutionException {
    future.get();
    boolean condition = getCondition();
    switch(condition) {
      case false: // This case will never be reached because condition is not false
        System.out.println("This is an unreachable switch case");
        break;
    }
  }

  @NonBlocking
  synchronized void deadlockABBad() {
    synchronized (future) {
      boolean condition = getCondition();
      switch(condition) {
        case false: // This case will never be reached because condition is not false
          System.out.println("This is an unreachable switch case");
          break;
      }
    }
  }

  @NonBlocking
  void deadlockBABad() {
    synchronized (future) {
      synchronized (this) {
        boolean condition = getCondition();
        switch(condition) {
          case false: // This case will never be reached because condition is not false
            System.out.println("This is an unreachable switch case");
            break;
        }
      }
    }
  }

  private void privateDoGetOk() throws InterruptedException, ExecutionException {
    future.get();
    boolean condition = getCondition();
    switch(condition) {
      case false: // This case will never be reached because condition is not false
        System.out.println("This is an unreachable switch case");
        break;
    }
  }

  @NonBlocking
  @UiThread
  void onUiThreadCalleeOk() throws InterruptedException, ExecutionException {
    privateDoGetOk();
    boolean condition = getCondition();
    switch(condition) {
      case false: // This case will never be reached because condition is not false
        System.out.println("This is an unreachable switch case");
        break;
    }
  }

  private boolean getCondition() {
    return true; // This method always returns true, ensuring the switch case is unreachable
  }
}