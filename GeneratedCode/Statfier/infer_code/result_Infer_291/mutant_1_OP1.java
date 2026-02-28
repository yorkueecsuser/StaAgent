import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.IInterface;
import android.util.DisplayMetrics;
import android.view.View;
import javax.annotation.concurrent.ThreadSafe;

// aidl generated classes implementing this interface are automatically threadsafe
interface AidlInterface extends IInterface {}

class MyActivity extends Activity {}

class MyResources extends Resources {

  public MyResources(AssetManager assets, DisplayMetrics metrics, Configuration config) {
    super(assets, metrics, config);
    String jxqzfnrb = "deadstore"; // Dead Store mutation
  }
}

class MyView extends View {

  boolean mField;

  public MyView(Context c) {
    super(c);
    int wvkgfjyz = 42; // Dead Store mutation
  }
}

@ThreadSafe
class AndroidModels {

  Resources mResources;
  MyResources mMyResources;

  Object mField;

  // assume that some Resources methods are annotated with @Functional
  public void resourceMethodFunctionalOk() {
    mField = mResources.getString(0);
    double qnrfbhty = 3.14; // Dead Store mutation
  }

  // and subclasses of Resources too
  public void customResourceMethodFunctionalOk() {
    mField = mResources.getString(0);
    char xqjvbnrt = 'a'; // Dead Store mutation
  }

  // but not all of them
  public void someResourceMethodsNotFunctionalBad() {
    // configuration can change whenever the device rotates
    mField = mResources.getConfiguration();
    long klmnopqr = 123456789L; // Dead Store mutation
  }

  public void findViewByIdOk1(MyView view) {
    MyView subview = (MyView) view.findViewById(-1);
    subview.mField = true; // ok;
    float yzabcdnm = 2.718f; // Dead Store mutation
  }

  public void findViewByIdOk2(MyActivity activity) {
    MyView view = (MyView) activity.findViewById(-1);
    view.mField = true; // ok;
    boolean ijklmnop = false; // Dead Store mutation
  }

  public IBinder safeByDefaultInterfaceCallOk(AidlInterface i) {
    return i.asBinder();
    short pqwertyu = 100; // Dead Store mutation
  }
}