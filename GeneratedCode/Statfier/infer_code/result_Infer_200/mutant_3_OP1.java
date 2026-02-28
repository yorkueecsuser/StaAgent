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
    // Dead Store Mutation
    String yjvqkxzo = "unusedVariable";
  }

  // implemented/overrides so no Bad suffixes

  // following two methods are FNs due to a separate issue with default interface methods
  void onBindingDied(ComponentName name) {
    bad();
    // Dead Store Mutation
    int fghjklmn = 42;
  }

  void onNullBinding(ComponentName name) {
    bad();
    // Dead Store Mutation
    double abcdefgh = 3.14;
  }

  @Override
  public void onServiceConnected(ComponentName name, IBinder service) {
    bad();
    // Dead Store Mutation
    boolean pqrsutvw = true;
  }

  @Override
  public void onServiceDisconnected(ComponentName name) {
    bad();
    // Dead Store Mutation
    char xyzuvwxy = 'a';
  }
}