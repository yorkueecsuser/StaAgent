import android.util.SparseArray;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

class CollectionTest {

  interface MyCollection<E> extends Collection<E> {}

  void iterate_over_mycollection(MyCollection<Integer> list) {
    for (int i = 0, size = list.size(); i < size; ++i) {}
    for (int a = 0, b = list.size(); a < b; ++a) {} // Mutant: Renamed 'i' to 'a' and'size' to 'b'
  }

  void iterate_over_some_java_collection(
      ConcurrentLinkedQueue<MyCollection<Integer>> mSubscribers) {
    for (MyCollection<Integer> list : mSubscribers) {}
    for (MyCollection<Integer> c : mSubscribers) {} // Mutant: Renamed 'list' to 'c'
  }

  void iterate_over_mycollection_quad(ConcurrentLinkedQueue<MyCollection<Integer>> mSubscribers) {
    for (MyCollection<Integer> list : mSubscribers) {
      iterate_over_mycollection(list);
    }
    for (MyCollection<Integer> d : mSubscribers) { // Mutant: Renamed 'list' to 'd'
      iterate_over_mycollection(d);
    }
  }

  // expected: same as iterate_over_mycollection(list)
  void ensure_call(MyCollection<Integer> list) {
    iterate_over_mycollection(list);
    iterate_over_mycollection(list); // No additional mutant needed here as per requirements
  }

  // expected: O (|size|. |list|)
  void loop_over_call(int size, MyCollection<Integer> list) {
    for (int i = 0; i < size; i++) {
      iterate_over_mycollection(list);
    }
    for (int e = 0; e < size; e++) { // Mutant: Renamed 'i' to 'e'
      iterate_over_mycollection(list);
    }
  }

  // expected: O (|list|^2)
  void iterate_over_call_quad(int size, MyCollection<Integer> list) {
    for (Integer i : list) {
      iterate_over_mycollection(list);
    }
    for (Integer f : list) { // Mutant: Renamed 'i' to 'f'
      iterate_over_mycollection(list);
    }
  }

  // expected O (|list|^3)
  void nested_iterator_qubic(int size, MyCollection<Integer> list1, MyCollection<Integer> list2) {
    for (Integer i : list1) {
      for (Integer j : list2) {
        iterate_over_mycollection(list1);
        iterate_over_mycollection(list1);
      }
    }
    for (Integer g : list1) { // Mutant: Renamed 'i' to 'g'
      for (Integer h : list2) { // Mutant: Renamed 'j' to 'h'
        iterate_over_mycollection(list1);
        iterate_over_mycollection(list1);
      }
    }
  }

  void sparse_array_linear(SparseArray<Integer> arr) {
    for (int i = 0; i < arr.size(); i++) {}
    for (int k = 0; k < arr.size(); k++) {} // Mutant: Renamed 'i' to 'k'
  }

  void sparse_array_new_constant() {
    SparseArray<Integer> new_arr = new SparseArray<Integer>();
    new_arr.put(1, 1);
    for (int i = 0; i < new_arr.size(); i++) {}
    for (int l = 0; l < new_arr.size(); l++) {} // Mutant: Renamed 'i' to 'l'
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
            for (MyEnumType t : MyEnumType.values()) {} // Mutant: Renamed 'type' to 't'
          }
        };
  }

  void immutable_set_of_constant() {

    ImmutableSet<Integer> set = ImmutableSet.of();
    for (int i = 0; i < set.size(); i++) {}
    for (int m = 0; m < set.size(); m++) {} // Mutant: Renamed 'i' to'm'
  }

  void immutable_set_of_multiple_constant() {

    ImmutableSet<Integer> set = ImmutableSet.of(1, 2, 3, 4, 5);
    for (int i = 0; i < set.size(); i++) {}
    for (int n = 0; n < set.size(); n++) {} // Mutant: Renamed 'i' to 'n'
  }

  // O(|keyMap| x |coll|)
  void containsAll_quadratic(HashMap<Integer, String> keyMap, Collection<String> coll) {
    keyMap.values().containsAll(coll);
    keyMap.values().containsAll(coll); // No additional mutant needed here as per requirements
  }

  void containsNull_linear(HashMap<Integer, String> keyMap) {
    keyMap.values().contains(null);
    keyMap.values().contains(null); // No additional mutant needed here as per requirements
  }
}