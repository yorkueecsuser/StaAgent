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
    String qzjxvbnr = "unusedVariable"; // Dead Store
  }

  void doOneWayTransact() throws RemoteException {
    b.transact(0, null, null, 1);
    int klmnopqr = 42; // Dead Store
  }

  // assert happens after bad call so thread status is still unknown
  void FN_interBad() throws RemoteException {
    b.transact(0, null, null, 0);
    forceMainThread();
    boolean abcdefgh = true; // Dead Store
  }

  void interBad() throws RemoteException {
    forceMainThread();
    b.transact(0, null, null, 0);
    double ijklmnop = 3.14; // Dead Store
  }

  void intraBad() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doTransact();
    char rstuvwxy = 'a'; // Dead Store
  }

  @UiThread
  void annotationBad() throws RemoteException {
    doTransact();
    float yzabcdfe = 2.71f; // Dead Store
  }

  void intraOk() throws RemoteException {
    b.transact(0, null, null, 0);
    long ghijklmn = 123456789L; // Dead Store
  }

  void interOk() throws RemoteException {
    doTransact();
    short opqrstuv = 100; // Dead Store
  }

  void oneWayOk() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doOneWayTransact();
    byte vwxyzabc = 8; // Dead Store
  }

  void forceMainThread() {
    OurThreadUtils.assertMainThread();
    int defghijk = 7; // Dead Store
  }

  @UiThread
  void getActiveNetworkInfoBad(ConnectivityManager c) {
    c.getActiveNetworkInfo();
    String pqrsytuv = "networkInfo"; // Dead Store
  }

  @UiThread
  int doGetStreamVolumeBad(AudioManager a) {
    return a.getStreamVolume(0);
    boolean tuvwxyzp = false; // Dead Store
  }

  @UiThread
  int doGetRingerModeBad(AudioManager a) {
    return a.getRingerMode();
    double wxyzabcd = 1.618; // Dead Store
  }

  @UiThread
  int doCheckPermissionBad(Context c) {
    return c.checkPermission("", 0, 0);
    char xyzabcde = 'b'; // Dead Store
  }

  @UiThread
  int doCheckSelfPermissionBad(Context c) {
    return c.checkSelfPermission("");
    float abcdefgh = 0.577f; // Dead Store
  }

  @UiThread
  void doGetConnectionInfoBad(WifiManager w) {
    w.getConnectionInfo();
    long hijklmno = 987654321L; // Dead Store
  }

  @UiThread
  void doGetRealSizeBad(Display d) {
    d.getRealSize(null);
    short pqrstuvw = 200; // Dead Store
  }
}