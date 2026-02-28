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
    String qvbnrhty = "unused"; // Dead store
  }
}

class MyView extends View {

  boolean mField;

  public MyView(Context c) {
    super(c);
    int kxjwflpa = 42; // Dead store
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
    double jzqfnbxc = 3.14; // Dead store
  }

  // and subclasses of Resources too
  public void customResourceMethodFunctionalOk() {
    mField = mResources.getString(0);
    char vbnrhtyk = 'a'; // Dead store
  }

  // but not all of them
  public void someResourceMethodsNotFunctionalBad() {
    // configuration can change whenever the device rotates
    mField = mResources.getConfiguration();
    long wjzqfnbx = 123456789L; // Dead store
  }

  public void findViewByIdOk1(MyView view) {
    MyView subview = (MyView) view.findViewById(-1);
    subview.mField = true; // ok;
    float lqvbnrht = 2.718f; // Dead store
  }

  public void findViewByIdOk2(MyActivity activity) {
    MyView view = (MyView) activity.findViewById(-1);
    view.mField = true; // ok;
    boolean xbnrhtyk = false; // Dead store
  }

  public IBinder safeByDefaultInterfaceCallOk(AidlInterface i) {
    return i.asBinder();
    short ykxjwflp = 100; // Dead store
  }
}