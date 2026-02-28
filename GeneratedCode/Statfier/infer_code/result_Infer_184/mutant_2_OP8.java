import com.sun.source.tree.Tree;
import com.sun.tools.javac.util.List;
import java.util.ArrayList;

class HoistInvalidate<T extends Tree> {

  int x = 0;
  // item will be invalidated
  void loop_over_sun_list_dont_hoist(List<T> list) {
    for (List<T> item = list; item.nonEmpty(); item = item.tail) {}
  }

  class Item {

    public Item next;

    public void while_dont_hoist(Item in1, Item in2) {

      while (in1.next!= null) {
        in1 = in1.next;
        if (in1.equals(in2)) {}
      }
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
    for (int i = 0; i < 10; i++) {
      add_to_head(list, array); // invalidate only list
      get_length(array); // ok to hoist
    }
  }

  // to deal with the FN, we need to track which global arguments are read
  public void loop_indirect_hoist_FN(ArrayList<Integer> list, int x, int[] array) {
    for (int i = 0; i < 10; i++) {
      get_length(array); // ok to hoist
      get_x(array); // not ok to hoist since it reads this.x
      effectful_get_length(array); // here, we invalidate *this* (implicit arg)
    }
  }

  // Mutated code
  void loop_over_sun_list_dont_hoist_m(List<T> a) {
    for (List<T> b = a; b.nonEmpty(); b = b.tail) {}
  }

  class Item_m {

    public Item_m c;

    public void while_dont_hoist_m(Item_m d, Item_m e) {

      while (d.c!= null) {
        d = d.c;
        if (d.equals(e)) {}
      }
    }
  }

  public void add_to_head_m(ArrayList<Integer> f, int[] g) {
    f.add(0);
  }

  int get_length_m(int[] h) {
    return h.length;
  }

  int get_x_m(int[] i) {
    return i[x];
  }

  int effectful_get_length_m(int[] j) {
    x = 0;
    return j.length;
  }

  public void loop_indirect_hoist_m(ArrayList<Integer> k, int l, int[] m) {
    for (int n = 0; n < 10; n++) {
      add_to_head(k, m); // invalidate only list
      get_length(m); // ok to hoist
    }
  }

  // to deal with the FN, we need to track which global arguments are read
  public void loop_indirect_hoist_FN_m(ArrayList<Integer> o, int p, int[] q) {
    for (int r = 0; r < 10; r++) {
      get_length(q); // ok to hoist
      get_x(q); // not ok to hoist since it reads this.x
      effectful_get_length(q); // here, we invalidate *this* (implicit arg)
    }
  }
}