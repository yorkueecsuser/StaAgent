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
    future.get(); // Mutant: Duplicate of future.get();
  }

  @UiThread
  void getIndirectBad() {
    synchronized (lock) {
    }
  }

  void getUnderLock() throws InterruptedException, ExecutionException {
    synchronized (lock) {
      future.get();
      future.get(); // Mutant: Duplicate of future.get();
    }
  }

  void getOnOtherThreadOk() throws InterruptedException, ExecutionException {
    future.get();
    future.get(); // Mutant: Duplicate of future.get();
  }

  @UiThread
  void getTimeoutOneDayBad() throws InterruptedException, ExecutionException {
    try {
      future.get(1L, TimeUnit.DAYS);
      future.get(1L, TimeUnit.DAYS); // Mutant: Duplicate of future.get(1L, TimeUnit.DAYS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeoutOneSecondOk() throws InterruptedException, ExecutionException {
    try {
      future.get(1L, TimeUnit.SECONDS);
      future.get(1L, TimeUnit.SECONDS); // Mutant: Duplicate of future.get(1L, TimeUnit.SECONDS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeoutOneHourBad() throws InterruptedException, ExecutionException {
    try {
      future.get(1L, TimeUnit.HOURS);
      future.get(1L, TimeUnit.HOURS); // Mutant: Duplicate of future.get(1L, TimeUnit.HOURS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeoutFourSecondsOk() throws InterruptedException, ExecutionException {
    try {
      future.get(4L, TimeUnit.SECONDS);
      future.get(4L, TimeUnit.SECONDS); // Mutant: Duplicate of future.get(4L, TimeUnit.SECONDS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeout4999MilliSecondsOk() throws InterruptedException, ExecutionException {
    try {
      future.get(4999L, TimeUnit.MILLISECONDS);
      future.get(4999L, TimeUnit.MILLISECONDS); // Mutant: Duplicate of future.get(4999L, TimeUnit.MILLISECONDS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeout50000001MicroSecondsBad() throws InterruptedException, ExecutionException {
    try {
      future.get(5000001L, TimeUnit.MICROSECONDS);
      future.get(5000001L, TimeUnit.MICROSECONDS); // Mutant: Duplicate of future.get(5000001L, TimeUnit.MICROSECONDS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeout64BitsBad() throws InterruptedException, ExecutionException {
    try {
      future.get(9223372036854775807L, TimeUnit.MICROSECONDS);
      future.get(9223372036854775807L, TimeUnit.MICROSECONDS); // Mutant: Duplicate of future.get(9223372036854775807L, TimeUnit.MICROSECONDS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  Object sensitivityOnIsDoneOk() throws InterruptedException, ExecutionException {
    if (future.isDone()) {
      return future.get();
      // No applicable assignment statement to duplicate without method invocation
    } else {
      return null;
      // No applicable assignment statement to duplicate without method invocation
    }
  }

  @UiThread
  Object getFuturesDoneOk(Future<Object> future) throws InterruptedException, ExecutionException {
    Preconditions.checkState(future.isDone());
    return future.get();
    // No applicable assignment statement to duplicate without method invocation
  }

  Object assertNotOnUIThreadOk(Future<Object> future)
      throws InterruptedException, ExecutionException {
    Preconditions.checkArgument(!OurThreadUtils.isMainThread());
    return future.get();
    // No applicable assignment statement to duplicate without method invocation
  }
}