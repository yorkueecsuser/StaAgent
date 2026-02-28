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
  }

  // overrides so no Bad suffixes

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    bad();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() does not return true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @Override
  public void onStart() {
    bad();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() does not return true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @Override
  public void onRestart() {
    bad();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() does not return true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @Override
  public void onResume() {
    bad();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() does not return true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @Override
  public void onPause() {
    bad();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() does not return true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @Override
  public void onStop() {
    bad();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() does not return true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @Override
  public void onDestroy() {
    bad();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() does not return true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}