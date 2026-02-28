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
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This default case is unreachable because condition is never set to anything other than true
        break;
    }
  }

  @UiThread
  void getIndirectBad() {
    synchronized (lock) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is reachable but does nothing
          break;
        default:
          // This default case is unreachable because condition is never set to anything other than true
          break;
      }
    }
  }

  void getUnderLock() throws InterruptedException, ExecutionException {
    synchronized (lock) {
      future.get();
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is reachable but does nothing
          break;
        default:
          // This default case is unreachable because condition is never set to anything other than true
          break;
      }
    }
  }

  void getOnOtherThreadOk() throws InterruptedException, ExecutionException {
    future.get();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This default case is unreachable because condition is never set to anything other than true
        break;
    }
  }

  @UiThread
  void getTimeoutOneDayBad() throws InterruptedException, ExecutionException {
    try {
      future.get(1L, TimeUnit.DAYS);
    } catch (TimeoutException e) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is reachable but does nothing
          break;
        default:
          // This default case is unreachable because condition is never set to anything other than true
          break;
      }
    }
  }

  @UiThread
  void getTimeoutOneSecondOk() throws InterruptedException, ExecutionException {
    try {
      future.get(1L, TimeUnit.SECONDS);
    } catch (TimeoutException e) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is reachable but does nothing
          break;
        default:
          // This default case is unreachable because condition is never set to anything other than true
          break;
      }
    }
  }

  @UiThread
  void getTimeoutOneHourBad() throws InterruptedException, ExecutionException {
    try {
      future.get(1L, TimeUnit.HOURS);
    } catch (TimeoutException e) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is reachable but does nothing
          break;
        default:
          // This default case is unreachable because condition is never set to anything other than true
          break;
      }
    }
  }

  @UiThread
  void getTimeoutFourSecondsOk() throws InterruptedException, ExecutionException {
    try {
      future.get(4L, TimeUnit.SECONDS);
    } catch (TimeoutException e) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is reachable but does nothing
          break;
        default:
          // This default case is unreachable because condition is never set to anything other than true
          break;
      }
    }
  }

  @UiThread
  void getTimeout4999MilliSecondsOk() throws InterruptedException, ExecutionException {
    try {
      future.get(4999L, TimeUnit.MILLISECONDS);
    } catch (TimeoutException e) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is reachable but does nothing
          break;
        default:
          // This default case is unreachable because condition is never set to anything other than true
          break;
      }
    }
  }

  @UiThread
  void getTimeout50000001MicroSecondsBad() throws InterruptedException, ExecutionException {
    try {
      future.get(5000001L, TimeUnit.MICROSECONDS);
    } catch (TimeoutException e) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is reachable but does nothing
          break;
        default:
          // This default case is unreachable because condition is never set to anything other than true
          break;
      }
    }
  }

  @UiThread
  void getTimeout64BitsBad() throws InterruptedException, ExecutionException {
    try {
      future.get(9223372036854775807L, TimeUnit.MICROSECONDS);
    } catch (TimeoutException e) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is reachable but does nothing
          break;
        default:
          // This default case is unreachable because condition is never set to anything other than true
          break;
      }
    }
  }

  @UiThread
  Object sensitivityOnIsDoneOk() throws InterruptedException, ExecutionException {
    if (future.isDone()) {
      return future.get();
    } else {
      return null;
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This default case is unreachable because condition is never set to anything other than true
        break;
    }
  }

  @UiThread
  Object getFuturesDoneOk(Future<Object> future) throws InterruptedException, ExecutionException {
    Preconditions.checkState(future.isDone());
    return future.get();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This default case is unreachable because condition is never set to anything other than true
        break;
    }
  }

  Object assertNotOnUIThreadOk(Future<Object> future)
      throws InterruptedException, ExecutionException {
    Preconditions.checkArgument(!OurThreadUtils.isMainThread());
    return future.get();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This default case is unreachable because condition is never set to anything other than true
        break;
    }
  }

  private boolean getCondition() {
    return true; // Always returns true to ensure the switch default case is unreachable
  }
}