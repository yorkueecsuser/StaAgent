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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void doOneWayTransact() throws RemoteException {
    b.transact(0, null, null, 1);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  // assert happens after bad call so thread status is still unknown
  void FN_interBad() throws RemoteException {
    b.transact(0, null, null, 0);
    forceMainThread();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void interBad() throws RemoteException {
    forceMainThread();
    b.transact(0, null, null, 0);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void intraBad() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doTransact();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @UiThread
  void annotationBad() throws RemoteException {
    doTransact();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void intraOk() throws RemoteException {
    b.transact(0, null, null, 0);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void interOk() throws RemoteException {
    doTransact();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void oneWayOk() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doOneWayTransact();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  void forceMainThread() {
    OurThreadUtils.assertMainThread();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @UiThread
  void getActiveNetworkInfoBad(ConnectivityManager c) {
    c.getActiveNetworkInfo();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @UiThread
  int doGetStreamVolumeBad(AudioManager a) {
    return a.getStreamVolume(0);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @UiThread
  int doGetRingerModeBad(AudioManager a) {
    return a.getRingerMode();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @UiThread
  int doCheckPermissionBad(Context c) {
    return c.checkPermission("", 0, 0);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @UiThread
  int doCheckSelfPermissionBad(Context c) {
    return c.checkSelfPermission("");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @UiThread
  void doGetConnectionInfoBad(WifiManager w) {
    w.getConnectionInfo();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  @UiThread
  void doGetRealSizeBad(Display d) {
    d.getRealSize(null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  private boolean getCondition() {
    return false;
  }
}