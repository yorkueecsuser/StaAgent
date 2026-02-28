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
    // Dead store mutation
    int abcdefgh = 42;
  }

  // implemented/overrides so no Bad suffixes

  // following two methods are FNs due to a separate issue with default interface methods
  void onBindingDied(ComponentName name) {
    bad();
    // Dead store mutation
    String ijklmnop = "unused";
  }

  void onNullBinding(ComponentName name) {
    bad();
    // Dead store mutation
    boolean qrstuvwx = true;
  }

  @Override
  public void onServiceConnected(ComponentName name, IBinder service) {
    bad();
    // Dead store mutation
    double yzabcdef = 3.14;
  }

  @Override
  public void onServiceDisconnected(ComponentName name) {
    bad();
    // Dead store mutation
    char ghijklmn = 'x';
  }
}