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
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
    }
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
    c.getActiveNetworkInfo();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
    }
  }

  @UiThread
  int doGetStreamVolumeBad(AudioManager a) {
    return a.getStreamVolume(0);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
    }
  }

  @UiThread
  int doGetRingerModeBad(AudioManager a) {
    return a.getRingerMode();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
    }
  }

  @UiThread
  int doCheckPermissionBad(Context c) {
    return c.checkPermission("", 0, 0);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
    }
  }

  @UiThread
  int doCheckSelfPermissionBad(Context c) {
    return c.checkSelfPermission("");
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
    }
  }

  @UiThread
  void doGetConnectionInfoBad(WifiManager w) {
    w.getConnectionInfo();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
    }
  }

  @UiThread
  void doGetRealSizeBad(Display d) {
    d.getRealSize(null);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}