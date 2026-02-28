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
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  // implemented/overrides so no Bad suffixes

  // following two methods are FNs due to a separate issue with default interface methods
  void onBindingDied(ComponentName name) {
    bad();
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  void onNullBinding(ComponentName name) {
    bad();
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  @Override
  public void onServiceConnected(ComponentName name, IBinder service) {
    bad();
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  @Override
  public void onServiceDisconnected(ComponentName name) {
    bad();
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}