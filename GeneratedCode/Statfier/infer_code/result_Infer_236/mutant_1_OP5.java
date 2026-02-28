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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case");
        break;
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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  Object g;

  @UiThread
  void notLazyInitBad() {
    if (g == null) {
      f = init();
    }
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @UiThread
  void notEqualsLazyOk() {
    if (f!= null) {
    } else {
      f = init();
    }
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @UiThread
  void negatedEqualsLazyOk() {
    if (!(f == null)) {
    } else {
      f = init();
    }
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @UiThread
  void lazyFirstOk() {
    if (f == null) {
      doTransact();
      f = new Object();
    }
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  // Helper method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}