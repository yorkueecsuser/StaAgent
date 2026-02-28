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
    // Unreachable switch statement mutation
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case.");
        break;
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

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}