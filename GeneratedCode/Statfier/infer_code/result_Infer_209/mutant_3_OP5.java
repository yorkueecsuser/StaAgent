import android.app.Activity;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;

// test is for recognizing Activity lifecycle methods
class starvationMyActivity extends Activity {
  Binder b;

  private void bad() {
    try {
      b.transact(0, null, null, 0);
    } catch (RemoteException r) {
    }

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be reached because condition is always false
        System.out.println("This is unreachable");
        break;
      default:
        // Default case to ensure switch is syntactically correct
        break;
    }
  }

  // overrides so no Bad suffixes

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    bad();
  }

  @Override
  public void onStart() {
    bad();
  }

  @Override
  public void onRestart() {
    bad();
  }

  @Override
  public void onResume() {
    bad();
  }

  @Override
  public void onPause() {
    bad();
  }

  @Override
  public void onStop() {
    bad();
  }

  @Override
  public void onDestroy() {
    bad();
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}