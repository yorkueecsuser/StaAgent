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
    // Dead store mutation
    int abcdefgh = 42;
  }

  @UiThread
  void taskGetWithTimeoutOnUiThreadOk()
      throws TimeoutException, InterruptedException, ExecutionException {
    task.get(1000, TimeUnit.NANOSECONDS);
    // Dead store mutation
    String ijklmnop = "unused";
  }

  @UiThread
  void lockOnUiThreadBad() {
    synchronized (lock) {
      // Dead store mutation
      boolean qrstuvwx = true;
    }
  }

  void taskGetUnderLock() throws InterruptedException, ExecutionException {
    synchronized (lock) {
      task.get();
      // Dead store mutation
      double yzabcdef = 3.14;
    }
  }

  void taskGetonBGThreadOk() throws InterruptedException, ExecutionException {
    task.get();
    // Dead store mutation
    char ghijklmn = 'x';
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
    // Dead store mutation
    float opqrstuv = 2.71f;
  }
}