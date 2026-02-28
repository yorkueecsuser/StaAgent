import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

class FragmentRetainsViewExample extends Fragment {

  class CustomView extends ListView {

    public CustomView(Context c) {
      super(c);
    }
  }

  View mView;
  ViewGroup mViewSubclass;
  CustomView mCustomView;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
    mView = inflater.inflate(-1, container, false);
    mViewSubclass = (ViewGroup) inflater.inflate(-1, container, false);
    mCustomView = (CustomView) inflater.inflate(-1, container, false);
    
    // Introduced unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        // This case will never be executed
        mView.setVisibility(View.GONE);
        break;
      default:
        // Default case will also never be executed due to the nature of alwaysFalse
        mView.setVisibility(View.VISIBLE);
        break;
    }
    
    return container;
  }

  private boolean getCondition() {
    return false;
  }

  @Override
  public void onDestroyView() {
    // not nulling out anything
  }
}