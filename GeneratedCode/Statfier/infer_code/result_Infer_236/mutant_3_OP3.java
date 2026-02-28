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
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This block is unreachable because getCondition() will never return true
    }
    return init();
  }

  Object f;

  @UiThread
  void normalLazyOk() {
    if (f == null) {
      f = init();
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This block is unreachable because getCondition() will never return true
    }
  }

  Object g;

  @UiThread
  void notLazyInitBad() {
    if (g == null) {
      f = init();
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This block is unreachable because getCondition() will never return true
    }
  }

  @UiThread
  void notEqualsLazyOk() {
    if (f!= null) {
    } else {
      f = init();
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This block is unreachable because getCondition() will never return true
    }
  }

  @UiThread
  void negatedEqualsLazyOk() {
    if (!(f == null)) {
    } else {
      f = init();
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This block is unreachable because getCondition() will never return true
    }
  }

  @UiThread
  void lazyFirstOk() {
    if (f == null) {
      doTransact();
      f = new Object();
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This block is unreachable because getCondition() will never return true
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if block unreachable
  }
}