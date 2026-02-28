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

  // Mutated code starts here

  Object x;

  @UiThread
  void normalLazyOkMutant() {
    if (x == null) {
      x = init();
    }
  }

  Object y;

  @UiThread
  void notLazyInitBadMutant() {
    if (y == null) {
      x = init();
    }
  }

  Object z;

  @UiThread
  void notEqualsLazyOkMutant() {
    if (z!= null) {
    } else {
      z = init();
    }
  }

  Object w;

  @UiThread
  void negatedEqualsLazyOkMutant() {
    if (!(w == null)) {
    } else {
      w = init();
    }
  }

  Object v;

  @UiThread
  void lazyFirstOkMutant() {
    if (v == null) {
      doTransact();
      v = new Object();
    }
  }
}