import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

class FragmentDoesNotRetainViewExample extends Fragment {

  class CustomView extends ListView {

    public CustomView(Context c) {
      super(c);
    }
  }

  View mView1;
  View mView2;
  ViewGroup mViewSubclass;
  CustomView mCustomView;
  @AutoCleanup View mWillBeCleanedUp;

  boolean b;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
    mView1 = inflater.inflate(-1, container, false);
    mView2 = inflater.inflate(-1, container, false);
    mViewSubclass = (ViewGroup) inflater.inflate(-1, container, false);
    mCustomView = (CustomView) inflater.inflate(-1, container, false);
    mWillBeCleanedUp = inflater.inflate(-1, container, false);
    return container;
  }

  @Override
  public void onDestroyView() {
    mView1 = null;
    if (b) {
      mView2 = null; // conditional nulling is still ok
    }
    mCustomView = null;
    mViewSubclass = null;
  }

  // Mutated code
  View x;
  View y;
  ViewGroup z;
  CustomView w;
  @AutoCleanup View v;

  boolean c;

  @Override
  public View onCreateView(LayoutInflater a, ViewGroup d, Bundle e) {
    x = a.inflate(-1, d, false);
    y = a.inflate(-1, d, false);
    z = (ViewGroup) a.inflate(-1, d, false);
    w = (CustomView) a.inflate(-1, d, false);
    v = a.inflate(-1, d, false);
    return d;
  }

  @Override
  public void onDestroyView() {
    x = null;
    if (c) {
      y = null; // conditional nulling is still ok
    }
    w = null;
    z = null;
  }
}