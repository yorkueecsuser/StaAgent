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
      if (shouldRun &&!shouldRun) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
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
      if (shouldRun &&!shouldRun) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
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
      if (shouldRun &&!shouldRun) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
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
      if (shouldRun &&!shouldRun) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
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
      if (shouldRun &&!shouldRun) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
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
      if (shouldRun &&!shouldRun) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  private boolean getCondition() {
    return true; // This method ensures the condition is dynamically determined at runtime
  }
}