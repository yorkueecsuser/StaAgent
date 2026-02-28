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
    // Dead store mutation
    String qvbnrhty = "unusedVariable";
  }

  // overrides so no Bad suffixes

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    bad();
    // Dead store mutation
    int xjfnkzqp = 42;
  }

  @Override
  public void onStart() {
    bad();
    // Dead store mutation
    boolean wertvuyt = true;
  }

  @Override
  public void onRestart() {
    bad();
    // Dead store mutation
    double lmnoqrst = 3.14;
  }

  @Override
  public void onResume() {
    bad();
    // Dead store mutation
    char pqwertyu = 'a';
  }

  @Override
  public void onPause() {
    bad();
    // Dead store mutation
    long hjklmnop = 123456789L;
  }

  @Override
  public void onStop() {
    bad();
    // Dead store mutation
    float asdfghjk = 2.718f;
  }

  @Override
  public void onDestroy() {
    bad();
    // Dead store mutation
    short zxcvbnml = 10;
  }
}