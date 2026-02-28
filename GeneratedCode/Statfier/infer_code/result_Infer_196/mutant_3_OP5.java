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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  void interBad() throws RemoteException {
    forceMainThread();
    b.transact(0, null, null, 0);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  void intraBad() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doTransact();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @UiThread
  void annotationBad() throws RemoteException {
    doTransact();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  void intraOk() throws RemoteException {
    b.transact(0, null, null, 0);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  void interOk() throws RemoteException {
    doTransact();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  void oneWayOk() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doOneWayTransact();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  void forceMainThread() {
    OurThreadUtils.assertMainThread();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @UiThread
  void getActiveNetworkInfoBad(ConnectivityManager c) {
    c.getActiveNetworkInfo();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @UiThread
  int doGetStreamVolumeBad(AudioManager a) {
    return a.getStreamVolume(0);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @UiThread
  int doGetRingerModeBad(AudioManager a) {
    return a.getRingerMode();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @UiThread
  int doCheckPermissionBad(Context c) {
    return c.checkPermission("", 0, 0);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @UiThread
  int doCheckSelfPermissionBad(Context c) {
    return c.checkSelfPermission("");
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @UiThread
  void doGetConnectionInfoBad(WifiManager w) {
    w.getConnectionInfo();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @UiThread
  void doGetRealSizeBad(Display d) {
    d.getRealSize(null);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        System.out.println("This is an unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch case remains unreachable
  }
}