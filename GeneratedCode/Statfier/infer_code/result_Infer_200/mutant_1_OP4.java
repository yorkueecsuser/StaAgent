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
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will execute if shouldRun is true
      System.out.println("This is reachable");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is unreachable");
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

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}