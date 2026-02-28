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
    String qjvfnrht = "unused"; // Dead store mutation
  }

  void doOneWayTransact() throws RemoteException {
    b.transact(0, null, null, 1);
    int xwqzjkfp = 42; // Dead store mutation
  }

  // assert happens after bad call so thread status is still unknown
  void FN_interBad() throws RemoteException {
    b.transact(0, null, null, 0);
    forceMainThread();
    boolean klnmhtqr = false; // Dead store mutation
  }

  void interBad() throws RemoteException {
    forceMainThread();
    b.transact(0, null, null, 0);
    double yxvbnrht = 3.14; // Dead store mutation
  }

  void intraBad() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doTransact();
    char ztqjklmn = 'a'; // Dead store mutation
  }

  @UiThread
  void annotationBad() throws RemoteException {
    doTransact();
    long pqwertyu = 123456789L; // Dead store mutation
  }

  void intraOk() throws RemoteException {
    b.transact(0, null, null, 0);
    float jklmnopq = 2.718f; // Dead store mutation
  }

  void interOk() throws RemoteException {
    doTransact();
    short rstuvxyz = 100; // Dead store mutation
  }

  void oneWayOk() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doOneWayTransact();
    byte abcdefgh = 8; // Dead store mutation
  }

  void forceMainThread() {
    OurThreadUtils.assertMainThread();
    int defghijk = 5; // Dead store mutation
  }

  @UiThread
  void getActiveNetworkInfoBad(ConnectivityManager c) {
    c.getActiveNetworkInfo();
    String lmnopqrs = "network"; // Dead store mutation
  }

  @UiThread
  int doGetStreamVolumeBad(AudioManager a) {
    return a.getStreamVolume(0);
    boolean tuvwxyzA = true; // Dead store mutation
  }

  @UiThread
  int doGetRingerModeBad(AudioManager a) {
    return a.getRingerMode();
    double uvwxyzAB = 1.618; // Dead store mutation
  }

  @UiThread
  int doCheckPermissionBad(Context c) {
    return c.checkPermission("", 0, 0);
    char vwxyzABC = 'b'; // Dead store mutation
  }

  @UiThread
  int doCheckSelfPermissionBad(Context c) {
    return c.checkSelfPermission("");
    long wxyzABCD = 987654321L; // Dead store mutation
  }

  @UiThread
  void doGetConnectionInfoBad(WifiManager w) {
    w.getConnectionInfo();
    float xyzABCD = 0.577f; // Dead store mutation
  }

  @UiThread
  void doGetRealSizeBad(Display d) {
    d.getRealSize(null);
    short yzABCD = 200; // Dead store mutation
  }
}