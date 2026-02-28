import java.util.ArrayList;
import javax.inject.*;

class HoistModeled {

  @Inject private Provider<Integer> mProvider;

  void expensive_get_dont_hoist(int size) {
    int i = 0;
    do {
      mProvider.get(); // this could be expensive depending on the
      // type of the provider which we cannot
      // detect. Hence, we consider this as cheap for
      // now.
      i++;
    } while (i < size);
  }

  void linear_contains_hoist(ArrayList<Integer> list, Integer el) {
    int count = 0;
    int i = 0;
    do {
      if (list.contains(el)) {
        count++;
      }
      i++;
    } while (i < 10);
  }

  void constant_contains_dont_hoist(Integer el) {
    boolean contains = false;
    ArrayList<Integer> mylist = new ArrayList<Integer>();
    mylist.add(1);
    int i = 0;
    do {
      contains = mylist.contains(el);
      i++;
    } while (i < 10);
  }

  void constant_substring_dont_hoist(String s) {
    String sub;
    int i = 0;
    do {
      sub = s.substring(2, 10);
      i++;
    } while (i < 10);
  }

  void linear_substring_hoist_FN(String s, ArrayList<Integer> list, Integer el) {
    String sub;
    int length = s.length();
    int i = 0;
    do {
      sub =
          s.substring(
              2, length - 1); // can't determine statically that 2 <= length-1. So we give unit cost
      i++;
    } while (i < 10);
    i = 0;
    do {
      sub = s.substring(1); // ditto
      i++;
    } while (i < 10);
  }

  void call_expensive_dont_hoist(String s, ArrayList<Integer> list) {
    int i = 0;
    do {
      expensive_get_dont_hoist(10);
      i++;
    } while (i < 10);
  }

  void constant_substring_dont_hoist(String s, int x) {
    String sub;
    int length = s.length();
    int y = -1;
    int i = 0;
    do {
      sub = s.substring(x, y);
      i++;
    } while (i < 10);
  }
}