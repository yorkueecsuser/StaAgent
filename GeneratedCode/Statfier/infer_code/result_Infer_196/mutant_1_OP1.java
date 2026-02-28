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
    String qwejklmn = "unused"; // Dead Store
  }

  void doOneWayTransact() throws RemoteException {
    b.transact(0, null, null, 1);
    int abcd1234 = 42; // Dead Store
  }

  // assert happens after bad call so thread status is still unknown
  void FN_interBad() throws RemoteException {
    b.transact(0, null, null, 0);
    forceMainThread();
    boolean xyzvbnmr = true; // Dead Store
  }

  void interBad() throws RemoteException {
    forceMainThread();
    b.transact(0, null, null, 0);
    double rtyujhgf = 3.14; // Dead Store
  }

  void intraBad() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doTransact();
    char cvbnhjkl = 'a'; // Dead Store
  }

  @UiThread
  void annotationBad() throws RemoteException {
    doTransact();
    long wertyuiop = 987654321L; // Dead Store
  }

  void intraOk() throws RemoteException {
    b.transact(0, null, null, 0);
    float qwertyui = 2.718f; // Dead Store
  }

  void interOk() throws RemoteException {
    doTransact();
    short asdfghjk = 123; // Dead Store
  }

  void oneWayOk() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doOneWayTransact();
    byte zxcvbnm = 10; // Dead Store
  }

  void forceMainThread() {
    OurThreadUtils.assertMainThread();
    int poiuytrewq = 5678; // Dead Store
  }

  @UiThread
  void getActiveNetworkInfoBad(ConnectivityManager c) {
    c.getActiveNetworkInfo();
    String lkjhgfds = "network"; // Dead Store
  }

  @UiThread
  int doGetStreamVolumeBad(AudioManager a) {
    return a.getStreamVolume(0);
    boolean cvbnm = false; // Dead Store
  }

  @UiThread
  int doGetRingerModeBad(AudioManager a) {
    return a.getRingerMode();
    double poiuyt = 1.618; // Dead Store
  }

  @UiThread
  int doCheckPermissionBad(Context c) {
    return c.checkPermission("", 0, 0);
    char mnbvcxz = 'b'; // Dead Store
  }

  @UiThread
  int doCheckSelfPermissionBad(Context c) {
    return c.checkSelfPermission("");
    long lkjhgfdsa = 123456789L; // Dead Store
  }

  @UiThread
  void doGetConnectionInfoBad(WifiManager w) {
    w.getConnectionInfo();
    float asdfghjkl = 0.577f; // Dead Store
  }

  @UiThread
  void doGetRealSizeBad(Display d) {
    d.getRealSize(null);
    short zxcvbnm = 456; // Dead Store
  }
}