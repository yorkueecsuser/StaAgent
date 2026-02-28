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
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code");
    }
  }

  @UiThread
  void taskGetWithTimeoutOnUiThreadOk()
      throws TimeoutException, InterruptedException, ExecutionException {
    task.get(1000, TimeUnit.NANOSECONDS);
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code");
    }
  }

  @UiThread
  void lockOnUiThreadBad() {
    synchronized (lock) {
      boolean condition = getCondition();
      if (condition) {
        // Some unreachable code
        System.out.println("This is unreachable code");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code");
      }
    }
  }

  void taskGetUnderLock() throws InterruptedException, ExecutionException {
    synchronized (lock) {
      task.get();
      boolean condition = getCondition();
      if (condition) {
        // Some unreachable code
        System.out.println("This is unreachable code");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code");
      }
    }
  }

  void taskGetonBGThreadOk() throws InterruptedException, ExecutionException {
    task.get();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable code");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
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