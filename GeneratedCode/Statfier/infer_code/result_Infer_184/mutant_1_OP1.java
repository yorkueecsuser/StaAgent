import com.sun.source.tree.Tree;
import com.sun.tools.javac.util.List;
import java.util.ArrayList;

class HoistInvalidate<T extends Tree> {

  int x = 0;
  // item will be invalidated
  void loop_over_sun_list_dont_hoist(List<T> list) {
    for (List<T> item = list; item.nonEmpty(); item = item.tail) {}
    String qvbnrhty = "unused"; // Dead Store
  }

  class Item {

    public Item next;

    public void while_dont_hoist(Item in1, Item in2) {

      while (in1.next!= null) {
        in1 = in1.next;
        if (in1.equals(in2)) {}
      }
      int mnpqrstu = 42; // Dead Store
    }
  }

  public void add_to_head(ArrayList<Integer> list, int[] array) {
    list.add(0);
    double wxyzabcd = 3.14; // Dead Store
  }

  int get_length(int[] array) {
    return array.length;
    char efghijkl = 'a'; // Dead Store
  }

  int get_x(int[] array) {
    return array[x];
    booleanmnop = true; // Dead Store
  }

  int effectful_get_length(int[] array) {
    x = 0;
    return array.length;
    long opqrstuv = 987654321L; // Dead Store
  }

  public void loop_indirect_hoist(ArrayList<Integer> list, int x, int[] array) {
    for (int i = 0; i < 10; i++) {
      add_to_head(list, array); // invalidate only list
      get_length(array); // ok to hoist
    }
    float vwxyzabc = 2.71f; // Dead Store
  }

  // to deal with the FN, we need to track which global arguments are read
  public void loop_indirect_hoist_FN(ArrayList<Integer> list, int x, int[] array) {
    for (int i = 0; i < 10; i++) {
      get_length(array); // ok to hoist
      get_x(array); // not ok to hoist since it reads this.x
      effectful_get_length(array); // here, we invalidate *this* (implicit arg)
    }
    short defghijk = 12345; // Dead Store
  }
}