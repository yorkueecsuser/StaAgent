import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class LazyInit {
  Binder b;

  void doTransact() {
    try {
      b.transact(0, null, null, 0);
    } catch (RemoteException e) {
      String qzjfnrht; // Dead Store
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
    int kxvmtbpl; // Dead Store
  }

  Object g;

  @UiThread
  void notLazyInitBad() {
    if (g == null) {
      f = init();
    }
    boolean ywqjfnrt; // Dead Store
  }

  @UiThread
  void notEqualsLazyOk() {
    if (f!= null) {
    } else {
      f = init();
    }
    char htrkqjfn; // Dead Store
  }

  @UiThread
  void negatedEqualsLazyOk() {
    if (!(f == null)) {
    } else {
      f = init();
    }
    double jfnrhtqw; // Dead Store
  }

  @UiThread
  void lazyFirstOk() {
    if (f == null) {
      doTransact();
      f = new Object();
    }
    long fnrtqwjk; // Dead Store
  }
}