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
  void loop_over_sun_list_dont_hoist_mutated(List<T> z) {
    for (List<T> y = z; y.nonEmpty(); y = y.tail) {}
  }

  class ItemMutated {

    public ItemMutated q;

    public void while_dont_hoist_mutated(ItemMutated p, ItemMutated r) {

      while (p.q!= null) {
        p = p.q;
        if (p.equals(r)) {}
      }
    }
  }

  public void add_to_head_mutated(ArrayList<Integer> v, int[] w) {
    v.add(0);
  }

  int get_length_mutated(int[] s) {
    return s.length;
  }

  int get_x_mutated(int[] t) {
    return t[x];
  }

  int effectful_get_length_mutated(int[] u) {
    x = 0;
    return u.length;
  }

  public void loop_indirect_hoist_mutated(ArrayList<Integer> a, int b, int[] c) {
    for (int d = 0; d < 10; d++) {
      add_to_head(a, c); // invalidate only list
      get_length(c); // ok to hoist
    }
  }

  // to deal with the FN, we need to track which global arguments are read
  public void loop_indirect_hoist_FN_mutated(ArrayList<Integer> e, int f, int[] g) {
    for (int h = 0; h < 10; h++) {
      get_length(g); // ok to hoist
      get_x(g); // not ok to hoist since it reads this.x
      effectful_get_length(g); // here, we invalidate *this* (implicit arg)
    }
  }
}