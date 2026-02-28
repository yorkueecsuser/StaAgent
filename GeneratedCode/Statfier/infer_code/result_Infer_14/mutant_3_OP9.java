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
    ConcurrentLinkedQueue<MyCollection<Integer>>.Iterator iterator = mSubscribers.iterator();
    do {
      if (!iterator.hasNext()) break;
      MyCollection<Integer> list = iterator.next();
    } while (true);
  }

  void iterate_over_mycollection_quad(ConcurrentLinkedQueue<MyCollection<Integer>> mSubscribers) {
    ConcurrentLinkedQueue<MyCollection<Integer>>.Iterator iterator = mSubscribers.iterator();
    do {
      if (!iterator.hasNext()) break;
      MyCollection<Integer> list = iterator.next();
      iterate_over_mycollection(list);
    } while (true);
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
    java.util.Iterator<Integer> iterator = list.iterator();
    do {
      if (!iterator.hasNext()) break;
      Integer i = iterator.next();
      iterate_over_mycollection(list);
    } while (true);
  }

  // expected O (|list|^3)
  void nested_iterator_qubic(int size, MyCollection<Integer> list1, MyCollection<Integer> list2) {
    java.util.Iterator<Integer> iterator1 = list1.iterator();
    do {
      if (!iterator1.hasNext()) break;
      Integer i = iterator1.next();
      java.util.Iterator<Integer> iterator2 = list2.iterator();
      do {
        if (!iterator2.hasNext()) break;
        Integer j = iterator2.next();
        iterate_over_mycollection(list1);
        iterate_over_mycollection(list1);
      } while (true);
    } while (true);
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
            int i = 0;
            do {
              if (i >= MyEnumType.values().length) break;
              MyEnumType type = MyEnumType.values()[i++];
            } while (true);
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