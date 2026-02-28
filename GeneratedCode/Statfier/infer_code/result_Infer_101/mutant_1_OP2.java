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
    task.get(); // Mutation: Duplicate assignment statement
  }

  @UiThread
  void taskGetWithTimeoutOnUiThreadOk()
      throws TimeoutException, InterruptedException, ExecutionException {
    task.get(1000, TimeUnit.NANOSECONDS);
    task.get(1000, TimeUnit.NANOSECONDS); // Mutation: Duplicate assignment statement
  }

  @UiThread
  void lockOnUiThreadBad() {
    synchronized (lock) {
    }
    synchronized (lock) { // Mutation: Duplicate assignment statement
    }
  }

  void taskGetUnderLock() throws InterruptedException, ExecutionException {
    synchronized (lock) {
      task.get();
      task.get(); // Mutation: Duplicate assignment statement
    }
  }

  void taskGetonBGThreadOk() throws InterruptedException, ExecutionException {
    task.get();
    task.get(); // Mutation: Duplicate assignment statement
  }
}

class CountTask extends AsyncTask<Integer, Void, Long> {
  protected Long doInBackground(Integer... ints) {
    long totalSize = 0;
    for (int i = 0; i < ints.length; i++) {
      totalSize += ints[i];
      totalSize += ints[i]; // Mutation: Duplicate assignment statement
      if (isCancelled()) break;
    }
    return totalSize;
  }
}