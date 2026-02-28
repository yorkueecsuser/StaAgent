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

    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      mView.setVisibility(View.VISIBLE);
    } else {
      // This block will always execute
      mView.setVisibility(View.GONE);
    }

    return container;
  }

  @Override
  public void onDestroyView() {
    // not nulling out anything
  }

  // Method to simulate a condition that always returns false
  private boolean getCondition() {
    return false;
  }
}