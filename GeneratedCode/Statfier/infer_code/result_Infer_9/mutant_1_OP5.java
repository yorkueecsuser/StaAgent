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
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @UiThread
  void getIndirectBad() {
    synchronized (lock) {
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  void getUnderLock() throws InterruptedException, ExecutionException {
    synchronized (lock) {
      future.get();
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  void getOnOtherThreadOk() throws InterruptedException, ExecutionException {
    future.get();
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @UiThread
  void getTimeoutOneDayBad() throws InterruptedException, ExecutionException {
    try {
      future.get(1L, TimeUnit.DAYS);
    } catch (TimeoutException e) {
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @UiThread
  void getTimeoutOneSecondOk() throws InterruptedException, ExecutionException {
    try {
      future.get(1L, TimeUnit.SECONDS);
    } catch (TimeoutException e) {
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @UiThread
  void getTimeoutOneHourBad() throws InterruptedException, ExecutionException {
    try {
      future.get(1L, TimeUnit.HOURS);
    } catch (TimeoutException e) {
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @UiThread
  void getTimeoutFourSecondsOk() throws InterruptedException, ExecutionException {
    try {
      future.get(4L, TimeUnit.SECONDS);
    } catch (TimeoutException e) {
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @UiThread
  void getTimeout4999MilliSecondsOk() throws InterruptedException, ExecutionException {
    try {
      future.get(4999L, TimeUnit.MILLISECONDS);
    } catch (TimeoutException e) {
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @UiThread
  void getTimeout50000001MicroSecondsBad() throws InterruptedException, ExecutionException {
    try {
      future.get(5000001L, TimeUnit.MICROSECONDS);
    } catch (TimeoutException e) {
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @UiThread
  void getTimeout64BitsBad() throws InterruptedException, ExecutionException {
    try {
      future.get(9223372036854775807L, TimeUnit.MICROSECONDS);
    } catch (TimeoutException e) {
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
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
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return null;
  }

  @UiThread
  Object getFuturesDoneOk(Future<Object> future) throws InterruptedException, ExecutionException {
    Preconditions.checkState(future.isDone());
    return future.get();
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return null;
  }

  Object assertNotOnUIThreadOk(Future<Object> future)
      throws InterruptedException, ExecutionException {
    Preconditions.checkArgument(!OurThreadUtils.isMainThread());
    return future.get();
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return null;
  }

  private boolean getCondition() {
    return false;
  }
}