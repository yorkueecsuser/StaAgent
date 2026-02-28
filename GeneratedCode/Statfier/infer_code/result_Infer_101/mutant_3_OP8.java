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

  // Mutant: Renamed 'task' to 'a'
  @UiThread
  void taskGetOnUiThreadBadMutantA() throws InterruptedException, ExecutionException {
    a.get();
  }

  @UiThread
  void taskGetWithTimeoutOnUiThreadOk()
      throws TimeoutException, InterruptedException, ExecutionException {
    task.get(1000, TimeUnit.NANOSECONDS);
  }

  // Mutant: Renamed 'task' to 'b'
  @UiThread
  void taskGetWithTimeoutOnUiThreadOkMutantB()
      throws TimeoutException, InterruptedException, ExecutionException {
    b.get(1000, TimeUnit.NANOSECONDS);
  }

  @UiThread
  void lockOnUiThreadBad() {
    synchronized (lock) {
    }
  }

  // Mutant: Renamed 'lock' to 'c'
  @UiThread
  void lockOnUiThreadBadMutantC() {
    synchronized (c) {
    }
  }

  void taskGetUnderLock() throws InterruptedException, ExecutionException {
    synchronized (lock) {
      task.get();
    }
  }

  // Mutant: Renamed 'lock' to 'd'
  void taskGetUnderLockMutantD() throws InterruptedException, ExecutionException {
    synchronized (d) {
      task.get();
    }
  }

  void taskGetonBGThreadOk() throws InterruptedException, ExecutionException {
    task.get();
  }

  // Mutant: Renamed 'task' to 'e'
  void taskGetonBGThreadOkMutantE() throws InterruptedException, ExecutionException {
    e.get();
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