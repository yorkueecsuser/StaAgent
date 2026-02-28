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
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  void doOneWayTransact() throws RemoteException {
    b.transact(0, null, null, 1);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  // assert happens after bad call so thread status is still unknown
  void FN_interBad() throws RemoteException {
    b.transact(0, null, null, 0);
    forceMainThread();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  void interBad() throws RemoteException {
    forceMainThread();
    b.transact(0, null, null, 0);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  void intraBad() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doTransact();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  @UiThread
  void annotationBad() throws RemoteException {
    doTransact();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  void intraOk() throws RemoteException {
    b.transact(0, null, null, 0);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  void interOk() throws RemoteException {
    doTransact();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  void oneWayOk() throws RemoteException {
    OurThreadUtils.assertMainThread();
    doOneWayTransact();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  void forceMainThread() {
    OurThreadUtils.assertMainThread();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  @UiThread
  void getActiveNetworkInfoBad(ConnectivityManager c) {
    c.getActiveNetworkInfo();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  @UiThread
  int doGetStreamVolumeBad(AudioManager a) {
    return a.getStreamVolume(0);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  @UiThread
  int doGetRingerModeBad(AudioManager a) {
    return a.getRingerMode();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  @UiThread
  int doCheckPermissionBad(Context c) {
    return c.checkPermission("", 0, 0);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  @UiThread
  int doCheckSelfPermissionBad(Context c) {
    return c.checkSelfPermission("");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  @UiThread
  void doGetConnectionInfoBad(WifiManager w) {
    w.getConnectionInfo();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  @UiThread
  void doGetRealSizeBad(Display d) {
    d.getRealSize(null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable code */ }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}