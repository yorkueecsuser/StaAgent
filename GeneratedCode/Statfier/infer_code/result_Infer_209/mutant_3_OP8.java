import android.app.Activity;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;

// test is for recognizing Activity lifecycle methods
class starvationMyActivity extends Activity {
  Binder b;
  Binder c; // Added mutant variable

  private void bad() {
    try {
      b.transact(0, null, null, 0);
    } catch (RemoteException r) {
    }
  }

  // overrides so no Bad suffixes

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    bad();
    c = new Binder(); // Mutant code
  }

  @Override
  public void onStart() {
    bad();
    c.dump(null, null, null, null); // Mutant code
  }

  @Override
  public void onRestart() {
    bad();
    c.clearCallingIdentity(); // Mutant code
  }

  @Override
  public void onResume() {
    bad();
    c.flushPendingCommands(); // Mutant code
  }

  @Override
  public void onPause() {
    bad();
    c.isBinderAlive(); // Mutant code
  }

  @Override
  public void onStop() {
    bad();
    c.unlinkToDeath(null, 0); // Mutant code
  }

  @Override
  public void onDestroy() {
    bad();
    c.queryLocalInterface(""); // Mutant code
  }
}