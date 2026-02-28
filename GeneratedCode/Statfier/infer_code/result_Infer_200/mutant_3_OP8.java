import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

class MyServiceConnection implements ServiceConnection {
  Binder b;

  private void bad() {
    try {
      b.transact(0, null, null, 0);
    } catch (RemoteException r) {
    }
  }

  // implemented/overrides so no Bad suffixes

  // following two methods are FNs due to a separate issue with default interface methods
  void onBindingDied(ComponentName name) {
    bad();
  }

  void onNullBinding(ComponentName name) {
    bad();
  }

  @Override
  public void onServiceConnected(ComponentName name, IBinder service) {
    bad();
  }

  @Override
  public void onServiceDisconnected(ComponentName name) {
    bad();
  }

  // Mutated code
  Binder x;

  private void badx() {
    try {
      x.transact(0, null, null, 0);
    } catch (RemoteException r) {
    }
  }

  void onBindingDiedx(ComponentName y) {
    badx();
  }

  void onNullBindingx(ComponentName y) {
    badx();
  }

  @Override
  public void onServiceConnectedx(ComponentName y, IBinder z) {
    badx();
  }

  @Override
  public void onServiceDisconnectedx(ComponentName y) {
    badx();
  }
}