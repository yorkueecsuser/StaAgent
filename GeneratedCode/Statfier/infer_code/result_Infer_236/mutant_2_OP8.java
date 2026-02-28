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
  }

  Object g;

  @UiThread
  void notLazyInitBad() {
    if (g == null) {
      f = init();
    }
  }

  @UiThread
  void notEqualsLazyOk() {
    if (f!= null) {
    } else {
      f = init();
    }
  }

  @UiThread
  void negatedEqualsLazyOk() {
    if (!(f == null)) {
    } else {
      f = init();
    }
  }

  @UiThread
  void lazyFirstOk() {
    if (f == null) {
      doTransact();
      f = new Object();
    }
  }

  // Mutated code
  Binder x;

  void doTransactMutant() {
    try {
      x.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  Object y;

  @UiThread
  void normalLazyOkMutant() {
    if (y == null) {
      y = init();
    }
  }

  Object z;

  @UiThread
  void notLazyInitBadMutant() {
    if (z == null) {
      y = init();
    }
  }

  Object w;

  @UiThread
  void notEqualsLazyOkMutant() {
    if (w!= null) {
    } else {
      w = init();
    }
  }

  @UiThread
  void negatedEqualsLazyOkMutant() {
    if (!(w == null)) {
    } else {
      w = init();
    }
  }

  @UiThread
  void lazyFirstOkMutant() {
    if (w == null) {
      doTransact();
      w = new Object();
    }
  }
}