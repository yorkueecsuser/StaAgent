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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    task.get();
  }

  @UiThread
  void taskGetWithTimeoutOnUiThreadOk()
      throws TimeoutException, InterruptedException, ExecutionException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    task.get(1000, TimeUnit.NANOSECONDS);
  }

  @UiThread
  void lockOnUiThreadBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    synchronized (lock) {
    }
  }

  void taskGetUnderLock() throws InterruptedException, ExecutionException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    synchronized (lock) {
      task.get();
    }
  }

  void taskGetonBGThreadOk() throws InterruptedException, ExecutionException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    task.get();
  }

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