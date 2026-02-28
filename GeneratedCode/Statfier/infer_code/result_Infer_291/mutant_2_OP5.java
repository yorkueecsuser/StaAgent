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

    // Introduced unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 1:
        mField = "This is unreachable";
        break;
      case 2:
        mField = "This is also unreachable";
        break;
    }
  }

  // and subclasses of Resources too
  public void customResourceMethodFunctionalOk() {
    mField = mResources.getString(0);

    // Introduced unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 1:
        mField = "This is unreachable";
        break;
      case 2:
        mField = "This is also unreachable";
        break;
    }
  }

  // but not all of them
  public void someResourceMethodsNotFunctionalBad() {
    // configuration can change whenever the device rotates
    mField = mResources.getConfiguration();

    // Introduced unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 1:
        mField = "This is unreachable";
        break;
      case 2:
        mField = "This is also unreachable";
        break;
    }
  }

  public void findViewByIdOk1(MyView view) {
    MyView subview = (MyView) view.findViewById(-1);
    subview.mField = true; // ok;

    // Introduced unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 1:
        subview.mField = false;
        break;
      case 2:
        subview.mField = true;
        break;
    }
  }

  public void findViewByIdOk2(MyActivity activity) {
    MyView view = (MyView) activity.findViewById(-1);
    view.mField = true; // ok;

    // Introduced unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 1:
        view.mField = false;
        break;
      case 2:
        view.mField = true;
        break;
    }
  }

  public IBinder safeByDefaultInterfaceCallOk(AidlInterface i) {
    return i.asBinder();

    // Introduced unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 1:
        return null;
      case 2:
        return i.asBinder();
    }
    return null;
  }

  // Method to provide a dynamically determined condition for unreachable code
  private int getUnreachableCondition() {
    return 0; // This ensures the switch statement is unreachable
  }
}