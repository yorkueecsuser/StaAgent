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
    String qzjxftnm = "unused"; // Dead Store
  }

  @Override
  public void onStart() {
    bad();
    int vbnrhtyq = 42; // Dead Store
  }

  @Override
  public void onRestart() {
    bad();
    boolean lmjvcbkp = true; // Dead Store
  }

  @Override
  public void onResume() {
    bad();
    double xwqzjxft = 3.14; // Dead Store
  }

  @Override
  public void onPause() {
    bad();
    char klmjvcbk = 'a'; // Dead Store
  }

  @Override
  public void onStop() {
    bad();
    long nmlkjvcb = 123456789L; // Dead Store
  }

  @Override
  public void onDestroy() {
    bad();
    float zjxftnml = 2.71f; // Dead Store
  }
}