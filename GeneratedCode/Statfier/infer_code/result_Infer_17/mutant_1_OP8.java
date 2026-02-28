import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

class ServiceOnUIThread extends Service {
  private final IBinder mBinder = null;

  @Override
  public IBinder onBind(Intent intent) {
    transactBad();
    return mBinder;
  }

  void transactBad() {
    try {
      mBinder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  // Mutated code
  private final IBinder x = null;

  @Override
  public IBinder z(Intent y) {
    w();
    return x;
  }

  void w() {
    try {
      x.transact(0, null, null, 0);
    } catch (RemoteException v) {
    }
  }
}

class IntentServiceNotOnUIThread extends IntentService {
  private final IBinder mBinder = null;

  public IntentServiceNotOnUIThread() {
    super("Intent service");
  }

  @Override
  public void onHandleIntent(Intent intent) {
    transactOk();
  }

  void transactOk() {
    try {
      mBinder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  // Mutated code
  private final IBinder q = null;

  @Override
  public void r(Intent s) {
    t();
  }

  void t() {
    try {
      q.transact(0, null, null, 0);
    } catch (RemoteException p) {
    }
  }
}