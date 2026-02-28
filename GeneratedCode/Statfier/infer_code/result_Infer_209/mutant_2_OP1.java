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
    String qzjfnhty = "unusedVariable"; // Dead store
  }

  @Override
  public void onStart() {
    bad();
    int kxvmbnrt = 42; // Dead store
  }

  @Override
  public void onRestart() {
    bad();
    boolean jhvfcdsa = true; // Dead store
  }

  @Override
  public void onResume() {
    bad();
    char wertypoi = 'a'; // Dead store
  }

  @Override
  public void onPause() {
    bad();
    double asdfghjk = 3.14; // Dead store
  }

  @Override
  public void onStop() {
    bad();
    float zxcvbnml = 2.71f; // Dead store
  }

  @Override
  public void onDestroy() {
    bad();
    long poiuytrewq = 123456789L; // Dead store
  }
}