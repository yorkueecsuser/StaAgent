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
  View a;
  View c;
  ViewGroup d;
  CustomView e;
  @AutoCleanup View f;

  boolean g;

  @Override
  public View x(LayoutInflater h, ViewGroup i, Bundle j) {
    a = h.inflate(-1, i, false);
    c = h.inflate(-1, i, false);
    d = (ViewGroup) h.inflate(-1, i, false);
    e = (CustomView) h.inflate(-1, i, false);
    f = h.inflate(-1, i, false);
    return i;
  }

  @Override
  public void y() {
    a = null;
    if (g) {
      c = null; // conditional nulling is still ok
    }
    e = null;
    d = null;
  }
}