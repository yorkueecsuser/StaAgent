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
    boolean shouldRun = getCondition();
    if (shouldRun) {
        // Unreachable if-else statement
    } else {
        // This branch is unreachable because shouldRun is set to false in getCondition()
    }
    return init();
  }

  Object f;

  @UiThread
  void normalLazyOk() {
    if (f == null) {
      f = init();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
        // Unreachable if-else statement
    } else {
        // This branch is unreachable because shouldRun is set to false in getCondition()
    }
  }

  Object g;

  @UiThread
  void notLazyInitBad() {
    if (g == null) {
      f = init();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
        // Unreachable if-else statement
    } else {
        // This branch is unreachable because shouldRun is set to false in getCondition()
    }
  }

  @UiThread
  void notEqualsLazyOk() {
    if (f!= null) {
    } else {
      f = init();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
        // Unreachable if-else statement
    } else {
        // This branch is unreachable because shouldRun is set to false in getCondition()
    }
  }

  @UiThread
  void negatedEqualsLazyOk() {
    if (!(f == null)) {
    } else {
      f = init();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
        // Unreachable if-else statement
    } else {
        // This branch is unreachable because shouldRun is set to false in getCondition()
    }
  }

  @UiThread
  void lazyFirstOk() {
    if (f == null) {
      doTransact();
      f = new Object();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
        // Unreachable if-else statement
    } else {
        // This branch is unreachable because shouldRun is set to false in getCondition()
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the else branch unreachable
  }
}