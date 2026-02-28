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
      System.out.println("This is unreachable");
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
      System.out.println("This is unreachable");
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
      System.out.println("This is unreachable");
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
      System.out.println("This is unreachable");
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
      System.out.println("This is unreachable");
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
      System.out.println("This is unreachable");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if statements unreachable
  }
}