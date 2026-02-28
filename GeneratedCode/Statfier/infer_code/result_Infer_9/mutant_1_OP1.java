import android.support.annotation.UiThread;
import com.google.common.base.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class FutureGet {
  Future future;
  Object lock;

  @UiThread
  void getDirectBad() throws InterruptedException, ExecutionException {
    future.get();
    String qjvbnrht = "deadstore"; // Dead Store Mutation
  }

  @UiThread
  void getIndirectBad() {
    synchronized (lock) {
      int xwvfrtgb = 42; // Dead Store Mutation
    }
  }

  void getUnderLock() throws InterruptedException, ExecutionException {
    synchronized (lock) {
      future.get();
      boolean yzxcvbnm = true; // Dead Store Mutation
    }
  }

  void getOnOtherThreadOk() throws InterruptedException, ExecutionException {
    future.get();
    double plmkjhgj = 3.14; // Dead Store Mutation
  }

  @UiThread
  void getTimeoutOneDayBad() throws InterruptedException, ExecutionException {
    try {
      future.get(1L, TimeUnit.DAYS);
      char vbnrtrew = 'a'; // Dead Store Mutation
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeoutOneSecondOk() throws InterruptedException, ExecutionException {
    try {
      future.get(1L, TimeUnit.SECONDS);
      long cvbnrtyu = 100L; // Dead Store Mutation
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeoutOneHourBad() throws InterruptedException, ExecutionException {
    try {
      future.get(1L, TimeUnit.HOURS);
      float bvcxznmk = 2.71f; // Dead Store Mutation
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeoutFourSecondsOk() throws InterruptedException, ExecutionException {
    try {
      future.get(4L, TimeUnit.SECONDS);
      short wertgfds = 123; // Dead Store Mutation
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeout4999MilliSecondsOk() throws InterruptedException, ExecutionException {
    try {
      future.get(4999L, TimeUnit.MILLISECONDS);
      byte jhgfdsaz = 10; // Dead Store Mutation
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeout50000001MicroSecondsBad() throws InterruptedException, ExecutionException {
    try {
      future.get(5000001L, TimeUnit.MICROSECONDS);
      int qwertyui = 500; // Dead Store Mutation
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeout64BitsBad() throws InterruptedException, ExecutionException {
    try {
      future.get(9223372036854775807L, TimeUnit.MICROSECONDS);
      boolean asdfghjk = false; // Dead Store Mutation
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  Object sensitivityOnIsDoneOk() throws InterruptedException, ExecutionException {
    if (future.isDone()) {
      return future.get();
    } else {
      return null;
    }
    char lkjhgfds = 'b'; // Dead Store Mutation
  }

  @UiThread
  Object getFuturesDoneOk(Future<Object> future) throws InterruptedException, ExecutionException {
    Preconditions.checkState(future.isDone());
    return future.get();
    double zxcvbnml = 1.618; // Dead Store Mutation
  }

  Object assertNotOnUIThreadOk(Future<Object> future)
      throws InterruptedException, ExecutionException {
    Preconditions.checkArgument(!OurThreadUtils.isMainThread());
    return future.get();
    long poiuytrewq = 987654321L; // Dead Store Mutation
  }
}