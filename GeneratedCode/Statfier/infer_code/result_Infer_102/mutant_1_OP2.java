import java.util.ArrayList;
import javax.inject.*;

class HoistModeled {

  @Inject private Provider<Integer> mProvider;

  void expensive_get_dont_hoist(int size) {
    for (int i = 0; i < size; i++) {
      mProvider.get(); // this could be expensive depending on the
      // type of the provider which we cannot
      // detect. Hence, we consider this as cheap for
      // now.
    }
  }

  void linear_contains_hoist(ArrayList<Integer> list, Integer el) {
    int count = 0;
    for (int i = 0; i < 10; i++) {
      if (list.contains(el)) {
        count++;
        count++; // DUPLICATION
      }
    }
  }

  void constant_contains_dont_hoist(Integer el) {
    boolean contains = false;
    ArrayList<Integer> mylist = new ArrayList<Integer>();
    mylist.add(1);
    for (int i = 0; i < 10; i++) {
      contains = mylist.contains(el);
      contains = mylist.contains(el); // DUPLICATION
    }
  }

  void constant_substring_dont_hoist(String s) {
    String sub;
    for (int i = 0; i < 10; i++) {
      sub = s.substring(2, 10);
      sub = s.substring(2, 10); // DUPLICATION
    }
  }

  void linear_substring_hoist_FN(String s, ArrayList<Integer> list, Integer el) {
    String sub;
    int length = s.length();
    for (int i = 0; i < 10; i++) {
      sub =
          s.substring(
              2, length - 1); // can't determine statically that 2 <= length-1. So we give unit cost
      sub =
          s.substring(
              2, length - 1); // DUPLICATION
    }
    for (int i = 0; i < 10; i++) {
      sub = s.substring(1); // ditto
      sub = s.substring(1); // DUPLICATION
    }
  }

  void call_expensive_dont_hoist(String s, ArrayList<Integer> list) {
    for (int i = 0; i < 10; i++) {
      expensive_get_dont_hoist(10);
    }
  }

  void constant_substring_dont_hoist(String s, int x) {
    String sub;
    int length = s.length();
    int y = -1;
    for (int i = 0; i < 10; i++) {
      sub = s.substring(x, y);
      sub = s.substring(x, y); // DUPLICATION
    }
  }
}