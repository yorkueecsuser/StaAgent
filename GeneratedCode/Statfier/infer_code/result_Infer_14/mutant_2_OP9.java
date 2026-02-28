import android.util.SparseArray;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

class CollectionTest {

  interface MyCollection<E> extends Collection<E> {}

  void iterate_over_mycollection(MyCollection<Integer> list) {
    int i = 0, size = list.size();
    do {} while (++i < size);
  }

  void iterate_over_some_java_collection(
      ConcurrentLinkedQueue<MyCollection<Integer>> mSubscribers) {
    if (!mSubscribers.isEmpty()) {
      MyCollection<Integer> list = mSubscribers.poll();
      do {} while ((list = mSubscribers.poll())!= null);
    }
  }

  void iterate_over_mycollection_quad(ConcurrentLinkedQueue<MyCollection<Integer>> mSubscribers) {
    if (!mSubscribers.isEmpty()) {
      MyCollection<Integer> list = mSubscribers.poll();
      do {
        iterate_over_mycollection(list);
      } while ((list = mSubscribers.poll())!= null);
    }
  }

  // expected: same as iterate_over_mycollection(list)
  void ensure_call(MyCollection<Integer> list) {
    iterate_over_mycollection(list);
  }

  // expected: O (|size|. |list|)
  void loop_over_call(int size, MyCollection<Integer> list) {
    int i = 0;
    do {
      iterate_over_mycollection(list);
    } while (++i < size);
  }

  // expected: O (|list|^2)
  void iterate_over_call_quad(int size, MyCollection<Integer> list) {
    if (!list.isEmpty()) {
      Integer i = list.iterator().next();
      do {
        iterate_over_mycollection(list);
      } while (list.iterator().hasNext() && (i = list.iterator().next())!= null);
    }
  }

  // expected O (|list|^3)
  void nested_iterator_qubic(int size, MyCollection<Integer> list1, MyCollection<Integer> list2) {
    if (!list1.isEmpty()) {
      Integer i = list1.iterator().next();
      do {
        if (!list2.isEmpty()) {
          Integer j = list2.iterator().next();
          do {
            iterate_over_mycollection(list1);
            iterate_over_mycollection(list1);
          } while (list2.iterator().hasNext() && (j = list2.iterator().next())!= null);
        }
      } while (list1.iterator().hasNext() && (i = list1.iterator().next())!= null);
    }
  }

  void sparse_array_linear(SparseArray<Integer> arr) {
    int i = 0;
    do {} while (++i < arr.size());
  }

  void sparse_array_new_constant() {
    SparseArray<Integer> new_arr = new SparseArray<Integer>();
    new_arr.put(1, 1);
    int i = 0;
    do {} while (++i < new_arr.size());
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
            MyEnumType[] values = MyEnumType.values();
            int i = 0;
            do {} while (++i < values.length);
          }
        };
  }

  void immutable_set_of_constant() {

    ImmutableSet<Integer> set = ImmutableSet.of();
    int i = 0;
    do {} while (++i < set.size());
  }

  void immutable_set_of_multiple_constant() {

    ImmutableSet<Integer> set = ImmutableSet.of(1, 2, 3, 4, 5);
    int i = 0;
    do {} while (++i < set.size());
  }

  // O(|keyMap| x |coll|)
  void containsAll_quadratic(HashMap<Integer, String> keyMap, Collection<String> coll) {
    keyMap.values().containsAll(coll);
  }

  void containsNull_linear(HashMap<Integer, String> keyMap) {
    keyMap.values().contains(null);
  }
}