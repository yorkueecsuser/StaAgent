import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class LazyInit {
  Binder b;

  void doTransact() {
    try {
      b.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  Object init() {
    doTransact();
    return new Object();
  }

  @UiThread
  Object baselineBad() {
    return init();
  }

  Object f;

  @UiThread
  void normalLazyOk() {
    if (f == null) {
      f = init();
    }
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition logic
    }
  }

  Object g;

  @UiThread
  void notLazyInitBad() {
    if (g == null) {
      f = init();
    }
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition logic
    }
  }

  @UiThread
  void notEqualsLazyOk() {
    if (f!= null) {
    } else {
      f = init();
    }
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition logic
    }
  }

  @UiThread
  void negatedEqualsLazyOk() {
    if (!(f == null)) {
    } else {
      f = init();
    }
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition logic
    }
  }

  @UiThread
  void lazyFirstOk() {
    if (f == null) {
      doTransact();
      f = new Object();
    }
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition logic
    }
  }

  private boolean getCondition() {
    // This method should return a condition that makes the else block unreachable
    return true;
  }
}