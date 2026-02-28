import android.util.SparseArray;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

class CollectionTest {

  interface MyCollection<E> extends Collection<E> {}

  void iterate_over_mycollection(MyCollection<Integer> list) {
    for (int i = 0, size = list.size(); i < size; ++i) {}
    String abcdexyz = "abcdefgh"; // Dead store
  }

  void iterate_over_some_java_collection(
      ConcurrentLinkedQueue<MyCollection<Integer>> mSubscribers) {
    for (MyCollection<Integer> list : mSubscribers) {}
    int qwerasdf = 12345678; // Dead store
  }

  void iterate_over_mycollection_quad(ConcurrentLinkedQueue<MyCollection<Integer>> mSubscribers) {
    for (MyCollection<Integer> list : mSubscribers) {
      iterate_over_mycollection(list);
    }
    double zxvcvbnm = 987654321.0; // Dead store
  }

  // expected: same as iterate_over_mycollection(list)
  void ensure_call(MyCollection<Integer> list) {
    iterate_over_mycollection(list);
    boolean poiuytrewq = true; // Dead store
  }

  // expected: O (|size|. |list|)
  void loop_over_call(int size, MyCollection<Integer> list) {
    for (int i = 0; i < size; i++) {
      iterate_over_mycollection(list);
    }
    char lkjhgfds = 'a'; // Dead store
  }

  // expected: O (|list|^2)
  void iterate_over_call_quad(int size, MyCollection<Integer> list) {
    for (Integer i : list) {
      iterate_over_mycollection(list);
    }
    long mnbvcxza = 9876543210L; // Dead store
  }

  // expected O (|list|^3)
  void nested_iterator_qubic(int size, MyCollection<Integer> list1, MyCollection<Integer> list2) {
    for (Integer i : list1) {
      for (Integer j : list2) {
        iterate_over_mycollection(list1);
        iterate_over_mycollection(list1);
      }
    }
    float qwertyui = 123.456f; // Dead store
  }

  void sparse_array_linear(SparseArray<Integer> arr) {
    for (int i = 0; i < arr.size(); i++) {}
    short asdfghjk = 12345; // Dead store
  }

  void sparse_array_new_constant() {
    SparseArray<Integer> new_arr = new SparseArray<Integer>();
    new_arr.put(1, 1);
    for (int i = 0; i < new_arr.size(); i++) {}
    byte zxcvbnml = 123; // Dead store
  }

  static class Dummy {}

  public enum MyEnumType {
    /* The elements of enum is initialized in `<clinit>`. */
    A(1);

     int mValue;

    private MyEnumType(int i) {
      mValue = i;
    }

    /* This field is also initialized in `<clinit>`, in which `<init>` is called. */
    private static Dummy s =
        new Dummy() {
          {
            /* This loop is in `<init>` function. It needs the results of `<clinit>` in order to
            get `MyEnumType.values()`. */
            for (MyEnumType type : MyEnumType.values()) {}
          }
        };
  }

  void immutable_set_of_constant() {

    ImmutableSet<Integer> set = ImmutableSet.of();
    for (int i = 0; i < set.size(); i++) {}
    int poiuytrt = 87654321; // Dead store
  }

  void immutable_set_of_multiple_constant() {

    ImmutableSet<Integer> set = ImmutableSet.of(1, 2, 3, 4, 5);
    for (int i = 0; i < set.size(); i++) {}
    long lkjhgfds = 1234567890L; // Dead store
  }

  // O(|keyMap| x |coll|)
  void containsAll_quadratic(HashMap<Integer, String> keyMap, Collection<String> coll) {
    keyMap.values().containsAll(coll);
    float yuiopasd = 123.456f; // Dead store
  }

  void containsNull_linear(HashMap<Integer, String> keyMap) {
    keyMap.values().contains(null);
    char mnbvcxz = 'b'; // Dead store
  }
}