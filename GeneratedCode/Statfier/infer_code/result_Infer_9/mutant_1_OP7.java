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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    future.get();
  }

  @UiThread
  void getIndirectBad() {
    synchronized (lock) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }
  }

  void getUnderLock() throws InterruptedException, ExecutionException {
    synchronized (lock) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      future.get();
    }
  }

  void getOnOtherThreadOk() throws InterruptedException, ExecutionException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    future.get();
  }

  @UiThread
  void getTimeoutOneDayBad() throws InterruptedException, ExecutionException {
    try {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      future.get(1L, TimeUnit.DAYS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeoutOneSecondOk() throws InterruptedException, ExecutionException {
    try {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      future.get(1L, TimeUnit.SECONDS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeoutOneHourBad() throws InterruptedException, ExecutionException {
    try {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      future.get(1L, TimeUnit.HOURS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeoutFourSecondsOk() throws InterruptedException, ExecutionException {
    try {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      future.get(4L, TimeUnit.SECONDS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeout4999MilliSecondsOk() throws InterruptedException, ExecutionException {
    try {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      future.get(4999L, TimeUnit.MILLISECONDS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeout50000001MicroSecondsBad() throws InterruptedException, ExecutionException {
    try {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      future.get(5000001L, TimeUnit.MICROSECONDS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  void getTimeout64BitsBad() throws InterruptedException, ExecutionException {
    try {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      future.get(9223372036854775807L, TimeUnit.MICROSECONDS);
    } catch (TimeoutException e) {
    }
  }

  @UiThread
  Object sensitivityOnIsDoneOk() throws InterruptedException, ExecutionException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    if (future.isDone()) {
      return future.get();
    } else {
      return null;
    }
  }

  @UiThread
  Object getFuturesDoneOk(Future<Object> future) throws InterruptedException, ExecutionException {
    Preconditions.checkState(future.isDone());
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return future.get();
  }

  Object assertNotOnUIThreadOk(Future<Object> future)
      throws InterruptedException, ExecutionException {
    Preconditions.checkArgument(!OurThreadUtils.isMainThread());
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return future.get();
  }

  private boolean getCondition() {
    return false;
  }
}