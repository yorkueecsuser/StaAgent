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

  // Mutant code
  private final IBinder x = null;

  @Override
  public IBinder z(Intent y) {
    a();
    return x;
  }

  void a() {
    try {
      x.transact(0, null, null, 0);
    } catch (RemoteException w) {
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

  // Mutant code
  private final IBinder q = null;

  @Override
  public void b(Intent r) {
    c();
  }

  void c() {
    try {
      q.transact(0, null, null, 0);
    } catch (RemoteException s) {
    }
  }
}