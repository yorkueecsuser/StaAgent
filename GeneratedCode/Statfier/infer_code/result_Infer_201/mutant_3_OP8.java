import com.google.common.base.Preconditions;
import java.util.ArrayList;

class PreconditionTest {
  // should be constant
  public void checkArgument_constant(ArrayList<Integer> list) {
    Preconditions.checkArgument(list.size() == 2);
    for (int i = 0; i < list.size(); i++) {}
    
    // Mutant
    ArrayList<Integer> x = list;
    for (int j = 0; j < x.size(); j++) {}
  }

  // should be constant
  public void checkState_constant(ArrayList<Integer> list) {
    Preconditions.checkState(list.size() == 2);
    for (int i = 0; i < list.size(); i++) {}
    
    // Mutant
    ArrayList<Integer> y = list;
    for (int k = 0; k < y.size(); k++) {}
  }

  class Constant {
    public static final int FIVE = 5;
  }

  // should be constant
  static void constant_array(int[] a) {
    Preconditions.checkArgument(a.length == Constant.FIVE);
    for (int i : a) {
      Preconditions.checkArgument(i >= 0);
    }
    
    // Mutant
    int[] b = a;
    for (int c : b) {
      Preconditions.checkArgument(c >= 0);
    }
  }

  public void checkNotNull_linear(ArrayList<Integer> list, Object o) {
    ArrayList<Integer> mediaList = Preconditions.checkNotNull(list, o);
    for (Integer el : mediaList) {}
    
    // Mutant
    ArrayList<Integer> z = mediaList;
    for (Integer w : z) {}
  }
}