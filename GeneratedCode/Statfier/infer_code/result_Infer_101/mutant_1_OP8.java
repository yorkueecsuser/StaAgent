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
  }

  @UiThread
  void taskGetWithTimeoutOnUiThreadOk()
      throws TimeoutException, InterruptedException, ExecutionException {
    task.get(1000, TimeUnit.NANOSECONDS);
  }

  @UiThread
  void lockOnUiThreadBad() {
    synchronized (lock) {
    }
  }

  void taskGetUnderLock() throws InterruptedException, ExecutionException {
    synchronized (lock) {
      task.get();
    }
  }

  void taskGetonBGThreadOk() throws InterruptedException, ExecutionException {
    task.get();
  }

  // Mutated code
  CountTask q;
  Object m;

  @UiThread
  void taskGetOnUiThreadBadMutant() throws InterruptedException, ExecutionException {
    q.get();
  }

  @UiThread
  void taskGetWithTimeoutOnUiThreadOkMutant()
      throws TimeoutException, InterruptedException, ExecutionException {
    q.get(1000, TimeUnit.NANOSECONDS);
  }

  @UiThread
  void lockOnUiThreadBadMutant() {
    synchronized (m) {
    }
  }

  void taskGetUnderLockMutant() throws InterruptedException, ExecutionException {
    synchronized (m) {
      q.get();
    }
  }

  void taskGetonBGThreadOkMutant() throws InterruptedException, ExecutionException {
    q.get();
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