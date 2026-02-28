import com.sun.source.tree.Tree;
import com.sun.tools.javac.util.List;
import java.util.ArrayList;

class HoistInvalidate<T extends Tree> {

  int x = 0;
  // item will be invalidated
  void loop_over_sun_list_dont_hoist(List<T> list) {
    List<T> item = list;
    do {
      item = item.tail;
    } while (item.nonEmpty());
  }

  class Item {

    public Item next;

    public void while_dont_hoist(Item in1, Item in2) {
      do {
        in1 = in1.next;
        if (in1.equals(in2)) {}
      } while (in1.next!= null);
    }
  }

  public void add_to_head(ArrayList<Integer> list, int[] array) {
    list.add(0);
  }

  int get_length(int[] array) {
    return array.length;
  }

  int get_x(int[] array) {
    return array[x];
  }

  int effectful_get_length(int[] array) {
    x = 0;
    return array.length;
  }

  public void loop_indirect_hoist(ArrayList<Integer> list, int x, int[] array) {
    int i = 0;
    do {
      add_to_head(list, array); // invalidate only list
      get_length(array); // ok to hoist
      i++;
    } while (i < 10);
  }

  // to deal with the FN, we need to track which global arguments are read
  public void loop_indirect_hoist_FN(ArrayList<Integer> list, int x, int[] array) {
    int i = 0;
    do {
      get_length(array); // ok to hoist
      get_x(array); // not ok to hoist since it reads this.x
      effectful_get_length(array); // here, we invalidate *this* (implicit arg)
      i++;
    } while (i < 10);
  }
}