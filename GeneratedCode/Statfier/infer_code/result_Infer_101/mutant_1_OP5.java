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
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable but does nothing
        break;
      case false:
        // This case is unreachable because condition is never false
        System.out.println("This is an unreachable switch case");
        break;
    }
  }

  @UiThread
  void taskGetWithTimeoutOnUiThreadOk()
      throws TimeoutException, InterruptedException, ExecutionException {
    task.get(1000, TimeUnit.NANOSECONDS);
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable but does nothing
        break;
      case false:
        // This case is unreachable because condition is never false
        System.out.println("This is an unreachable switch case");
        break;
    }
  }

  @UiThread
  void lockOnUiThreadBad() {
    synchronized (lock) {
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is reachable but does nothing
          break;
        case false:
          // This case is unreachable because condition is never false
          System.out.println("This is an unreachable switch case");
          break;
      }
    }
  }

  void taskGetUnderLock() throws InterruptedException, ExecutionException {
    synchronized (lock) {
      task.get();
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is reachable but does nothing
          break;
        case false:
          // This case is unreachable because condition is never false
          System.out.println("This is an unreachable switch case");
          break;
      }
    }
  }

  void taskGetonBGThreadOk() throws InterruptedException, ExecutionException {
    task.get();
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable but does nothing
        break;
      case false:
        // This case is unreachable because condition is never false
        System.out.println("This is an unreachable switch case");
        break;
    }
  }

  private boolean getCondition() {
    return true; // This ensures the switch case with 'false' is unreachable
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