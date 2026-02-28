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
    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
    }
  }

  // overrides so no Bad suffixes

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    bad();
    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
    }
  }

  @Override
  public void onStart() {
    bad();
    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
    }
  }

  @Override
  public void onRestart() {
    bad();
    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
    }
  }

  @Override
  public void onResume() {
    bad();
    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
    }
  }

  @Override
  public void onPause() {
    bad();
    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
    }
  }

  @Override
  public void onStop() {
    bad();
    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
    }
  }

  @Override
  public void onDestroy() {
    bad();
    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}