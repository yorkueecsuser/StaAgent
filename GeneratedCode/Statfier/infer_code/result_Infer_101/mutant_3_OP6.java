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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @UiThread
  void taskGetWithTimeoutOnUiThreadOk()
      throws TimeoutException, InterruptedException, ExecutionException {
    task.get(1000, TimeUnit.NANOSECONDS);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @UiThread
  void lockOnUiThreadBad() {
    synchronized (lock) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    }
  }

  void taskGetUnderLock() throws InterruptedException, ExecutionException {
    synchronized (lock) {
      task.get();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    }
  }

  void taskGetonBGThreadOk() throws InterruptedException, ExecutionException {
    task.get();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
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