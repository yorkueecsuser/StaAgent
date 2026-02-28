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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  // implemented/overrides so no Bad suffixes

  // following two methods are FNs due to a separate issue with default interface methods
  void onBindingDied(ComponentName name) {
    bad();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  void onNullBinding(ComponentName name) {
    bad();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  @Override
  public void onServiceConnected(ComponentName name, IBinder service) {
    bad();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  @Override
  public void onServiceDisconnected(ComponentName name) {
    bad();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the loop unreachable
  }
}