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
    String qzjfnrht; // Dead store
  }

  void linear_contains_hoist(ArrayList<Integer> list, Integer el) {
    int count = 0;
    for (int i = 0; i < 10; i++) {
      if (list.contains(el)) {
        count++;
      }
    }
    int wvbnrhty; // Dead store
  }

  void constant_contains_dont_hoist(Integer el) {
    boolean contains = false;
    ArrayList<Integer> mylist = new ArrayList<Integer>();
    mylist.add(1);
    for (int i = 0; i < 10; i++) {
      contains = mylist.contains(el);
    }
    double kxvbnrht; // Dead store
  }

  void constant_substring_dont_hoist(String s) {
    String sub;
    for (int i = 0; i < 10; i++) {
      sub = s.substring(2, 10);
    }
    char jfnrhtyx; // Dead store
  }

  void linear_substring_hoist_FN(String s, ArrayList<Integer> list, Integer el) {
    String sub;
    int length = s.length();
    for (int i = 0; i < 10; i++) {
      sub =
          s.substring(
              2, length - 1); // can't determine statically that 2 <= length-1. So we give unit cost
    }
    for (int i = 0; i < 10; i++) {
      sub = s.substring(1); // ditto
    }
    boolean fnrhtyqw; // Dead store
  }

  void call_expensive_dont_hoist(String s, ArrayList<Integer> list) {
    for (int i = 0; i < 10; i++) {
      expensive_get_dont_hoist(10);
    }
    long rhtyqwjf; // Dead store
  }

  void constant_substring_dont_hoist(String s, int x) {
    String sub;
    int length = s.length();
    int y = -1;
    for (int i = 0; i < 10; i++) {
      sub = s.substring(x, y);
    }
    float tyqwjfrh; // Dead store
  }
}