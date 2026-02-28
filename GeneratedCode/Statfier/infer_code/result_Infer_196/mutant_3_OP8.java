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
  }

  @UiThread
  int doGetStreamVolumeBad(AudioManager a) {
    return a.getStreamVolume(0);
  }

  @UiThread
  int doGetRingerModeBad(AudioManager a) {
    return a.getRingerMode();
  }

  @UiThread
  int doCheckPermissionBad(Context c) {
    return c.checkPermission("", 0, 0);
  }

  @UiThread
  int doCheckSelfPermissionBad(Context c) {
    return c.checkSelfPermission("");
  }

  @UiThread
  void doGetConnectionInfoBad(WifiManager w) {
    w.getConnectionInfo();
  }

  @UiThread
  void doGetRealSizeBad(Display d) {
    d.getRealSize(null);
  }

  // Mutated code
  Binder x;

  void doTransactX() throws RemoteException {
    x.transact(0, null, null, 0);
  }

  void doOneWayTransactX() throws RemoteException {
    x.transact(0, null, null, 1);
  }

  // assert happens after bad call so thread status is still unknown
  void FN_interBadX() throws RemoteException {
    x.transact(0, null, null, 0);
    forceMainThread();
  }

  void interBadX() throws RemoteException {
    forceMainThread();
    x.transact(0, null, null, 0);
  }

  void intraBadX() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doTransactX();
  }

  @UiThread
  void annotationBadX() throws RemoteException {
    doTransactX();
  }

  void intraOkX() throws RemoteException {
    x.transact(0, null, null, 0);
  }

  void interOkX() throws RemoteException {
    doTransactX();
  }

  void oneWayOkX() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doOneWayTransactX();
  }

  void forceMainThreadX() {
    OurThreadUtils.assertMainThread();
  }

  @UiThread
  void getActiveNetworkInfoBadX(ConnectivityManager c) {
    c.getActiveNetworkInfo();
  }

  @UiThread
  int doGetStreamVolumeBadX(AudioManager a) {
    return a.getStreamVolume(0);
  }

  @UiThread
  int doGetRingerModeBadX(AudioManager a) {
    return a.getRingerMode();
  }

  @UiThread
  int doCheckPermissionBadX(Context c) {
    return c.checkPermission("", 0, 0);
  }

  @UiThread
  int doCheckSelfPermissionBadX(Context c) {
    return c.checkSelfPermission("");
  }

  @UiThread
  void doGetConnectionInfoBadX(WifiManager w) {
    w.getConnectionInfo();
  }

  @UiThread
  void doGetRealSizeBadX(Display d) {
    d.getRealSize(null);
  }
}