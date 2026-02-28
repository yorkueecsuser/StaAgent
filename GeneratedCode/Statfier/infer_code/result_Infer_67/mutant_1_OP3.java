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
    
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      mView.setBackgroundColor(0xFF00FF00); // Setting background color to green
    }
    
    return container;
  }

  @Override
  public void onDestroyView() {
    // not nulling out anything
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}