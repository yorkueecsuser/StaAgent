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
    b.transact(0, null, null, 0);
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  void doOneWayTransact() throws RemoteException {
    b.transact(0, null, null, 1);
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  // assert happens after bad call so thread status is still unknown
  void FN_interBad() throws RemoteException {
    b.transact(0, null, null, 0);
    forceMainThread();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  void interBad() throws RemoteException {
    forceMainThread();
    b.transact(0, null, null, 0);
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  void intraBad() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doTransact();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @UiThread
  void annotationBad() throws RemoteException {
    doTransact();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  void intraOk() throws RemoteException {
    b.transact(0, null, null, 0);
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  void interOk() throws RemoteException {
    doTransact();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  void oneWayOk() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doOneWayTransact();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  void forceMainThread() {
    OurThreadUtils.assertMainThread();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @UiThread
  void getActiveNetworkInfoBad(ConnectivityManager c) {
    c.getActiveNetworkInfo();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @UiThread
  int doGetStreamVolumeBad(AudioManager a) {
    return a.getStreamVolume(0);
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @UiThread
  int doGetRingerModeBad(AudioManager a) {
    return a.getRingerMode();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @UiThread
  int doCheckPermissionBad(Context c) {
    return c.checkPermission("", 0, 0);
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @UiThread
  int doCheckSelfPermissionBad(Context c) {
    return c.checkSelfPermission("");
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @UiThread
  void doGetConnectionInfoBad(WifiManager w) {
    w.getConnectionInfo();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @UiThread
  void doGetRealSizeBad(Display d) {
    d.getRealSize(null);
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}