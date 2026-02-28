import android.os.AsyncTask;
import android.support.annotation.UiThread;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class AsyncTaskGet {
  CountTask task;
  Object lock;

  @UiThread
  void taskGetOnUiThreadBad() throws InterruptedException, ExecutionException {
    task.get();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is always executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  @UiThread
  void taskGetWithTimeoutOnUiThreadOk()
      throws TimeoutException, InterruptedException, ExecutionException {
    task.get(1000, TimeUnit.NANOSECONDS);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is always executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  @UiThread
  void lockOnUiThreadBad() {
    synchronized (lock) {
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("Unreachable case 0");
          break;
        case 1:
          // This case is always executed
          System.out.println("Reachable case 1");
          break;
      }
    }
  }

  void taskGetUnderLock() throws InterruptedException, ExecutionException {
    synchronized (lock) {
      task.get();
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("Unreachable case 0");
          break;
        case 1:
          // This case is always executed
          System.out.println("Reachable case 1");
          break;
      }
    }
  }

  void taskGetonBGThreadOk() throws InterruptedException, ExecutionException {
    task.get();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is always executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}

class CountTask extends AsyncTask<Integer, Void, Long> {
  protected Long doInBackground(Integer... ints) {
    long totalSize = 0;
    for (int i = 0; i < ints.length; i++) {
      totalSize += ints[i];
      if (isCancelled()) break;
    }
    return totalSize;
  }
}