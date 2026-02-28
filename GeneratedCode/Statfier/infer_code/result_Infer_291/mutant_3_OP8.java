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
  }
}

class MyView extends View {

  boolean mField;

  public MyView(Context c) {
    super(c);
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
    Object z = mField; // Mutant: Renamed mField to z
  }

  // and subclasses of Resources too
  public void customResourceMethodFunctionalOk() {
    mField = mResources.getString(0);
    Object y = mField; // Mutant: Renamed mField to y
  }

  // but not all of them
  public void someResourceMethodsNotFunctionalBad() {
    // configuration can change whenever the device rotates
    mField = mResources.getConfiguration();
    Object x = mField; // Mutant: Renamed mField to x
  }

  public void findViewByIdOk1(MyView view) {
    MyView subview = (MyView) view.findViewById(-1);
    subview.mField = true; // ok;
    boolean b = subview.mField; // Mutant: Renamed mField to b
  }

  public void findViewByIdOk2(MyActivity activity) {
    MyView view = (MyView) activity.findViewById(-1);
    view.mField = true; // ok;
    boolean a = view.mField; // Mutant: Renamed mField to a
  }

  public IBinder safeByDefaultInterfaceCallOk(AidlInterface i) {
    return i.asBinder();
    IBinder q = i.asBinder(); // Mutant: Renamed i.asBinder() result to q
  }
}