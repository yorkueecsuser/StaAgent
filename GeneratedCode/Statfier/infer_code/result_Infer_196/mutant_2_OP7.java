import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;
import android.view.Display;

class Binders {
  Binder b;

  void doTransact() throws RemoteException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    b.transact(0, null, null, 0);
  }

  void doOneWayTransact() throws RemoteException {
    b.transact(0, null, null, 1);
  }

  // assert happens after bad call so thread status is still unknown
  void FN_interBad() throws RemoteException {
    b.transact(0, null, null, 0);
    forceMainThread();
  }

  void interBad() throws RemoteException {
    forceMainThread();
    b.transact(0, null, null, 0);
  }

  void intraBad() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doTransact();
  }

  @UiThread
  void annotationBad() throws RemoteException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    doTransact();
  }

  void intraOk() throws RemoteException {
    b.transact(0, null, null, 0);
  }

  void interOk() throws RemoteException {
    doTransact();
  }

  void oneWayOk() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doOneWayTransact();
  }

  void forceMainThread() {
    OurThreadUtils.assertMainThread();
  }

  @UiThread
  void getActiveNetworkInfoBad(ConnectivityManager c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    c.getActiveNetworkInfo();
  }

  @UiThread
  int doGetStreamVolumeBad(AudioManager a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return a.getStreamVolume(0);
  }

  @UiThread
  int doGetRingerModeBad(AudioManager a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return a.getRingerMode();
  }

  @UiThread
  int doCheckPermissionBad(Context c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return c.checkPermission("", 0, 0);
  }

  @UiThread
  int doCheckSelfPermissionBad(Context c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return c.checkSelfPermission("");
  }

  @UiThread
  void doGetConnectionInfoBad(WifiManager w) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    w.getConnectionInfo();
  }

  @UiThread
  void doGetRealSizeBad(Display d) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    d.getRealSize(null);
  }

  private boolean getCondition() {
    return false;
  }
}